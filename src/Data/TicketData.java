/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Control.Butaca;
import Control.Cliente;
import Control.Proyeccion;
import Control.Sala;
import Control.Ticket;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fermin
 */
public class TicketData {
    private Connection con;
    ClienteData cd;
    ProyeccionData pd;
    ButacaData bd;
    SalaData sd;

    public TicketData() {
        this.con = Conexion.getConexion();
        cd = new ClienteData();
        pd = new ProyeccionData();
        bd = new ButacaData();
        sd = new SalaData();
    }
    
    public void agregarTick(Ticket t){
    String sql ="INSERT INTO ticket( idCliente, idProyeccion, idButaca, fechaCompra, precioTicket, formaDePago, estadoTic) VALUES (?,?,?,?,?,?,?)";
    
    try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,t.getIdCliente().getIdCliente());
            ps.setInt(2,t.getIdProyeccion().getIdProyeecion());
            ps.setInt(3,t.getIdButaca().getIdButaca());
            ps.setTimestamp(4, t.getFechaCompra());
            ps.setDouble(5,t.getPrecioTicket());
            ps.setString(6,t.getFomaDePago());
            ps.setBoolean(7,t.isEstadoTic());
            
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                t.setIdTicket(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ticket Agregagado");
            }
            ps.close();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, Ticket no Agregagado " + ex );
        }
    }
    
    public void eleminarTicket(int idTicket){
        String sql = "UPDATE ticket SET estadoTic = false WHERE idTicket = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idTicket);
            
            if (ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Ticket Eliminado Exitosamiente");
            }else{
                JOptionPane.showMessageDialog(null, "Ticket no Eliminado ");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se pudo Eliminar Ticket " + ex);
        }
    }
    
    public void modificarTicket(int idCliente,int idProyeccion,int idButaca,Timestamp fechaCompra,double precioTicket,String formaDePago,boolean estadoTic, int idTicket){
        String sql = "UPDATE ticket SET idCliente=?,idProyeccion=?,idButaca=?,fechaCompra=?,precioTicket=?,formaDePago=?,estadoTic=? WHERE idTicket = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCliente);
            ps.setInt(2,idProyeccion);
            ps.setInt(3,idButaca);
            ps.setTimestamp(4, fechaCompra);
            ps.setDouble(5,precioTicket);
            ps.setString(6,formaDePago);
            ps.setBoolean(7,estadoTic);
            ps.setInt(8,idTicket);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Ticket Modificado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe el Ticket");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Ticket " + ex);
        }
    }
    
    public Ticket buscarTicket(int idTicket){
        Ticket t = null;

        String sql = "SELECT * FROM ticket WHERE idticket = ? AND estadoTic = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idTicket);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                t = new Ticket();

                t.setIdTicket(rs.getInt("idTicket"));
                Cliente c = cd.buscarCliente(rs.getInt("idCliente"));
                t.setIdCliente(c);
                Proyeccion p = pd.buscarProyeccion(rs.getInt("idProyeccion"));
                t.setIdProyeccion(p);
                Butaca b = bd.buscarButaca(rs.getInt("isButaca"));
                t.setIdButaca(b);
                t.setFechaCompra(rs.getTimestamp("fechaCompra"));
                t.setPrecioTicket(rs.getDouble("precioTicket"));
                t.setFomaDePago(rs.getString("formaDePago"));
                t.setEstadoTic(rs.getBoolean("estadoTic"));
            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR"+exception.getMessage());
        }
        return t;
    }
    
    public List<Ticket> listarTicket(){
        ArrayList<Ticket> listarTicket = new ArrayList<>();
        
        String sql = "SELECT * FROM ticket WHERE estadoTic = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {     
                Ticket t = new Ticket();
                t.setIdTicket(rs.getInt("idTicket"));
                Cliente c = cd.buscarCliente(rs.getInt("idCliente"));
                t.setIdCliente(c);
                Proyeccion p = pd.buscarProyeccion(rs.getInt("idProyeccion"));
                t.setIdProyeccion(p);
                Butaca b = bd.buscarButaca(rs.getInt("idButaca"));
                t.setIdButaca(b);
                t.setFechaCompra(rs.getTimestamp("fechaCompra"));
                t.setPrecioTicket(rs.getDouble("precioTicket"));
                t.setFomaDePago(rs.getString("formaDePago"));
                t.setEstadoTic(rs.getBoolean("estadoTic"));
                
                listarTicket.add(t);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarTicket;
    }
    
    public Butaca butacasLibre(Butaca b){

        String sql = "SELECT  t.idButaca from butaca b, proyeccion p, sala s, ticket t \n" +
"WHERE t.idProyeccion=p.idProyeccion and t.idButaca= b.idButaca and p.idSala = s.idSala and s.idSala=b.idSala\n" +
"and p.incioProy BETWEEN '2022-11-02 00:00:00' AND '2022-11-02 12:00:00' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setInt(1,idButaca);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                b = new Butaca();

                b.setIdButaca(rs.getInt("idButaca"));
                Sala s = sd.buscarSala(rs.getInt("idSala"));
                b.setSala(s);
                b.setFila(rs.getString("fila"));
                b.setColumna(rs.getInt("columna"));


            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR"+exception.getMessage());
        }
        return b;
    }
    
}

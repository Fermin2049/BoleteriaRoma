/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Control.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fermin
 */
public class ClienteData {
    private Connection con;
    
    public ClienteData(){
        this.con = Conexion.getConexion();
    }
    
    public void agregarCliente( Cliente c){
        String sql = "INSERT INTO cliente( nombreCli, apellidoCli, dniCli, estadoCli) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,c.getNombreCli());
            ps.setString(2,c.getApellidoCli());
            ps.setInt(3,c.getDniCli());
            ps.setBoolean(4,c.isEstadoCli());
            
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                c.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente Agregagado");
            }
            ps.close();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, Cliente no Agregagado " + ex );
        }
    }
    
    public void eliminarCliente(int idCliente){
        String sql = "UPDATE cliente SET estadoCli = false WHERE idCliente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCliente);
            
            if (ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Cliete Eliminado Exitosamiente");
            }else{
                JOptionPane.showMessageDialog(null, "Cliete no Eliminado ");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se pudo Eliminar al Cliente " + ex);
        }
    }

    public void modificarCliente(String nombreCli,String apellidoCli,int dniCli,boolean estadoCli,int IdCliente) {
        String sql = "UPDATE cliente SET nombreCli = ?,apellidoCli = ?,dniCli = ?,estadoCli = ? WHERE idCliente = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombreCli);
            ps.setString(2, apellidoCli);
            ps.setInt(3, dniCli);
            ps.setBoolean(4, estadoCli);
            ps.setInt(5, IdCliente);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Modificado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe el Cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Cliente" + ex);
        }

    }    
    
    public void modificarCliente(Cliente c) {
        String sql = "UPDATE cliente SET nombreCli = ?,apellidoCli = ?,dniCli = ?,estadoCli = ? WHERE idCliente = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombreCli());
            ps.setString(2, c.getApellidoCli());
            ps.setInt(3, c.getDniCli());
            ps.setBoolean(4, c.isEstadoCli());
            ps.setInt(5, c.getIdCliente());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente Modificado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe el Cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Cliente" + ex);
        }

    }
    
    public Cliente buscarCliente(int idCliente){
        Cliente c = null;
        String sql = "SELECT * FROM cliente WHERE idCliente = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idCliente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c = new Cliente();

                c.setIdCliente(rs.getInt("idCliente"));
                c.setNombreCli(rs.getString("nombreCli"));
                c.setApellidoCli(rs.getString("apellidoCli"));
                c.setDniCli(rs.getInt("dniCli"));
                c.setEstadoCli(rs.getBoolean("estadoCli"));

            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR"+exception.getMessage());
        }
        return c;
    }
    
    
    
    public List<Cliente> listarCliente(){
        ArrayList<Cliente> listarCliente = new ArrayList<>();
        
        String sql = "SELECT * FROM cliente WHERE estadoCli = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNombreCli(rs.getString("nombreCli"));
                c.setApellidoCli(rs.getString("apellidoCli"));
                c.setDniCli(rs.getInt("dniCli"));
                c.setEstadoCli(rs.getBoolean("estadoCli"));
                
                listarCliente.add(c);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarCliente;
    }
    
    public List<Cliente> listarAllCliente(){
        ArrayList<Cliente> listarCliente = new ArrayList<>();
        
        String sql = "SELECT * FROM cliente";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Cliente c = new Cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNombreCli(rs.getString("nombreCli"));
                c.setApellidoCli(rs.getString("apellidoCli"));
                c.setDniCli(rs.getInt("dniCli"));
                c.setEstadoCli(rs.getBoolean("estadoCli"));
                
                listarCliente.add(c);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Cliente" + ex);
        }
        
        return listarCliente;
    }
            
        
    
}

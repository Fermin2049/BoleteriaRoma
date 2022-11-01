/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Control.Butaca;
import Control.Sala;
import java.sql.Connection;
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
public class ButacaData {
    private Connection con;
    SalaData sd;

    public ButacaData() {
        this.con = Conexion.getConexion();
        sd = new SalaData();
    }
    
    public void agregarButaca(Butaca b){
        String sql = "INSERT INTO butaca(idSala, fila, columna) VALUES (? ,? ,? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,b.getSala().getIdSala());
            ps.setString(2,b.getFila());
            ps.setInt(3,b.getColumna());

            
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                b.setIdButaca(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Butaca Agregagada");
            }
            ps.close();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, Butaca no Agregagada " + ex );
        }
    }
    
    public void modificarButaca(int idSala,String fila,int columna,int idButaca){
        String sql = "UPDATE butaca SET idSala = ?,fila = ?,columna = ? WHERE idButaca = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSala);
            ps.setString(2, fila);
            ps.setInt(3, columna);
            ps.setInt(4, idButaca);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Butaca Modificada Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe la Butaca");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Butaca" + ex);
        }
    }
    
    public void modificarButaca(Butaca b){
        String sql = "UPDATE butaca SET idSala = ?,fila = ?,columna = ? WHERE idButaca = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, b.getSala().getIdSala());
            ps.setString(2, b.getFila());
            ps.setInt(3, b.getColumna());
            ps.setInt(4, b.getIdButaca());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Butaca Modificada Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe la Butaca");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Butaca" + ex);
        }
    }
    
    public void ocuparButaca(){
        
    }
    
    public Butaca buscarButaca(int idButaca){
        Butaca b = null;
        String sql = "SELECT * FROM butaca WHERE idButaca = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idButaca);
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
    
    public List<Butaca> listarButaca(){
        ArrayList<Butaca> listarButaca = new ArrayList<>();
        
        String sql = "SELECT * FROM butaca ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Butaca b = new Butaca();
                b.setIdButaca(rs.getInt("idButaca"));
                Sala s = sd.buscarSala(rs.getInt("idSala"));
                b.setSala(s);
                b.setFila(rs.getString("fila"));
                b.setColumna(rs.getInt("columna"));
                
                listarButaca.add(b);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarButaca;
    }
    
    
    
//SELECT  t.idButaca from butaca b, proyeccion p, sala s, tiket t 
//WHERE t.idProyeccion=p.idProyeccion and t.idButaca= b.idButaca and p.idSala = s.idSala and s.idSala=b.idSala
//and p.inicioPro BETWEEN '2022-10-27 16:00:00' AND '2022-10-27 18:00:00'
    
//SELECT pelicula.nombrePel, proyeccion.incioProy, proyeccion.finProy,proyeccion.idSala,proyeccion.idProyeccion 
//FROM proyeccion, pelicula 
//WHERE proyeccion.idPelicula = pelicula.idPelicula
//AND incioProy >= now()
//AND proyeccion.estadoProy = 1
//ORDER BY incioProy
    
  }
    


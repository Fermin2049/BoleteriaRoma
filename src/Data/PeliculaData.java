/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Control.Pelicula;
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
public class PeliculaData {
    private Connection con;

    public PeliculaData() {
        this.con = Conexion.getConexion();
    }
    
    public void agregarPelicula(Pelicula p){
        String sql = "INSERT INTO pelicula(nombrePel, estadoPel) VALUES (?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,p.getNombrePel());
            ps.setBoolean(2,p.isEstadoPel());
            
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                p.setIdPelicula(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pelicula Agregagada");
            }
            ps.close();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, Pelicula no Agregagado " + ex );
        }
    }
    
    public void eliminarPelicula(int idPelicula){
        String sql = "UPDATE pelicula SET estadoPel = false WHERE idPelicula = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idPelicula);
            
            if (ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Pelicula Eliminada Exitosamiente");
            }else{
                JOptionPane.showMessageDialog(null, "Pelicula no Eliminada ");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se pudo Eliminar Pelicula " + ex);
        }
    }
    
    public void modificarPelicula(String nombrePel,boolean estadoPel,int idPelicula){
        String sql = "UPDATE pelicula SET nombrePel = ?,estadoPel = ? WHERE IdPelicula= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombrePel);
            ps.setBoolean(2, estadoPel);
            ps.setInt(3, idPelicula);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Pelicula Modificada Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe la Pelicula");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Pelicula" + ex);
        }
    }
    
    public Pelicula buscarPelicula(int idPelicula){
        
        Pelicula p = null;
        String sql = "SELECT * FROM pelicula WHERE idPelicula = ? AND estadoPel = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idPelicula);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p = new Pelicula();

                p.setIdPelicula(rs.getInt("idPelicula"));
                p.setNombrePel(rs.getString("nombrePel"));
                p.setEstadoPel(rs.getBoolean("estadoPel"));

            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR"+exception.getMessage());
        }
        return p;
    }
    
    public List<Pelicula> listarPelicula(){
        ArrayList<Pelicula> listarPelicula = new ArrayList<>();
        
        String sql = "SELECT * FROM pelicula WHERE estadoPel = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Pelicula p = new Pelicula();
                p.setIdPelicula(rs.getInt("idPelicula"));
                p.setNombrePel(rs.getString("nombrePel"));
                p.setEstadoPel(rs.getBoolean("estadoPel"));
                
                listarPelicula.add(p);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarPelicula;
    }
    
    
}

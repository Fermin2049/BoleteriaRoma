/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

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
public class SalaData {
    private Connection con;

    public SalaData() {
        this.con = Conexion.getConexion();
    }
    
    public void agregarSala(Sala s){
        String sql = "INSERT INTO sala(ubicacion, tipoSala, localidad, estadoSal) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,s.getUbicacion());
            ps.setString(2,s.getTipoSala());
            ps.setString(3,s.getLocalidad());
            ps.setBoolean(4,s.isEstadoSal());
            
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                s.setIdSala(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Sala Agregagada");
            }
            ps.close();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, Sala no Agregagada " + ex );
        }
    }
    
    public void eliminarSala(int idSala){
        String sql = "UPDATE sala SET estadoSal = false WHERE idSala = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idSala);
            
            if (ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Sala Eliminada Exitosamiente");
            }else{
                JOptionPane.showMessageDialog(null, "Sala no Eliminada ");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se pudo Eliminar Sala " + ex);
        }
    }
    
    public void modificarSala(String ubicacion,String tipoSala,String localidad,boolean estadoSal,int idSala ){
        String sql = "UPDATE sala SET ubicacion = ?,tipoSala = ?,localidad = ? ,estadoSal = ? WHERE idSala = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ubicacion);
            ps.setString(2, tipoSala);
            ps.setString(3,localidad);
            ps.setBoolean(4,estadoSal);
            ps.setInt(5, idSala);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Sala Modificada Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe la Sala");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Sala" + ex);
        }
    }
    
    public Sala buscarSala(int idSala){
        Sala s = null;

        String sql = "SELECT * FROM sala WHERE idSala = ? AND estadoSal = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idSala);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                s = new Sala();

                s.setIdSala(rs.getInt("idSala"));
                s.setUbicacion(rs.getString("ubicacion"));
                s.setTipoSala(rs.getString("tipoSala"));
                s.setLocalidad(rs.getString("localidad"));
                s.setEstadoSal(rs.getBoolean("estadoSal"));
            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR"+exception.getMessage());
        }
        return s;
    }
    
    public List<Sala> listarSala(){
        ArrayList<Sala> listarSala = new ArrayList<>();
        
        String sql = "SELECT * FROM sala WHERE estadoSal = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Sala s = new Sala();
                s.setIdSala(rs.getInt("idSala"));
                s.setUbicacion(rs.getString("ubicacion"));
                s.setTipoSala(rs.getString("tipoSala"));
                s.setLocalidad(rs.getString("localidad"));
                s.setEstadoSal(rs.getBoolean("estadoSal"));
                
                listarSala.add(s);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarSala;
    }
    
    
}

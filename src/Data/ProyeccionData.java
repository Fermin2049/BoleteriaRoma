/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Control.Pelicula;
import Control.Proyeccion;
import Control.Sala;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fermin
 */
public class ProyeccionData {
    private Connection con;
    private SalaData sd;
    private PeliculaData pd;

    public ProyeccionData() {
        this.con = Conexion.getConexion();
        sd = new SalaData();
        pd = new PeliculaData();
    }
    
    public void agregarProyeccion(Proyeccion p){
        String sql = "INSERT INTO proyeccion( idSala, idPelicula, incioProy, finProy, estadoProy) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,p.getIdSala().getIdSala());
            ps.setInt(2,p.getIdPelicula().getIdPelicula());
            ps.setTimestamp(3, p.getIncioProy());
            ps.setTimestamp(4, p.getFinProy());
            ps.setBoolean(5,p.isEstadoProy());
            
            ps.executeQuery();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                p.setIdProyeecion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proyeccion Agregagada");
            }
            ps.close();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error, Proyeccion no Agregagado " + ex );
        }
    }
    
    public void eleminarProyeccion(int idProyeccion){
        String sql = "UPDATE proyeccion SET estadoProy = false WHERE idProyeccion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idProyeccion);
            
            if (ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Proyeccion Eliminada Exitosamiente");
            }else{
                JOptionPane.showMessageDialog(null, "Proyeecion no Eliminada ");
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "no se pudo Eliminar Proyeecion " + ex);
        }
    }
    
    public void modificarProyeccion(int idSala,int idPelicula,Timestamp incioProy,Timestamp finProy,boolean estadoProy,int idProyeccion){
        String sql = "UPDATE proyeccion SET idSala = ?,idPelicula = ?,incioProy = ?,finProy = ?,estadoProy = ? WHERE idProyeccion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idSala);
            ps.setInt(2,idPelicula);
            ps.setTimestamp(3, incioProy);
            ps.setTimestamp(4, finProy);
            ps.setBoolean(5,estadoProy);
            ps.setInt(6, idProyeccion);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Proyeccion Modificada Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No Existe la Proyeccion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Proyeccion" + ex);
        }
    }
    
    public Proyeccion buscarProyeccion(int idProyeccion){
        Proyeccion p = null;

        String sql = "SELECT * FROM proyeccion WHERE idProyeccion = ? AND estadoProy = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idProyeccion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p = new Proyeccion();

                p.setIdProyeecion(rs.getInt("idProyeccion"));
                Sala s = sd.buscarSala(rs.getInt("idSala"));
                p.setIdSala(s);
                Pelicula pe = pd.buscarPelicula(rs.getInt("idPelicula"));
                p.setIdPelicula(pe);
                p.setIncioProy(rs.getTimestamp("incioProy"));
                p.setFinProy(rs.getTimestamp("finProy"));
                p.setEstadoProy(rs.getBoolean("estadoProy"));
            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR"+exception.getMessage());
        }
        return p;
    
    }
    
    public List<Proyeccion> listarProyeccion(){
        ArrayList<Proyeccion> listarProyeccion = new ArrayList<>();
        
        String sql = "SELECT * FROM proyeccion WHERE estadoProy = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Proyeccion p = new Proyeccion();
                p.setIdProyeecion(rs.getInt("idProyeccion"));
                Sala s = sd.buscarSala(rs.getInt("idSala"));
                p.setIdSala(s);
                Pelicula pe = pd.buscarPelicula(rs.getInt("idPelicula"));
                p.setIdPelicula(pe);
                p.setIncioProy(rs.getTimestamp("incioProy"));
                p.setFinProy(rs.getTimestamp("finProy"));
                p.setEstadoProy(rs.getBoolean("estadoProy"));
                
                listarProyeccion.add(p);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarProyeccion;
    }
    
    //dada una proyeccion buscar butacas libres
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoletriaRoma;

import Control.Butaca;
import Control.Cliente;
import Control.Pelicula;
import Control.Proyeccion;
import Control.Sala;
import Control.Ticket;
import Data.ButacaData;
import Data.ClienteData;
import Data.PeliculaData;
import Data.ProyeccionData;
import Data.SalaData;
import Data.TicketData;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.List;

/**
 *
 * @author Fermin
 */
public class PruebasCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //========= Creacion y Agregado ========//
        
        Cliente cli = new Cliente("Fermin", "Fernandez", 33539061, true);
        ClienteData cd = new ClienteData();
       //cd.agregarCliente(cli);
       Cliente fer = cd.buscarCliente(1);
        
        Sala sal = new Sala("Sala 5", "2d", "San Luis", true);
        Sala sal2 = new Sala("Sala 1", "3d", "Villa Mercedes", true);
        SalaData sd = new SalaData();
     //  sd.agregarSala(sal);
      // sd.agregarSala(sal2);
        Sala salita = sd.buscarSala(1);
        Sala salita2 = sd.buscarSala(2);

        Butaca but = new Butaca(salita, "A", 1);
        Butaca but2 = new Butaca(salita2, "B", 2);
        ButacaData bd = new ButacaData();
     //   bd.agregarButaca(but);
     //     bd.agregarButaca(but2);
        Butaca buta = bd.buscarButaca(1);

        Pelicula pe = new Pelicula("Rapido y Furioso", true);
        PeliculaData pd = new PeliculaData();
     //     pd.agregarPelicula(pe);
        Pelicula peli = pd.buscarPelicula(1);
        LocalDateTime manana = LocalDateTime.of(2022,Month.OCTOBER,26,16,0,0,00000);


        Proyeccion proy = new Proyeccion(salita, peli,Timestamp.valueOf(manana) ,Timestamp.valueOf(LocalDateTime.now()) , true);
        
        ProyeccionData prd = new ProyeccionData();
          //prd.agregarProyeccion(proy);
        Proyeccion pr = prd.buscarProyeccion(12);
        System.out.println(pr.getIncioProy().toLocalDateTime());
     
        Ticket tic = new Ticket(fer, pr, buta,Timestamp.valueOf(manana), 500, "Tarjeta Credito", true);
        TicketData td = new TicketData();
        //td.agregarTick(tic);
        
        //============= Listados ============//
        
//        List listasala =sd.listarSala();
//        for (Object object : listasala) {
//            System.out.println(object);
//        }
//        
//        List cliente = cd.listarCliente();
//        for (Object object : cliente) {
//            System.out.println(object);
//        }
//        
//        List butaca = bd.listarButaca();
//        for (Object object : butaca) {
//            System.out.println(object);
//        }
//        
//        List pelicula = pd.listarPelicula();
//        for (Object object : pelicula) {
//            System.out.println(object);
//        }
//        
//        List proyecion = prd.listarProyeccion();
//        for (Object object : proyecion) {
//            System.out.println(object);
//        }
//        
//        List ticke = td.listarTicket();
//        for (Object object : ticke) {
//            System.out.println(object);
//        }
        
        //================== Modificar ============//
        
        //sd.modificarSala("Sala5", "2d", "San Luis", true, 2);
        
        //cd.modificarCliente("Fermincho", "Fernandez", 33539061, true, 1);
        
        //bd.modificarButaca(2, "F", 5, 1);
        
        //pd.modificarPelicula("Manuelita", true, 1);
        
        //prd.modificarProyeccion(1, 1, Timestamp.valueOf(LocalDateTime.of(2022, Month.OCTOBER, 27, 15, 0)), Timestamp.valueOf(LocalDateTime.of(2022, Month.OCTOBER, 27, 17, 0)), true, 2);
        
        //td.modificarTicket(1, 12, 2, Timestamp.valueOf(LocalDateTime.of(2022, Month.OCTOBER, 27, 15, 0)), 700, "Debito", true, 1);
        
        //=============== Eleminar ===============//
        
        //sd.eliminarSala(2);
        
        //cd.eliminarCliente(1);
        
        //pd.eliminarPelicula(1);
        
        //prd.eleminarProyeccion(2);
        
        //td.eleminarTicket(1);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.avanzada2.repaso.app.repositorios;

import hn.uth.avanzada2.repaso.app.modelos.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author uth
 */
public class PersonaRepositorio {
    private Connection getCon() throws Exception{
        try {
            String usuario="pa2";
            String contrasenia="pa2";
            String url="jdbc:derby://localhost:1527/pa2";
            
            return DriverManager.getConnection(url, usuario, contrasenia);
        } catch (Exception e) {
            throw new Exception("Error getCon: "+e.toString());
        }
    }
    
    
    /*
    crear
actualizar
eliminar
consultar
get
getAll

    */
    public Persona crear(Persona entidad) throws Exception{
        try {
            Connection con=getCon();
            
            String sql=" INSERT INTO personas (id, nombre, apellido) values (?, ?, ?) ";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.setString(2, entidad.getNombre());
            ps.setString(3, entidad.getApellido());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            return entidad;
        } catch (Exception e) {
            throw new Exception("Error crear: "+e.toString());
        }            
    }
}

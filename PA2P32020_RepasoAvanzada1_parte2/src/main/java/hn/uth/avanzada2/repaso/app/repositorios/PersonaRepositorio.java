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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    public Persona actualizar(Persona entidad) throws Exception{
        try {
            Connection con=getCon();
            
            String sql=" UPDATE personas " +
                    "SET nombre= ? , apellido= ? " +
                    "WHERE id= ?	 ";            
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(3, entidad.getId());
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getApellido());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            return entidad;
        } catch (Exception e) {
            throw new Exception("Error actualizar: "+e.toString());
        }            
    }
    public void eliminar(int id) throws Exception{
        try {
            Connection con=getCon();
            
            String sql=" DELETE FROM personas	" +
                        "WHERE id= ?	 ";            
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.execute();
            
            ps.close();
            con.close();
            
        } catch (Exception e) {
            throw new Exception("Error eliminar: "+e.toString());
        }            
    }
    
    public List<Persona> getAll() throws Exception{
        List<Persona> listaRetorno=new ArrayList<>();
        try {
            Connection con=getCon();
            
            String sql=" SELECT * FROM personas	 ";  
            
            Statement sentencia=con.createStatement();
            
            ResultSet resultado=sentencia.executeQuery(sql);
            
            while (resultado.next()) {                
                int id=resultado.getInt("ID");
                String nombre=resultado.getString("NOMBRE");
                String apellido=resultado.getString("APELLIDO");
                        
                listaRetorno.add(new Persona(id, nombre, apellido));
            }
        } catch (Exception e) {
            throw new Exception("Error getAll: "+e.toString());
        }
        return listaRetorno;
    }
    
    public Persona get(int id) throws Exception{
        try {
            Connection con=getCon();
            
            String sql=" SELECT * FROM personas	WHERE id= "+id;  
            
            Statement sentencia=con.createStatement();
            
            ResultSet resultado=sentencia.executeQuery(sql);
            
            while (resultado.next()) {                
                return new Persona(resultado.getInt("ID")
                        , resultado.getString("NOMBRE")
                        , resultado.getString("APELLIDO"));
            }
        } catch (Exception e) {
            throw new Exception("Error getAll: "+e.toString());
        }
        return null;
    }
}

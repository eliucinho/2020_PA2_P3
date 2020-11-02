/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.p2.app.services;

import hn.uth.pa2.p2.app.models.Persona;
import hn.uth.pa2.p2.app.repositorios.PersonaRepositorio;
import hn.uth.pa2.p2.app.repositorios.PersonaRepositorioJdbc;
import hn.uth.pa2.p2.app.repositorios.Repositorio;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uth
 */
public class PersonaServicio {   
    private Repositorio repo;
    
    public PersonaServicio() {
        repo=new PersonaRepositorioJdbc();  
    }
    
    public void guardar(int id, String nombre, String apellido) throws Exception{
        Persona entidad=new Persona(id, nombre, apellido);    
        repo.crear(entidad);         
    }
    
    public void actualizar(int id, String nombre, String apellido) throws Exception{
        Persona entidad=new Persona(id, nombre, apellido);        
        repo.actualizar(entidad);
    }
    
    public void eliminar(int id) throws Exception{
        Persona entidad=(Persona)repo.get(id);
        repo.eliminar(entidad);
    }
    
    public Persona obtenerPersona(int id) throws Exception{
        return (Persona) repo.get(id);
    }
    
    public List<Persona> obtenerTodos() throws Exception{
        return (List<Persona>) repo.getAll();
    }
}

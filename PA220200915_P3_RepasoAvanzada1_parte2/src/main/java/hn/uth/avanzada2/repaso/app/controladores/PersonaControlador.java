/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.avanzada2.repaso.app.controladores;

import hn.uth.avanzada2.repaso.app.modelos.Persona;
import hn.uth.avanzada2.repaso.app.repositorios.PersonaRepositorio;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uth
 */
public class PersonaControlador {     
    public void guardar(int id, String nombre, String apellido) throws Exception{
        PersonaRepositorio repo=new PersonaRepositorio();    
        
        Persona entidad=new Persona(id, nombre, apellido);        
        repo.crear(entidad); 
        
    }
    
    public void actualizar(int id, String nombre, String apellido) throws Exception{
        PersonaRepositorio repo=new PersonaRepositorio();    
        
        Persona entidad=new Persona(id, nombre, apellido);        
        repo.actualizar(entidad);
    }
    
    public void eliminar(int id) throws Exception{
        PersonaRepositorio repo=new PersonaRepositorio();    
              
        repo.eliminar(id);
    }
    
    public void refrescarTabla(JTable tabla)throws Exception{
        tabla.setModel(getTabla());
    }
    
    private DefaultTableModel getTabla() throws Exception{
        PersonaRepositorio repo=new PersonaRepositorio();    
        
        List<Persona> lista = repo.getAll();
        
        int numeroColumnas=3;
        int numeroFilas=lista.size();
        
        Object [][] datos=new Object [numeroFilas][numeroColumnas];
        String [] nombreColumnas=new String [] {
                "ID", "Nombre", "Apellido"
            };
                
        for (int i = 0; i < numeroFilas; i++) {
            datos[i][0]=lista.get(i).getId();
            datos[i][1]=lista.get(i).getNombre();
            datos[i][2]=lista.get(i).getApellido();
        }
        
        return new DefaultTableModel(
            datos,
            nombreColumnas
        );
    }
}

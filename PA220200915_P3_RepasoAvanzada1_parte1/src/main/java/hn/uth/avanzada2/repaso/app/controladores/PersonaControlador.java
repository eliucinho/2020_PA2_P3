/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.avanzada2.repaso.app.controladores;

import hn.uth.avanzada2.repaso.app.modelos.Persona;
import hn.uth.avanzada2.repaso.app.repositorios.PersonaRepositorio;

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
}

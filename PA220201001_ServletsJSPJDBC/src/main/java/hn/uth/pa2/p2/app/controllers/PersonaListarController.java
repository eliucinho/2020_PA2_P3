/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.p2.app.controllers;

import hn.uth.pa2.p2.app.models.Persona;
import hn.uth.pa2.p2.app.services.PersonaServicio;
import java.util.List;

/**
 *
 * @author desa
 */
public class PersonaListarController {
    PersonaServicio servicio;
    public PersonaListarController(){
        servicio=new PersonaServicio();
    }
    public String getTabla() throws Exception{
        String tabla="<table>";
        String fila="";
        List<Persona> lista = servicio.obtenerTodos();
        for (Persona persona : lista) {
            fila="<tr>";
            fila+="<td>"+persona.getId()+"</td>";
            fila+="<td>"+persona.getNombre()+"</td>";
            fila+="<td>"+persona.getApellido()+"</td>";
            fila+="</tr>";
            tabla+=fila;
        }
        tabla+="</table>";
        System.out.println(tabla);
        return tabla;
    }
}

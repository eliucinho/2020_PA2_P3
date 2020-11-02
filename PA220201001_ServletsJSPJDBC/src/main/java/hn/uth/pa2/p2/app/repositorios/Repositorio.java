/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.p2.app.repositorios;

import java.util.List;

/**
 *
 * @author desa
 */
public interface Repositorio<T> {
    public void crear(T entidad) throws Exception;
    public void eliminar(T entidad) throws Exception;
    public void actualizar(T entidad) throws Exception;
    public T get(Object id) throws Exception;
    public List<T> getAll() throws Exception;
    
}

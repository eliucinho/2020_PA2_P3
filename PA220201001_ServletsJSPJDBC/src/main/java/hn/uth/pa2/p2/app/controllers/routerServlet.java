/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.p2.app.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author desa
 */
@WebServlet(name = "routerServlet", urlPatterns = {"/routerServlet"})
public class routerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String accion=request.getParameter("accion");
            
            switch(accion){
                case routerConfig.ACCION_PERSONA_LISTAR: ir(request,response,"paginas/personas/listar.jsp");break;
                case routerConfig.ACCION_PERSONA_CREAR: ir(request,response,"paginas/personas/crear.jsp");break;
                case routerConfig.ACCION_PERSONA_ELIMINAR: ir(request,response,"paginas/personas/eliminar.jsp");break;
                case routerConfig.ACCION_PERSONA_ACTUALIZAR: ir(request,response,"paginas/personas/actualizar.jsp");break;
                default: ir(request,response,"paginas/personas/default.jsp");break;
            }
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void ir(HttpServletRequest request, HttpServletResponse response,String direccion) throws ServletException, IOException{
        RequestDispatcher despachador=request.getRequestDispatcher(direccion);
        despachador.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

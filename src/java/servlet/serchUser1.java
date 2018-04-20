/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.UserRepository;

/**
 *
 * @author ROBIN
 */
public class serchUser1 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet serchUser1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet serchUser1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String search_methode = request.getParameter("searchType");
        String m_type = request.getParameter("searchInput");
               try{     
                    if(search_methode=="1"){
                        UserRepository userRepository = new UserRepository();
                        List<String> allItems = (List<String>) userRepository.getAllUsersByType(m_type);
                        
                        for (String string : allItems) {
                        out.print("<tr>");
                        out.print(string);
                        out.print("</tr>");
                    }
                    
                    }
               }catch(Exception e){
               
                   e.printStackTrace();
               }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

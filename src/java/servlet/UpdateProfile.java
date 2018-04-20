package servlet;

import encrypt.AESCrypto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.UserRepository;


public class UpdateProfile extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditUser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int nic_no = Integer.parseInt(request.getParameter("nic_no"));
            String new_tel_no = request.getParameter("tel_no");
            String new_email = request.getParameter("email");
            String new_password = request.getParameter("password");
            AESCrypto aESCrypto = new AESCrypto("ThisIsTheKeyyyyy");
            String passwordEnc = aESCrypto.encrypt(new_password);
            
            UserRepository userRepository = new UserRepository();
            String msg = userRepository.updateProfile(nic_no,new_tel_no,new_email,passwordEnc);
            
            if(msg=="success"){
                response.sendRedirect("userUpdateSuccess.jsp");
            }else if(msg=="Errorrrrrrrrrrrrr"){
                response.sendRedirect("userUpdateError.jsp");
            }else{
                response.sendRedirect("userUpdateRequestError.jsp");
            }
        } catch (Exception ex) {
            Logger.getLogger(UpdateProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

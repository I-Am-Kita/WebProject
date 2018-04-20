package servlet;

import classes.User;
import encrypt.AESCrypto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import repository.UserRepository;


public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            AESCrypto aESCrypto = new AESCrypto("ThisIsTheKeyyyyy");
            String encrypted_password = aESCrypto.encrypt(password); 
            
            UserRepository userRepository = new UserRepository();
            String user_password = userRepository.getUserPassword(username);
            
            
            String login_name = userRepository.getUserLoginName(username);
            
            String userType = userRepository.getUserType(username);
            
            
            
            if(encrypted_password.equals(user_password)){
            
                HttpSession session = request.getSession();
                session.setAttribute("loggedUser",new User(username,password));
                session.setAttribute("user",login_name);
                session.setAttribute("nic",username);
                session.setAttribute("type", userType);
                response.sendRedirect("home.jsp");
            }else{
                response.sendRedirect("index.jsp");
                
            }

        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

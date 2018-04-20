package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.UserRepository;

public class RegisterUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShoppingCart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShoppingCart at " + request.getContextPath() + "</h1>");
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


        int nic_no = Integer.parseInt(request.getParameter("nic_no"));
        String initials = request.getParameter("initials");
        String surname = request.getParameter("surname");
        String tel_no = request.getParameter("tel_no");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String m_type = request.getParameter("m_type");
        
        
            UserRepository userRepository = new UserRepository();
            String msg = userRepository.saveUser(nic_no,initials,surname,tel_no,email,password,m_type);
            response.getWriter().print(msg);
            
            if(msg=="success"){
                response.sendRedirect("userRegSuccess.jsp");
            }else if(msg=="Errorrrrrrrrrrrrr"){
                response.sendRedirect("userRegError.jsp");
            }else{
                response.sendRedirect("userRegRequestError.jsp");
            }
        
          //  response.sendRedirect("userRegistration.jsp?msg="+msg);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}



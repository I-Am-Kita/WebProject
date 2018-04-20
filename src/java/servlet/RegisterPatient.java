package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.PatientRepositoty;

public class RegisterPatient extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterPatient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterPatient at " + request.getContextPath() + "</h1>");
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
        
        String initials = request.getParameter("initials");
        String surname = request.getParameter("surname");
        String guard = request.getParameter("guard");
        int id = Integer.parseInt(request.getParameter("id"));
        int age = Integer.parseInt(request.getParameter("age"));
        String tel_no = request.getParameter("tel_no");
        String [] o_type = request.getParameterValues("o_type");
        String diagnosis = request.getParameter("diagnosis");
        String p_co = request.getParameter("p_co");
        String hx_p_co = request.getParameter("hx_p_co");
        String pmhx = request.getParameter("pmhx");
        String pshx = request.getParameter("pshx");
        String aihx = request.getParameter("aihx");
        String drughx = request.getParameter("drughx");
        String immunizationhx = request.getParameter("immunizationhx");
        String socialhx = request.getParameter("socialhx");
        String familyhx = request.getParameter("familyhx");
        String examination = request.getParameter("examination");
        String system = request.getParameter("system");
        String ix = request.getParameter("ix");
        String mx = request.getParameter("mx");
        
            PatientRepositoty patientRepository = new PatientRepositoty();
            if(patientRepository.savePatient(id,initials,surname,guard,age,tel_no,diagnosis,p_co,hx_p_co,pmhx,pshx,
                            aihx,drughx,immunizationhx,socialhx,familyhx,examination,system,ix,mx)){

                String last_id = patientRepository.getLastIds();
                int lastId = Integer.parseInt(last_id);
                String msg = patientRepository.insert_type(lastId,o_type);
                
                if(msg=="Patient successfully registered"){
                    response.sendRedirect("patientRegSuccess.jsp");
                }else if(msg=="Patient registration unsuccessful"){
                    response.sendRedirect("patientRegError.jsp");
                }else{
                    response.sendRedirect("patientRegRequestError.jsp");
                }
            }else{
                response.sendRedirect("patientRegRequestError.jsp");
                System.out.println("noooooooooooooooo");
            }
            
        //    response.sendRedirect("patientRegistration.jsp?msg="+msg);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

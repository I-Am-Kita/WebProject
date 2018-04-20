package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repository.PatientRepositoty;

public class UpdatePatient extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdatePatient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePatient at " + request.getContextPath() + "</h1>");
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
        
        int num = Integer.parseInt(request.getParameter("num"));
        int new_age = Integer.parseInt(request.getParameter("age"));
        String new_tel_no = request.getParameter("tel_no");
        String new_diagnosis = request.getParameter("diagnosis");
        String new_p_co = request.getParameter("p_co");
        String new_hx_p_co = request.getParameter("hx_p_co");
        String new_pmhx = request.getParameter("pmhx");
        String new_pshx = request.getParameter("pshx");
        String new_aihx = request.getParameter("aihx");
        String new_drughx = request.getParameter("drughx");
        String new_immunizationhx = request.getParameter("immunizationhx");
        String new_socialhx = request.getParameter("socialhx");
        String new_familyhx = request.getParameter("familyhx");
        String new_examination = request.getParameter("examination");
        String new_system = request.getParameter("system");
        String new_ix = request.getParameter("ix");
        String new_mx = request.getParameter("mx");
        
        String type = request.getParameter("type");
        int currentAge = Integer.parseInt(request.getParameter("currentAge"));
        String organ = request.getParameter("organ");
                
        PatientRepositoty patientRepository = new PatientRepositoty();
        String msg = patientRepository.updatePatient(num,new_age,new_tel_no,new_diagnosis,new_p_co,new_hx_p_co,new_pmhx,new_pshx,new_aihx,new_drughx,new_immunizationhx,new_socialhx,new_familyhx,new_examination,new_system,new_ix,new_mx);
    
                if(msg=="success"){
                   // response.sendRedirect("patientUpdateSuccessNic.jsp?&num="+num);
                   if("nic".equals(type)){
                        response.sendRedirect("patientUpdateSuccessNic.jsp?&num="+num);
                   }
                   else if("age".equals(type)){
                       response.sendRedirect("patientUpdateSuccessAge.jsp?age="+currentAge);
                    }
                   else if("organ".equals(type)){
                       response.sendRedirect("patientUpdateSuccessOrgan.jsp?o_type="+organ);
                    }else{
                        response.sendRedirect("patientUpdateSuccess.jsp");
                    }
                }else if(msg=="User data update query did not executed"){
                    response.sendRedirect("patientUpdateError.jsp");
                }else{
                    response.sendRedirect("patientUpdateRequestError.jsp");
                }
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

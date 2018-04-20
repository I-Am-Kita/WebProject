<%-- 
    Document   : profile
    Created on : Dec 20, 2017, 9:27:35 PM
    Author     : ROBIN
--%>

<%@page import="repository.UserRepository"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% String nic_no =(String)session.getAttribute( "nic" );
            UserRepository userRepository = new UserRepository();
            
            //out.print(nic_no);
            String password = userRepository.getUserPassword(nic_no);
            String tel_no = userRepository.getUserTel_no(nic_no);
            String email = userRepository.getUserEmail(nic_no);
            String initials = userRepository.getUserInitials(nic_no);
            String surname = userRepository.getUserLoginName(nic_no);
            String type = userRepository.getUserType(nic_no);
            
            
            //out.print(password);
            //out.print(tel_no);
            //out.print(email);
            response.sendRedirect("profileEdit.jsp?&nic_no="+nic_no+"&initials="+initials+"&surname="+surname+"&password="+password+"&tel_no="+tel_no+"&email="+email+"&type="+type+"");
        
        
        
        
        %>
        
        
    </body>
</html>

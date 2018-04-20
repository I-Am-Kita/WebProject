<%-- 
    Document   : deleteUser
    Created on : Nov 18, 2017, 8:05:44 PM
    Author     : ROBIN
--%>

<%@page import="repository.UserRepository"%>
<%@ page import = "java.io.*,java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
          try {
                    int nic_no = Integer.parseInt(request.getParameter("id"));

                    UserRepository userRepository = new UserRepository();
                    userRepository.deleteUser(nic_no);
                    
                    String site = new String("viewAllUsers.jsp");
                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                    response.setHeader("Location", site);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
    </body>
</html>

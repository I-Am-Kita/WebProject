<%-- 
    Document   : deleteSearchedPatient
    Created on : Dec 23, 2017, 11:43:49 PM
    Author     : ROBIN
--%>

<%@page import="repository.PatientRepositoty"%>
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
                    int num = Integer.parseInt(request.getParameter("num"));

                    PatientRepositoty patientRepositoty = new PatientRepositoty();
                    patientRepositoty.deletePatient(num);
                    
                    String site = new String("searchPatientPanel.jsp");
                    response.setStatus(response.SC_MOVED_TEMPORARILY);
                    response.setHeader("Location", site);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
    </body>
</html>

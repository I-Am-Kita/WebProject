<%-- 
    Document   : pdfGenerateForGuardianNic
    Created on : Dec 23, 2017, 11:03:20 PM
    Author     : ROBIN
--%>

<%@page import="pdf.CreatePdf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
        int num = Integer.parseInt(request.getParameter("num"));
        
        out.print(num);
        
        CreatePdf pdf = new CreatePdf();
        pdf.genPdf(num);
        
        String site = new String("searchPatientPanel.jsp");
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", site);
        
        
        %>
    </body>
</html>

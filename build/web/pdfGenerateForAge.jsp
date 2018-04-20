<%-- 
    Document   : pdfGenerateForAge
    Created on : Dec 23, 2017, 11:11:02 PM
    Author     : ROBIN
--%>

<%@page import="javax.jms.Session"%>
<%@page import="pdf.CreatePdf"%>
<%@page import="pdf.OpenPdf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
     /*  int num = Integer.parseInt(request.getParameter("num"));
        out.print(num); */
        
        CreatePdf createPdf = new CreatePdf();
        createPdf.genPdf(18);  
       
        %>
    </body>
</html>

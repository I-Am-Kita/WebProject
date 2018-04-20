<%-- 
    Document   : pdfGenerateForOrganType
    Created on : Dec 23, 2017, 11:39:32 PM
    Author     : ROBIN
--%>

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
        
        
        %>
    </body>
</html>

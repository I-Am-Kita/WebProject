<%-- 
    Document   : viewUser
    Created on : Nov 18, 2017, 2:42:14 AM
    Author     : ROBIN
--%>

<%@page import="java.util.List"%>
<%@page import="repository.PatientRepositoty"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" href="css/form.css"/>
        
        <style>
            .divtext
            {
                
                font-size:      30px;
                width: 1000px; 
                word-wrap:break-word;
            }
        </style>
        
    </head>
    <body>
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
        <div id="contentwrap">
        <div id="content">
        <table border="0">  
            <font color="#111100" size="15" face="Agency FB"> View Patient</font>
            <div>_________________________________</div>
        <%
          try {
                    int id = Integer.parseInt(request.getParameter("id"));
                  //  out.print(id);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    List<String> allPatients1 = (List<String>) patientRepository.getPatientDetails(id);
                    for (String string : allPatients1) {
                        out.print(string);
                    }
                    List<String> allPatients2 = (List<String>) patientRepository.getPatientOrganTypes(id);
                    for (String string : allPatients2) {
                        out.print(string);
                    }
                    List<String> allPatients3 = (List<String>) patientRepository.getPatientOtherDetails(id);
                    for (String string : allPatients3) {
                        out.print(string);
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        <div style="height:10px;"></div>
        <div>_________________________________</div>
        <div><a href="viewAllPatients.jsp"><button class="button">Back</button></a></div>
        </table>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>

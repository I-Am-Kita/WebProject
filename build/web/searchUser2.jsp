<%-- 
    Document   : viewUser
    Created on : Nov 18, 2017, 2:42:14 AM
    Author     : ROBIN
--%>

<%@page import="java.util.List"%>
<%@page import="repository.UserRepository"%>
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
                font-family:    Agency FB;
                font-size:      40px;
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
            <font color="#111100" size="15" face="Agency FB"> View User</font>
            <div>_____________________</div>
        <%
          try {
                    int nic_no = Integer.parseInt(request.getParameter("searchInput"));
                    String search_methode = request.getParameter("searchType");
                    
                    if(search_methode=="2"){
                    UserRepository userRepository = new UserRepository();
                    List<String> allItems = (List<String>) userRepository.getUser(nic_no);
                    for (String string : allItems) {
                        out.print(string);
                    }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>
        <div style="height:10px;"></div>
        <div>_________________________________</div>
        <div><a href="viewAllUsers.jsp"><button class="button">Back</button></a></div>
        </table>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>

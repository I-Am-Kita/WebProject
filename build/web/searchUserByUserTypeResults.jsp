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
        <style>
    tr {
  background-color: rgb(204,204,204);
  height:80px;
  
}

.tr {
    background-color: rgb(204,204,204);
    height:80px;
}
.td {
    background-color: gray;
    height:80px;
}
.td1 {
    background-color: violet;
    height:80px;
}
td {
    width: 120px;
    border-radius: 15px;
    background-color: lightgray;
    color: black;
    border: 1px solid black;
    text-align: center;
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
            <font color="#111100" size="15" face="Agency FB"> View Users By User Type</font>
            <div>_____________________</div>
            <tr class="tr"><td class="td">NIC</td><td class="td">Initials</td><td class="td">Surname</td><td class="td">Phone No</td><td class="td">Email</td><td class="td">Password</td><td class="td">User Type</td><td class="td">View</td><td class="td">Edit</td><td class="td">Delete</td></tr>  
        <%
          try {
                    String m_type = request.getParameter("m_type");
                   

                    UserRepository userRepository = new UserRepository();
                    List<String> allItems = (List<String>) userRepository.getAllUsersByType(m_type);
                    for (String string : allItems) {
                        out.print("<tr>");
                        out.print(string);
                        out.print("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>

        
        </table>
                <div style="height:10px;"></div>
        <div>_________________________________</div>
        <div><a href="searchPanel.jsp"><button class="button">Back</button></a></div>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>

<%-- 
    Document   : pdftest
    Created on : Jan 24, 2018, 8:32:06 PM
    Author     : ROBIN
--%>

<!--
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form id="myForm" name="myForm " method="post" action="PDF" />
        <input type="hidden" name="id" value="<% String idd = request.getParameter("id");
                                                int id = Integer.parseInt(idd);  
                                                out.print(id);%>" />
        </form>
    <script>
        window.onload = function() {
            document.getElementById("myForm").submit();
        }
    </script>
       
    </body>
</html>  -->
                                                
                                                
<%@page import="repository.PatientRepositoty"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
.td2 {
    background-color:#96d1f8;
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
    <script type="text/javascript">
function confirm_alert(node) {
    return confirm("Do you want to remove this user ?");
}
</script>
    <body>
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
        <div id="contentwrap">
        <div id="content">
        <table border="0">
            <tr class="tr"><td class="td">Initials</td><td class="td">Surname</td><td class="td">Guardian</td><td class="td">Guardian's NIC</td><td class="td">Age</td><td class="td">Telephone No</td><td class="td">View</td><td class="td">Edit</td><td class="td">Delete</td><td class="td">Print</td></tr>  
        <%
          try {
                    PatientRepositoty patientRepositoty = new PatientRepositoty();
                    List<String> allPatients = (List<String>) patientRepositoty.getAllPatientss();
                    for (String string : allPatients) {
                        out.print("<tr>");
                        out.print(string);
                        out.print("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        %>

        </table>
                <form id="myForm" name="myForm " method="post" action="PDF" />
        <input type="hidden" name="id" value="<% String iddd = request.getParameter("id");
                                                int ids = Integer.parseInt(iddd);  
                                                out.print(ids);%>" />
        </form>
    <script>
        window.onload = function() {
            document.getElementById("myForm").submit();
        }
    </script>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>
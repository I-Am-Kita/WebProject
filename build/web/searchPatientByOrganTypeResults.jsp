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
                font-family:    Agency FB;
                font-size:      40px;
                width: 1000px; 
                word-wrap:break-word;
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

.td2 {
    background-color:chartreuse;
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

function confirm_print(node) {
    return confirm("Do you want to print details of this patient ?");
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
            <font color="#111100" size="15" face="Agency FB"> View Patients</font>
            <div>_________________________________</div>
            <tr class="tr"><td class="td">Initials</td><td class="td">Surname</td><td class="td">Guardian</td><td class="td">Guardian's NIC</td><td class="td">Age</td><td class="td">Telephone No</td><td class="td">View</td><td class="td">Edit</td><td class="td">Delete</td><td class="td">Print</td></tr>  
        <%
          try {
                    String o_type = request.getParameter("o_type");
                    //out.print(o_type);

                    PatientRepositoty patientRepository = new PatientRepositoty();
                    List<String> allPatients = (List<String>) patientRepository.getPatientByOrganType(o_type);
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
        <div style="height:10px;"></div>
        <div>_________________________________</div>
        <div><a href="searchPatientPanel.jsp"><button class="button">Back</button></a></div>
        </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
        
    </body>
</html>


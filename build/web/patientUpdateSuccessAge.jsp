<%-- 
    Document   : patientUpdateSuccessAge
    Created on : Jan 3, 2018, 9:50:27 PM
    Author     : ROBIN
--%>


<%@page import="repository.PatientRepositoty"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="css/content.css"/>
<link rel="stylesheet" href="css/btn.css"/>
</head>
<body>
    <div id="wrapper">

        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>

            <div id="contentwrap">
                <div id="content">
                
                        <div id="wrapper">
	<div style=" height:100px; ">
        </div>
            <center>
                <div style=" padding: 10px; width:35%; height:auto; background-color:#ebebeb; border:1px solid #ccc; border-radius: 10px; ">
                    
        		<ul>
                            <font face="Agency FB"  size="4px" ><h2>PATIENT UPDATE SUCCESS</h2></font>
				
				
                                <div>
                                    <div><a href="searchPatientByAgeResults.jsp?&age=<%
                                            int age = Integer.parseInt(request.getParameter("age")); 
                                            out.print(age);
                                            
                                            %>"><button class="button">OK</button></a></div>
                                </div>
				<br/>
				<hr/>

        		</ul>
                   
                </div>
            </center>

    </div>
                    
                </div>
                   
            </div>
    </div>
		
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>

    </div>
</body>
</html>


<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

<link rel="stylesheet" href="css/content.css"/>
<link rel="stylesheet" href="css/btn.css"/>
<link rel="stylesheet" href="css/dashboardicon.css"/>

</head>

<body>
    <div id="wrapper">
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
	
        <div id="contentwrap">
            <div id="content">


		<div  id="userReg" class="dashicon" >
                    <a href="searchPatientByGuardianNIC.jsp">
			<img src="img/icons/searchPatientByGuardianNIC.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH PATIENT BY GUARDIAN'S NIC</font>
                    </a>
		</div>
        
        	<div  id="seeUser" class="dashicon" >
                    <a href="searchPatientByOrganType.jsp">
			<img src="img/icons/searchPatientByOrganType.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH PATIENT BY ORGAN_TYPE</font>
                    </a>
		</div>
        
                <div id="searchUser" class="dashicon" >
                    <a href="searchPatientByAge.jsp">
			<img src="img/icons/searchPatientByAge.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH PATIENT BY AGE</font>
                    </a>
		</div>

            </div>
        </div>

        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>



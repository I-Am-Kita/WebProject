<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

<link rel="stylesheet" href="css/content.css"/>
<link rel="stylesheet" href="css/btn.css"/>
<link rel="stylesheet" href="css/dashboardicon.css"/>

</head>
<script>
window.onload =function myFunction() {
    var t = document.getElementById("userReg");
    var u = document.getElementById("seeUser");
    var v = document.getElementById("searchUser");
    var w = document.getElementById("patientreg");
    var x = document.getElementById("seePatient");
    var y = document.getElementById("searchPtient");
    var z = document.getElementById("reports");
 
    var userType = '<%= session.getAttribute("type") %>';
    
    if (userType === "Sys_Admin") {
        t.style.display = "inline";
        u.style.display = "inline";
        v.style.display = "inline";
        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    } else if(userType === "Sys_Doc"){
        t.style.display = "none";
        u.style.display = "none";
        v.style.display = "none";
        w.style.display = "inline";
        x.style.display = "inline";
        y.style.display = "inline";
        z.style.display = "none";
    }else if(userType === "Super_user"){
        t.style.display = "inline";
        u.style.display = "inline";
        v.style.display = "inline";
        w.style.display = "inline";
        x.style.display = "inline";
        y.style.display = "inline";
        z.style.display = "none";
    }else if(userType === "Sys_Nurse"){
	t.style.display = "none";
        u.style.display = "none";
        v.style.display = "none";
        w.style.display = "inline";
        x.style.display = "inline";
        y.style.display = "none";
        z.style.display = "none";
    }else{
        t.style.display = "inline";
        u.style.display = "none";
        v.style.display = "none";
        w.style.display = "none";
        x.style.display = "none";
        y.style.display = "none";
        z.style.display = "none";
    }
}
</script>
<body>
    <div id="wrapper">
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
	
        <div id="contentwrap">
            <div id="content">

                <div  id="userReg" class="dashicon" >
                    <a href="userRegistration.jsp">
			<img src="img/icons/Contacts.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> USER  REGISTRATION</font>
                    </a>
		</div>
        
        	<div  id="seeUser" class="dashicon" >
                    <a href="viewAllUsers.jsp">
			<img src="img/icons/Search.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEE ALL USERS</font>
                    </a>
		</div>
        
                <div id="searchUser" class="dashicon" >
                    <a href="searchPanel.jsp">
			<img src="img/icons/searchUser.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH USERS</font>
                    </a>
		</div>

		<div id="patientreg" class="dashicon" >
                    <a href="patientRegistration.jsp">
			<img src="img/icons/PatientReg.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> PATIENT  REGISTRATION</font>
                    </a>
		</div>
        
        	<div id="seePatient" class="dashicon" >
                    <a href="viewAllPatients.jsp">
			<img src="img/icons/PatientSearch.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEE All PATIENTS</font>
                    </a>
		</div>
        
                <div id="searchPtient" class="dashicon" >
                    <a href="searchPatientPanel.jsp">
			<img src="img/icons/searchPatient.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH PATIENT</font>
                    </a>
		</div>
        
                <div id="reports" class="dashicon" >
                    <a href="#">
			<img src="img/icons/Reports.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> REPORTS</font>
                    </a>
		</div>
            </div>
        </div>

        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>


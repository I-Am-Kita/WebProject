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
                    <a href="searchUserByNIC.jsp">
			<img src="img/icons/SearchByNIC.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH USER BY NIC</font>
                    </a>
		</div>
        
        	<div  id="seeUser" class="dashicon" >
                    <a href="searchUserByUserType.jsp">
			<img src="img/icons/SearchByType.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH USER BY USER_TYPE</font>
                    </a>
		</div>
        
                <div id="searchUser" class="dashicon" >
                    <a href="searchUserByEmail.jsp">
			<img src="img/icons/SearchByEmail.png" height="150" width="150" />
                            <font color="#000000" size="5" face="Agency FB"> SEARCH USER BY EMAIL</font>
                    </a>
		</div>

            </div>
        </div>

        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>


<!DOCTYPE html>
<html>
<head>
<title>Member Management</title>



<link rel="stylesheet" type="text/css" href="css/content.css" />
<link rel="stylesheet" type="text/css" href="css/button.css" />
<link rel="stylesheet" type="text/css" href="css/wrapper.css" />
<link rel="stylesheet" type="text/css" href="css/form.css" />

<script src="lib/jquery.min.js"></script>

</head>
<body>
    <div id="wrapper">
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>
		<div id="contentwrap">
        <div id="content">
        
        <div style="text-align:left;width:68%;display:inline-block;">
        <br/><br/>
        	
        </div>


		<div  style="text-align:center;">
                    <form method="POST" action="SearchPatientByAge" >
                        <li style="height:80px;"></li>
                        <li><span style="width:60px;"></span>
                            <span><label class="description" for="guard"><font face="Agency FB" color="black" size="6px" ><Strong>Patient's Age</Strong></font></label></span>
                            <span style="width:40px;"></span>
                            <span><div><div><input id="age" type="number" class="large text" size="60" name="age"  required="required" pattern="[0-9]" /></div></div></span>
                            <span><input type="submit" class="button" value="     Submit     "  /></span>
                        </li>
                    </form>
		</div>
<div id = "searchResult">

</div>
        </div>
        </div>


        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>



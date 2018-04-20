<!DOCTYPE html>
<html>
<head>
<title>Sign in</title>




<link rel="stylesheet" type="text/css" href="css/form.css" />
<link rel="stylesheet" type="text/css" href="css/wrapper.css" />
</head>
<% 
if(request.getSession().getAttribute("loggedUser") != null){

    response.sendRedirect("home.jsp");

}

%>
<body>
    <div id="wrapper">
	<div><p style="text-align: center;"><img src="img/logo1.jpg" height="200" width="600" /></p>
            <p style="text-align: center;"><strong><span style="font-size: 40px;font-family: Agency FB "> Examination Database Management System</span></strong></p>
            
        </div>
            <center>
                <div style=" padding: 10px; width:35%; height:auto; background-color:#ebebeb; border:1px solid #ccc; border-radius: 10px; ">
                    <form  method="POST" action="Login">
        		<ul>
                            <font face="Agency FB"  size="4px" ><h2>SIGN IN</h2></font>
				<hr/>
				<li>	
                                    <div><input type="text" class="medium text" name="username" placeholder=" username" required="required"/></div>
        			</li>
        			<li>
                                    <div><input type="password" class="medium text" name="password" placeholder=" Password" required="required"/></div>
        			</li>
                                <li>
                                    <input type="submit" class="button" value="    Continue    " />
                                </li>
				<br/>
				<hr/>
                              <!--    <div>
                                  <center><a href=#>Forgot Password?</a></center>
                                </div>   -->
        		</ul>
                    </form>
                </div>
            </center>
		<div align="center">
                    <br/><br/><br/><hr/>
			 <link rel="stylesheet" href="css/footer.css"/>
                         <%@include file="includes/footer.jsp" %>
		</div>
    </div>
</body>
</html>

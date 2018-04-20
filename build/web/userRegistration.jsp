<html>
<head>
<title>User</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" type="text/css" href="css/form.css"
</head>
<script> 

function validatePassword(){
    var pass2=document.getElementById("pass").value;
    var pass1=document.getElementById("conpass").value;
        if(pass1!==pass2)
            document.getElementById("conpass").setCustomValidity("Passwords Don't Match");

        else
            document.getElementById("conpass").setCustomValidity('');

//empty string means no validation error
}
function autoType() {
	
    var t1=document.getElementById("nic_no");
    var p1=document.getElementById("pass");
    var p2=document.getElementById("conpass");
    var val=t1.value;
        p1.setAttribute('value', val);
        p2.setAttribute('value', val);


}

function resetText(){

    document.getElementById("pass").value="";
    document.getElementById("conpass").value="";



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
                <div class="form">
                    <form  method="POST" action="RegisterUser" >
                        <div class="form_description">
				<h2>  User Registration</h2>
				<p>Use This Form To Register A New User</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul>
                                    <li>
                                        <label class="description" for="nic_no">NIC Number</label>
        				<div><input id="nic_no" type="text" class="large text" name="nic_no" onblur="autoType();" required="required" pattern="[0-9]{9}" placeholder="Enter NIC number without the character at the end" title="Enter NIC number without the character at the end" onblur="this.setCustomValidity('User ID is a must')"/></div>
                                    </li>
                                    <li>
					<label class="description">Name </label>
                                            <span>
						<input name= "initials" class="text" maxlength="255" size="10" value="" required="required" style="text-transform:uppercase;" pattern="[A-Za-z]+"/>
						<label for="street">Initials</label>
                                            </span>
                                            <span>
						<input name= "surname" class="text" maxlength="255" size="26" value="" required="required" pattern="[A-Za-z]+" style="text-transform:uppercase;"/>
						<label for="street">Surname</label>
                                            </span>
                                    </li>
                                    
                                     <li>
					<label class="description" for="tel_no">Tel No</label>
        				<div><input id="tel_no" type="text" class="large text" name="tel_no"  required="required" pattern="[0-9]{10}"></div>
                                    </li>
                                    
                                    <li>
					<label class="description"for="password">Password</label>
        				<div><input id="pass" type="password" class="medium text" name="password" required="required" pattern=".{6,}" title="Six or more characters" onchange="validatePassword();"/></div>
                                    </li>

        			    <li>
					<label class="description"for="con_password">Confirm Password</label>
        				<div><input id="conpass" type="password" class="medium text" name="con_password" required="required" pattern=".{6,}" title="Six or more characters" onchange="validatePassword();"/></div>
                                    </li>

                                    <li>
					<label class="description" for="email">Email</label>
        				<div><input id="email" type="text" class="large text" name="email"  required="required" /></div>
                                    </li>
        			</ul>
                            </div>


                            <li style="border:1px solid gray;width:360px ">
                                <label id = "systemcheck" class="description">User Type</label>
                                    <span>
                                        <input  name="m_type" class="checkbox" type="checkbox" value="Sys_Nurse" />
                                            <label class="choice" for="m_type">Nurse</label>
                                        <input  name="m_type" class="checkbox" type="checkbox" value="Sys_Doc" />
                                            <label class="choice" for="m_type">Doctor</label>
                                        <input  name="m_type" class="checkbox" type="checkbox" value="Sys_Admin" />
                                            <label class="choice" for="m_type">System Administrator</label>
                                    </span>
			</li>

			<li style="height:40px"></li>
			<li>
                            <span>
				<input type="submit" class="button" value="     Submit     "  />
                            </span>
                            <span>
				<input type="reset"  class="button" onclick="resetText();"/>
                            </span>

			</li>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <link rel="stylesheet" href="css/footer.css"/>
        <%@include file="includes/footer.jsp" %>
    </div>
</body>
</html>


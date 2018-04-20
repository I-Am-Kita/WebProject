<%@page import="encrypt.AESCrypto"%>
<%@page import="repository.PatientRepositoty"%>
<html>
<head>
<title>User</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" type="text/css" href="css/form.css"/>
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
                    <form  method="POST" action="EditUser" >
                        <div class="form_description">
				<h2>Edit  User</h2>
				<p>Use This Form To Update A User</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul>
                                    <li>
                                        <input  type="hidden" name="nic_no" value="<%
                                                try {
                                                        int id = Integer.parseInt(request.getParameter("id"));
                                                        out.print(id);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <label class="description" for="nic_no">NIC Number</label>
                                        <div>
                                            <%
                                                try {
                                                        String id = request.getParameter("id");
                                                        out.print(id);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                                        </div>
                                    </li>
                                    <li>
					<label class="description">Name </label>
                                            <span>
						<input name= "initials" class="text" maxlength="255" size="10" value="<%
                                                try {
                                                        String initials = request.getParameter("initials");
                                                        out.print(initials);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" style="text-transform:uppercase;" pattern="[A-Za-z]+"/>
						<label for="street">Initials</label>
                                            </span>
                                            <span>
						<input name= "surname" class="text" maxlength="255" size="26" value="<%
                                                try {
                                                        String surname = request.getParameter("surname");
                                                        out.print(surname);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" pattern="[A-Za-z]+" style="text-transform:uppercase;"/>
						<label for="street">Surname</label>
                                            </span>
                                    </li>
                                    
                                     <li>
					<label class="description" for="tel_no">Tel No</label>
        				<div><input id="tel_no" type="text" class="large text" name="tel_no" value="<%
                                                try {
                                                        String tel_no = request.getParameter("tel_no");
                                                        out.print(tel_no);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" pattern="[0-9]{10}"></div>
                                    </li>
                                    
                                    <li>
					<label class="description"for="password">Password</label>
        				<div><input id="pass" type="password" class="medium text" name="password" value="<%
                                                try {
                                                        String password = request.getParameter("password");
                                                        AESCrypto aESCrypto = new AESCrypto("ThisIsTheKeyyyyy");
                                                        String password1 = aESCrypto.decrypt(password);
                                                        out.print(password1);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" pattern=".{6,}" title="Six or more characters" onchange="validatePassword();"/></div>
                                    </li>

        			    <li>
					<label class="description"for="con_password">Confirm Password</label>
                                        <div><input id="conpass" type="password" class="medium text" name="con_password" value="<%
                                                try {
                                                        String password = request.getParameter("password");
                                                        AESCrypto aESCrypto = new AESCrypto("ThisIsTheKeyyyyy");
                                                        String password1 = aESCrypto.decrypt(password);
                                                        out.print(password1);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" pattern=".{6,}" title="Six or more characters" onchange="validatePassword();"/></div>
                                    </li>

                                    <li>
					<label class="description" for="email">Email</label>
        				<div><input id="email" type="text" class="large text" name="email"  value="<%
                                                try {
                                                        String email = request.getParameter("email");
                                                        out.print(email);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" required="required" /></div>
                                    </li>
        			</ul>
                            </div>


                            <li>
                                        <label class="description" for="m_type">User Type</label>
        				<div>
                                            <%
                                                try {
                                                        String m_type = request.getParameter("m_type");
                                                        out.print(m_type);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                                        </div>
                            </li>

			<li style="height:40px"></li>
			<li>
                            <span>
				<input type="submit" class="button" value="     Submit     "  />
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

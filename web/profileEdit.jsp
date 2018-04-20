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
                    <form  method="POST" action="UpdateProfile" >
                        <div class="form_description">
				<h2>Edit  Profile</h2>
				<p>Use This form to edit your Profile</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul>
                                    <li>
                                        <input  type="hidden" name="nic_no" value="<%
                                                try {
                                                        int id = Integer.parseInt(request.getParameter("nic_no"));
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
                                                        String id = request.getParameter("nic_no");
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
					<%
                                                try {
                                                        String initials = request.getParameter("initials");
                                                        out.print(initials);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
					
                                            </span>
                                            <span>
					<%
                                                try {
                                                        String surname = request.getParameter("surname");
                                                        out.print(surname);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
						
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
                                                        String m_type = request.getParameter("type");
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


<!DOCTYPE html>
<html>
<head>
<title>User</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" type="text/css" href="css/form.css"
</head>
<script>
    function myFunction() {
    alert(<% request.getParameter("msg");%>);
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
                    <form  method="POST" action="RegisterPatient" >
                        <div class="form_description">
				<h2>  Patient Registration</h2>
				<p>Use This Form To Register A New Patient</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul>
                                    <li>
					<label class="description">Name </label>
                                            <span>
						<input name= "initials" class="text" maxlength="255" size="10" value="" required="required"  pattern="[A-Za-z]+"/>
						<label for="street">First</label>
                                            </span>
                                            <span>
						<input name= "surname" class="text" maxlength="255" size="26" value="" required="required" pattern="[A-Za-z]+" />
						<label for="street">Surname</label>
                                            </span>
                                    </li>
                                    <li style="height:15px;" ></li>
                                <!--    <li>
                                        <label class="description">Gender </label>
                                            <span>
						<input type="radio" name="gender" value="male" checked />
						<label for="street">Male</label>
                                            </span>
                                        <span style="width: 20px"> 
						
                                            </span>
                                            <span>
						<input type="radio" name="gender" value="female" />
						<label for="street">Female</label>
                                            </span>
                                    </li>
                                    <li style="height:15px;" ></li>  
                                    <li>
					<label class="description" for="guard">Name of the Guardian</label>
        				<div><input name= "guard" class="text" maxlength="255" size="26"  pattern="[A-Za-z]+" /></div>
                                    </li>  -->
                                    <li>
                            <label class="description" for="guard">Name of the Guardian</label>
				<textarea name="guard" rows="1" cols="50" required="required" placeholder="Name of the Guardian"></textarea>
			</li>
                                   <li>
					<label class="description" for="id">NIC Number</label>
        				<div><input type="number" name="id"/></div>
                                    </li>
                                    <li>
					<label class="description" for="age">Age</label>
        				<div><input type="number" name="age"/></div>
                                    </li>
                                    
                                    <li>
                                        <label class="description" for="tel_no">Tel No</label>
                                        <div><input type="text" id="tel_no" class="large text" name="tel_no" style="width:420px" required="required"  pattern="[0-9]{10}"></div>
                                    </li>
        			</ul>
                            </div>

                            <table>
                        <!--    <li style="border:1px solid gray;width:360px ">
                                <label id = "systemcheck" class="description">System Type</label>
                                    <span>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="cardiovascularSystem" />
                                            <label class="choice" for="o_type">Cardiovascular System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="digestiveSystem" />
                                            <label class="choice" for="o_type">Digestive System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="endocrineSystem" />
                                            <label class="choice" for="o_type">Endocrine System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="dermatologySystem" />
                                            <label class="choice" for="o_type">Dermatology System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="immuneSystem" />
                                            <label class="choice" for="o_type">Immune System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="neuroMuscularSystem" />
                                            <label class="choice" for="o_type">Neuro Muscular System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="nervousSystem" />
                                            <label class="choice" for="o_type">Nervous System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="urinarySystem" />
                                            <label class="choice" for="o_type">Urinary System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="reproductiveSystem" />
                                            <label class="choice" for="o_type">Reproductive System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="respiratorySystem" />
                                            <label class="choice" for="o_type">Respiratory System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="skeletalSystem" />
                                            <label class="choice" for="o_type">Skeletal System</label>
                                    </span>
			</li>   -->
                        
                        <li style="border:1px solid gray;width:360px ">
                                <label id = "systemcheck" class="description">System Type</label>
                                    <span>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="cardiovascularSystem" />
                                            <label class="choice" for="o_type">Cardiovascular System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="respiratorySystem" />
                                            <label class="choice" for="o_type">Respiratory System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="endocrineSystem" />
                                            <label class="choice" for="o_type">Endocrine System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="urinarySystem" />
                                            <label class="choice" for="o_type">Urinary System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="reproductiveSystem" />
                                            <label class="choice" for="o_type">Reproductive System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="nervousSystem" />
                                            <label class="choice" for="o_type">Nervous System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="gastrointestinalSystem" />
                                            <label class="choice" for="o_type">Gastrointestinal System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="musculoskeletalSystem" />
                                            <label class="choice" for="o_type">Musculoskeletal System</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="dermatologySystem" />
                                            <label class="choice" for="o_type">Dermatological Conditions</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="psychiatry" />
                                            <label class="choice" for="o_type">Psychiatry</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="nutrition" />
                                            <label class="choice" for="o_type">Nutrition</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="syndromes" />
                                            <label class="choice" for="o_type">Syndromes</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="infections" />
                                            <label class="choice" for="o_type">Infections</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="haematology" />
                                            <label class="choice" for="o_type">Haematology</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="cancers" />
                                            <label class="choice" for="o_type">Cancers</label>
                                        <input  name="o_type" class="checkbox" type="checkbox" value="eye&ent" />
                                            <label class="choice" for="o_type">Eye & ENT</label>

                                    </span>
                        
		
			<li>
                            <label class="description" for="diagnosis">Diagnosis</label>
				<textarea rows="4" cols="50" name="diagnosis"  required="required" placeholder="Enter Diagnosis Here...(Max 200 Characters)"></textarea>
			</li>

			<li>
                            <label class="description" for="p_co">P:Co</label>
				<textarea rows="4" cols="50" name="p_co" required="required" placeholder="Enter p:co Here...(Max 300 Characters)"></textarea>
			</li>
                        <li>
                            <label class="description" for="hx_p_co">Hx Of P:Co</label>
				<textarea name="hx_p_co" rows="10" cols="50" required="required" placeholder="Enter Hx P:Co Here...(Max 1500 Characters)"></textarea>
			</li>
			<li>
                            <label class="description" for="pmhx">PMHx</label>
				 <textarea name="pmhx" rows="10" cols="50" required="required" placeholder="Enter PMHx Here...(Max 1000 Characters)"></textarea>
			</li>
			<li>
                            <label class="description" for="pshx">PSHx</label>
				 <textarea name="pshx" rows="10" cols="50" required="required" placeholder="Enter PSHx Here...(Max 750 Characters)"></textarea>
			</li>
			<li>
                            <label class="description" for="aihx">AIHx</label>
				<textarea name="aihx" rows="10" cols="50" required="required" placeholder="Enter AIHx Here...(Max 300 Characters)"></textarea>
			</li>
			<li>
                            <label class="description" for="drughx">Drug Hx</label>
				 <textarea name="drughx" rows="10" cols="50" required="required" Placeholder="Enter Drug Hx Here...(Max 1000 Characters)"></textarea>
			</li>
			<li>
                            <label class="description" for="immunizationhx">Immunization Hx</label>
				<textarea name="immunizationhx" rows="10" cols="50" required="required" placeholder="Enter Immunization Hx Here...(Max 500 Characters)"></textarea>
			</li>
			<li>
                            <label class="description" for="socialhx">Social Hx</label>
				<textarea name="socialhx" rows="10" cols="50" required="required" placeholder="Enter Social Hx Here...(Max 1000 Characters)"></textarea>
			</li>
			<li>
					<label class="description" for="familyhx">Family Hx</label>
					 <textarea name="familyhx" rows="10" cols="50" required="required" placeholder="Enter Family Hx Here...(Max 500 Characters)"></textarea>
			</li>
                        <li>
					<label class="description" for="examination">Examination</label>
					 <textarea name="examination" rows="10" cols="50" required="required" placeholder="Enter Examination Here...(Max 750 Characters)"></textarea>
			</li>
                        
                        
			<li style="height:30px"></li>


			<li>
                            <label class="description" for="ix">Ix</label>
				<textarea rows="20" cols="50" name="ix"  placeholder="Enter Ix Here...(Max 2000 Characters)" ></textarea>	
			</li>
                        
                        <li>
                            <label class="description" for="mx">Mx</label>
				<textarea rows="20" cols="50" name="mx"  placeholder="Enter Mx Here...(Max 2000 Characters)" ></textarea>	
			</li>
                        <div style="border:1px solid gray;width:500px ">
                            <label id = "systemcheck" class="description">Changes</label>
				<span>
                                    <li>
					<label class="description" for="system">Current Updates</label>
                                            <textarea name="system" rows="4" cols="50"  placeholder="Enter Current Updates Here...(Max 2000 Characters)"  ></textarea>
                                    </li>

                                </span>
			</div>
			<li style="height:40px"></li>
			<li>
                            <span>
				<input type="submit" class="button" value="     Submit     "  />
                            </span>
                            <span>
				<input type="reset"  class="button" onclick="resetText();"/>
                            </span>

			</li>
                            </table>
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


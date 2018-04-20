<%@page import="java.util.List"%>
<%@page import="repository.PatientRepositoty"%>
<!DOCTYPE html>
<html>
<head>
<title>User</title>
        <link rel="stylesheet" href="css/content.css"/>
        <link rel="stylesheet" href="css/btn.css"/> 
        <link rel="stylesheet" type="text/css" href="css/form.css"
</head>
<body>
    <div id="wrapper">
		
        <link rel="stylesheet" href="css/header.css"/>
        <%@include file="includes/header.jsp" %>

        <link rel="stylesheet" href="css/leftnav.css"/>
        <%@include file="includes/leftnav.jsp" %>

	<div id="contentwrap">
            <div id="content">
                <div class="form">
                    <form  method="POST" action="UpdatePatient" >
                        <div class="form_description">
				<h2>  Update Patient</h2>
				<p>Use This Form To Update A  Patient</p>
			</div>
			<div class="container" style="width:100%;">
                            <div class="container" style="width:49%;display:inline-block;">
				<ul>
                                    <li>
                                        <input  type="hidden" name="num" value="<%
                                                try {
                                                        int num = Integer.parseInt(request.getParameter("num"));
                                                        out.print(num);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="type" value="<%
                                                try {
                                                        String type = request.getParameter("type");
                                                        out.print( type);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="organ" value="<%
                                                try {
                                                        String organ = request.getParameter("organ");
                                                        out.print( organ);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <li>
                                        <input  type="hidden" name="currentAge" value="<%
                                                try {
                                                        int currentAge = Integer.parseInt(request.getParameter("age"));
                                                        out.print( currentAge);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>">
                                
                                    </li>
                                    <%
                                    try {
                                                        String type = request.getParameter("type");
                                                       // out.print( type);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                    
                                    %>
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
                                        %><label for="street">FirstName</label>
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
                                                <label for="street">Surname</label>
                                            </span>
                                    </li>
                                    <li style="height:15px;" ></li>
                                    <li>
					<label class="description" for="guard">Name of the Guardian</label>
        				<div>					<%
                                                try {
                                                        String guard = request.getParameter("guard");
                                                        out.print(guard);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></div>
                                    </li>
                                   <li>
					<label class="description" for="id">NIC Number</label>
        				<div>					<%
                                                try {
                                                        String id = request.getParameter("id");
                                                        out.print(id);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></div>
                                    </li>
                                    <li>
					<label class="description" for="age">Age</label>
        				<div><input class="text" value="<%
                                                try {
                                                        int age = Integer.parseInt(request.getParameter("age"));
                                                        out.print(age);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" name="age"/></div>
                                    </li>
                                    
                                    <li>
                                        <label class="description" for="tel_no">Tel No</label>
                                        <div><input id="tel_no" class="large text" name="tel_no" style="width:420px" required="required" value="<%
                                                try {
                                                        String tel_no = request.getParameter("tel_no");
                                                        out.print(tel_no);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>" pattern="[0-9]{10}"></div>
                                    </li>
        			</ul>
                            </div>


                            <li style="border:1px solid gray;width:360px ">
                                <label id = "systemcheck" class="description">System Type</label>
                                    <span>
                                        <%
                                                try {
                                                        int num = Integer.parseInt(request.getParameter("num"));
                                                        PatientRepositoty patientRepositoty = new PatientRepositoty();
                                                        List<String> patientList = patientRepositoty.getOrganTypesForUpdatePanel(num);
                                                        
                                                                for(String organ : patientList) {
                                                                out.println(organ);
                                                                out.print("</br>");
        }
                                                        
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %>
                                    </span>
			</li>
		
			<li>
                            <label class="description" for="diagnosis">Diagnosis</label>
				<textarea rows="4" cols="50" name="diagnosis"  required="required" placeholder="Enter Diagnosis Here..."><%
                                                try {
                                                        String diagnosis = request.getParameter("diagnosis");
                                                        out.print(diagnosis);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>

			<li>
                            <label class="description" for="p_co">P:Co</label>
				<textarea rows="4" cols="50" name="p_co" required="required" placeholder="Enter p:co Here..."><%
                                                try {
                                                        String p_co = request.getParameter("p_co");
                                                        out.print(p_co);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
                        <li>
                            <label class="description" for="hx_p_co">Hx P:Co</label>
				<textarea name="hx_p_co" rows="10" cols="50" required="required" placeholder="Enter Hx P:Co Here..."><%
                                                try {
                                                        String hx_p_co = request.getParameter("hx_p_co");
                                                        out.print(hx_p_co);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="pmhx">PMHx</label>
				 <textarea name="pmhx" rows="10" cols="50" required="required" placeholder="Enter PMHx Here..."><%
                                                try {
                                                        String pmhx = request.getParameter("pmhx");
                                                        out.print(pmhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="pshx">PSHx</label>
				 <textarea name="pshx" rows="10" cols="50" required="required" placeholder="Enter PSHx Here..."><%
                                                try {
                                                        String pshx = request.getParameter("pshx");
                                                        out.print(pshx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="aihx">AIHx</label>
				<textarea name="aihx" rows="10" cols="50" required="required" placeholder="Enter AIHx Here..."><%
                                                try {
                                                        String aihx = request.getParameter("aihx");
                                                        out.print(aihx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="drughx">Drug Hx</label>
				 <textarea name="drughx" rows="10" cols="50" required="required" Placeholder="Enter Drug Hx Here..."><%
                                                try {
                                                        String drughx = request.getParameter("drughx");
                                                        out.print(drughx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="immunizationhx">Immunization Hx</label>
				<textarea name="immunizationhx" rows="10" cols="50" required="required" placeholder="Enter Immunization Hx Here..."><%
                                                try {
                                                        String immunizationhx = request.getParameter("immunizationhx");
                                                        out.print(immunizationhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
                            <label class="description" for="socialhx">Social Hx</label>
				<textarea name="socialhx" rows="10" cols="50" required="required" placeholder="Enter Social Hx Here..."><%
                                                try {
                                                        String socialhx = request.getParameter("socialhx");
                                                        out.print(socialhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
			<li>
					<label class="description" for="familyhx">Family Hx</label>
					 <textarea name="familyhx" rows="10" cols="50" required="required" placeholder="Enter Family Hx Here..."><%
                                                try {
                                                        String familyhx = request.getParameter("familyhx");
                                                        out.print(familyhx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
                        <li>
					<label class="description" for="examination">Examination</label>
					 <textarea name="examination" rows="10" cols="50" required="required" placeholder="Enter Examination Here..."><%
                                                try {
                                                        String examination = request.getParameter("examination");
                                                        out.print(examination);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>
			</li>
                        
                        
			<li style="height:30px"></li>


			<li>
                            <label class="description" for="ix">Ix</label>
				<textarea rows="20" cols="50" name="ix"  placeholder="Enter Ix Here..." ><%
                                                try {
                                                        String ix = request.getParameter("ix");
                                                        out.print(ix);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>	
			</li>
                        
                        <li>
                            <label class="description" for="mx">Mx</label>
				<textarea rows="20" cols="50" name="mx"  placeholder="Enter Mx Here..." ><%
                                                try {
                                                        String mx = request.getParameter("mx");
                                                        out.print(mx);
                                                     
                                                } catch (Exception e) {
                                                    e.printStackTrace();
                                                         }
                                            %></textarea>	
			</li>
                        <div style="border:1px solid gray;width:500px ">
                            <label id = "systemcheck" class="description">Changes</label>
				<span>
                                    <li>
					<label class="description" for="system">Current Updates</label>
                                            <textarea name="system" rows="4" cols="50"    >None</textarea>
                                    </li>

                                </span>
			</div>
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


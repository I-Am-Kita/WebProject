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
                    <form method="POST" action="SearchPatientByOrganType" >
                        <li style="height:80px;"></li>
                        <li><span style="width:60px;"></span>
                            <span><label class="description" for="guard"><font face="Agency FB" color="black" size="6px" ><Strong>Select Organ Type</Strong></font></label></span>
                            <span style="width:40px;"></span>
                            
                            <span>
                                <div>
                                    <div>
                                        <select name="o_type" style="width:250px; height:40px; background:darkgray;" >
                                            <option value="cardiovascularSystem">Cardiovascular System</option>
                                            <option value="respiratorySystem">Respiratory System</option>
                                            <option value="endocrineSystem">Endocrine System</option>
                                            <option value="urinarySystem">Urinary System</option>
                                            <option value="reproductiveSystem">Reproductive System</option>
                                            <option value="nervousSystem">Nervous System</option>
                                            <option value="gastrointestinalSystem">Gastrointestinal System</option>
                                            <option value="musculoskeletalSystem">Musculoskeletal System</option>
                                            <option value="dermatologySystem">Dermatological Conditions</option>
                                            <option value="psychiatry">Psychiatry</option>
                                            
                                            <option value="nutrition">Nutrition</option>
                                            <option value="syndromes">Syndromes</option>
                                            <option value="infections">Infections</option>
                                            <option value="haematology">Haematology</option>
                                            <option value="cancers">Cancers</option>
                                            <option value="eye&ent">Eye & ENT</option>
                                        </select>
                                    </div>
                                </div>
                            </span>
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




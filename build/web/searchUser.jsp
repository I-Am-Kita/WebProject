<!DOCTYPE html>
<html>
<head>
<title>Member Management</title>



<link rel="stylesheet" type="text/css" href="css/content.css" />
<link rel="stylesheet" type="text/css" href="css/button.css" />
<link rel="stylesheet" type="text/css" href="css/wrapper.css" />
<link rel="stylesheet" type="text/css" href="css/form.css" />
<link rel="stylesheet" type="text/css" href="css/modelwindow.css" />
<link rel="stylesheet" type="text/css" href="css/forumtable.css" />
<link rel="stylesheet" type="text/css" href="css/forum_styles.css" />

<script src="lib/jquery.min.js"></script>

<script>

function changeInput(){                    //This loads combo box or textbox according to the selection

	var combo = $("<select></select>").attr("id", "membertype").attr("name", "membertype").attr("class","small select");

   
    combo.append("<option>Sys_Admin</option>");
    combo.append("<option>Sys_Doc</option>");
    combo.append("<option>Sys_Nurse</option>");

    

	var x = document.getElementById("searchtype").value;      //assigns 1st dropdown menu's value to X
	if(x==='0'){
		document.getElementById("searchinput").innerHTML = "";  //Get value selected in dropdown menu or inserted in the text area

	}

	if(x==='1'){           //if 1st dropdown menu's selection is 1st choise, displays combo box
			 document.getElementById("searchinput").innerHTML = ""; 
			 $("#searchinput").append(combo);                    
	}
	else if(x==='2'){     //if 1st dropdown menu's selection is 2nd choise, displays textbox
		document.getElementById("searchinput").innerHTML = "";       
			 document.getElementById("searchinput").innerHTML = "<input id='nic_no' type='text' class='small text' name='nic_no' required='required' pattern='[0-9]{9}'' title='Enter NIC number without the character at the end' placeholder='Enter NIC No'/>";
	}
	else if(x==='3'){              //if 1st dropdown menu's selection is 3rd choise, displays textbox
		document.getElementById("searchinput").innerHTML = "";
			 document.getElementById("searchinput").innerHTML = "<input id='email' type='email' class='small text' name='email' required='required' placeholder='Enter E-Mail'/>";
	}
	
    
}


function loadXMLDoc()
{
	var x = document.getElementById("searchtype").value;

	if(x==='1'){

			var searchType = document.getElementById("searchtype").value;
			var searchInput = document.getElementById("membertype").value;   //Get the member type from the dropdown menue
			var xmlhttp;
			if (window.XMLHttpRequest)
 			 {                                                              // code for IE7+, Firefox, Chrome, Opera, Safari
 			 xmlhttp=new XMLHttpRequest();
 			 }
			else
  			{                                                              // code for IE6, IE5
  			xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
 			 }
			xmlhttp.onreadystatechange=function()
			  {
			  if (xmlhttp.readyState===4 && xmlhttp.status===200)
			    {
			    document.getElementById("searchResult").innerHTML=xmlhttp.responseText;
			    }
 			 };
 			xmlhttp.open("GET", "searchUser1.java?searchType=" + searchType + "&searchInput=" + searchInput, true);  //Sends a request to member_search.php with member type as search input
		        xmlhttp.send();

			}

	else if(x==='2'){          //###############################################################################################

						var searchType = document.getElementById("searchtype").value;
			var searchInput = document.getElementById("nic_no").value;                        //Get search input for search ny NIC
			var xmlhttp;
			if (window.XMLHttpRequest)
 			 {                                                                             // code for IE7+, Firefox, Chrome, Opera, Safari
 			 xmlhttp=new XMLHttpRequest();
 			 }
			else
  			{                                                                              // code for IE6, IE5
  			xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
 			 }
			xmlhttp.onreadystatechange=function()
			  {
			  if (xmlhttp.readyState===4 && xmlhttp.status===200)
			    {
			    document.getElementById("searchResult").innerHTML=xmlhttp.responseText;
			    }
 			 };
 			xmlhttp.open("GET", "SearchUser2.java?searchType=" + searchType + "&searchInput=" + searchInput, true);  //Sends a request to member_search2.php with member NIC as search input
		        xmlhttp.send();

		        			//#############################################################################################

				}


	else if(x==='3'){

						var searchType = document.getElementById("searchtype").value;       //Get search input for search by email
			var searchInput = document.getElementById("email").value;
			var xmlhttp;
			if (window.XMLHttpRequest)
 			 {                                                                              // code for IE7+, Firefox, Chrome, Opera, Safari
 			 xmlhttp=new XMLHttpRequest();
 			 }
			else
  			{                                                                              // code for IE6, IE5
  			xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
 			 }
			xmlhttp.onreadystatechange=function()
			  {
			  if (xmlhttp.readyState===4 && xmlhttp.status===200)
			    {
			    document.getElementById("searchResult").innerHTML=xmlhttp.responseText;
			    }
 			 };
 			xmlhttp.open("GET", "membeSearch3.php?searchType=" + searchType + "&searchInput=" + searchInput, true); //Sends a request to member_search3.php with member email as search input
		        xmlhttp.send();


                       //################################################################################################

	}

}

</script>


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
        <font face="Agency FB" color="black" size="6px" ><Strong>User Search Panel</Strong></font>
        <br/><br/>
        	
        </div>


		<div  style="text-align:center;">
		 

				
								<select id='searchtype' class="small select" name="dropdown" onchange="changeInput();">    //Creates dropdown menu with 3 options and loads combobox or textbox according to the choise
									<option value="0" selected="selected" >Select Search Method</option>
									<option value="1" >Search by User Type</option>
									<option value="2" >Search by User NIC</option>
									<option value="3" >Search by E-mail</option>

								</select>

				<span id='searchinput' name='searchinput'></span>
							

		
				 <button style="width:10em;" onclick=loadXMLDoc() >   <img src="img/icons/glyphicons_free/glyphicons/png/glyphicons-28-search.png" width="13" height="13" /><font face="Calibri" color="black" size="4"> Search </font></button>


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


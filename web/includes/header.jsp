<%-- 
    Document   : header
    Created on : Nov 12, 2017, 5:49:07 PM
    Author     : ROBIN
--%>
<%@ page session="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div id="headerwrap">
            <div id="header">
		<div id="logo">
                    <img src="img/logo.jpg" width="70px" height="70px" alt="PMS logo"/>
		</div>
		<div id="title">
                    <font face="Agency FB" color="#b5dfeb" size="6px" >Examination Database</font>
		</div>
		<div style="float:right; padding:27px;">
                    <font face="Calibri" color="white" size="4">You Are Logged In As   <strong><span style="text-transform:uppercase;"><a class="head"><c:out value="${sessionScope.user}"/></a></span></strong></font>
		</div>
            </div>
        </div>
    </body>
</html>

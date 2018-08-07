<%-- 
    Document   : HomePage
    Created on : Jun 23, 2018, 3:27:40 PM
    Author     : MR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Home Page</title>
</head>
    <body>
         <jsp:include page="Template.jsp"></jsp:include>
<td valign="top"> <br/><B><I><font style='font-family: 'Brush Script MT Italics', Gadget, sans-serif;' size='+1' color='white'>Sound & Stage Entertainment was founded in 1995. 
It started as an event management company but later acquired land and developed 15 world class movie theaters across the United States. 
Each of these theaters is a multiplex that shows two to four movies at a time. The company generates considerable revenue from these theaters.
</p>
<p>
Sound & Stage Entertainment manages 15 movie theaters. 
Each theater has a booking counter where people can buy tickets for the current and upcoming shows. 
To book the tickets kindly log on to the website.
</p>
<form method='Post' action='SubmitServlet'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='orange' size='+4'>LOGIN AS:
</tr>
</td>
</table>
<table cellspacing='20' align='center'border='4' bordercolor='white'>
<tr><td bordercolor='white'><input type='Radio' value='existinguser' name='r2' CHECKED>Existing User
<tr><td bordercolor='white'><input type='Radio'value='newuser' name='r2'>New User
<tr><td bordercolor='white'><input type='Submit'value='Submit'>
</table>
</form>
</tr>
</table>
<body>
</html>


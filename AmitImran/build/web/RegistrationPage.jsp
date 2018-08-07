<%-- 
    Document   : RegistrationPage
    Created on : Jun 23, 2018, 3:37:19 PM
    Author     : MR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Registration Page</title>
</head>
<body>
    <jsp:include page="Template.jsp"></jsp:include>
<td valign="top">
<form method='post' action='RegisterServlet'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='yellow' size='+4'>New User Registration Form
</tr>
</td>
</table>
<table cellspacing='20' align='center'border='3' bordercolor='white'>
    <tr><td bordercolor='white'><font color="white">User Name:<td COLSPAN='2'bordercolor='white'><input type='text' name='tt1'>
<tr><td bordercolor='white'><font color="white">User Id:<td COLSPAN='2'bordercolor='white'>
<input type='text' name='tt2'>
</tr>
<tr><td bordercolor='white'><font color="white">Password:<td COLSPAN='2'bordercolor='white'>
<input type='password' name='tt3'>
</tr>
<tr><td bordercolor='white'><font color="white">Re-enter Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='tt4'>
<tr><td bordercolor='white'><font color="white">Address:<td COLSPAN='2' bordercolor='white'><input type='textArea' name='tt5'>
<tr><td bordercolor='white'><font color="white">State:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt6'>
<tr><td bordercolor='white'><font color="white">Country:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt7'>
<tr><td bordercolor='white'><input type='Submit'value='Submit'>
<td bordercolor='white'><input type='RESET'value='Reset'>
</table>
</form>
</body>
</html>


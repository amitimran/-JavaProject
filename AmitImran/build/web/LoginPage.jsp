<%-- 
    Document   : LoginPage
    Created on : Jun 23, 2018, 3:34:17 PM
    Author     : MR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Login Page</title>
</head>
<body>
    <jsp:include page="Template.jsp"></jsp:include>
<td valign="top">
<form action='ValidationServlet' method='Post'>
<table cellspacing='10' align='center'>
<tr>
<td><font color='Yellow' size='+4'>Login :
</tr>
</td>
</table>
<table cellspacing='15' align='center'border='3' bordercolor='white'>
    <tr><td bordercolor='white'><font color="white">User Id:<td COLSPAN='0'bordercolor='white'><input type='text' name='uid'>
<tr><td bordercolor='white'><font color="white">Password:<td COLSPAN='0' bordercolor='white'><input type='password' name='pwd'>
<tr><td bordercolor='white'><font color="White">Role:<td bordercolor='white'><input type='Radio'value='posofficers'name='r1'><font color="White">POS Officers
<td bordercolor='white'><input type='Radio'value='user'name='r1'><font color="White">User
<tr><td bordercolor='white'><input type='submit'value='LogOn'>
<td bordercolor='white'><input type='submit'value='Exit'>
</table>
</form>
</body>
</html>


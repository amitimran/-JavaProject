<%-- 
    Document   : WelcomeCustomer
    Created on : Jun 23, 2018, 9:17:14 PM
    Author     : MR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Customer</title>
</head>
<body>
    <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top" rowspan="200"colspan="80">
         <span style="float: right">
         <form method="post" action="LogOut">
   <br> <input type="submit" value="Logout User"/></br>
</form>
            </span>
       <br><br> <font color='#00FF00' size='+5'>Welcome to Sound & Stage Entertainment Website !!</font></br></br>
        <table>
            <ul>
<li><font color='#FF0000'size='+3'><a href='<%out.println(response.encodeURL("Seats Mapping.jsp").toString());%>'><font color="White">Seats Mapping</a></li>
<li><font color='#FF0000'size='+3'><a href='<%out.println(response.encodeURL("Online Ticket.jsp").toString());%>'><font color="White">Online Booking</a></li>           
<li><font color='#FF0000'size='+3'><a href='<%out.println(response.encodeURL("reviews.jsp").toString());%>'><font color="White">Review</a></li>
<li><font color='#FF0000'size='+3'><a href='<%out.println(response.encodeURL("contact.jsp").toString());%>'><font color="White">Contact</a></li>


        </ul>

</table>
</body>
</html>


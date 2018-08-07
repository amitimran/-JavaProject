<%-- 
    Document   : WelcomePosOfficers
    Created on : Jun 23, 2018, 9:16:32 PM
    Author     : MR SINGH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
    try
    {
        session = request.getSession(false);
        if(session.getAttribute("User")==null)
        {
            response.sendRedirect("error.html");
        }
    }catch(NullPointerException exp)
    {
        response.sendRedirect("error.html");
    }
%>
<html>
<head>
<title>POS Officers</title>
</head>
<body>
    <jsp:include page="Template.jsp"></jsp:include>
    <td valign="top" rowspan="200"colspan="80">
        <span style="float: right">
        <form method="post" action="LogOut">
            <br> <input type="submit" value="Logout POS"</br>
</form>
            </span>
       <br><br> <font color='#00FF00' size='+5'>Welcome to Sound & Stage Entertainment Website !!</font></br></br>
        <table>
            <ul>
                
            
                <li><font color="White"size='+3'><a href='<%out.println(response.encodeURL("Movie.jsp").toString());%>'><font color="White">Movies</a></li>
     <li><font color="White"size='+3'><a href='<%out.println(response.encodeURL("LatestCollectionOfMovies.jsp").toString());%>'><font color="White">Latest Collection Of Movies</a></li>
                <li><font color="White"size='+3'><a href='<%out.println(response.encodeURL("GetLogDetails.jsp").toString());%>'><font color="White">Get Log Details</a></li>
        
        </ul>

</table>
</body>
</html>


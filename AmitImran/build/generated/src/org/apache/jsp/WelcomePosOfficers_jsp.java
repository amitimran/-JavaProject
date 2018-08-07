package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomePosOfficers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");

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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>POS Officers</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("    <td valign=\"top\" rowspan=\"200\"colspan=\"80\">\n");
      out.write("        <span style=\"float: right\">\n");
      out.write("        <form method=\"post\" action=\"LogOut\">\n");
      out.write("            <br> <input type=\"submit\" value=\"Logout POS\"</br>\n");
      out.write("</form>\n");
      out.write("            </span>\n");
      out.write("       <br><br> <font color='#00FF00' size='+5'>Welcome to Sound & Stage Entertainment Website !!</font></br></br>\n");
      out.write("        <table>\n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("                <li><font color=\"White\"size='+3'><a href='");
out.println(response.encodeURL("Movie.jsp").toString());
      out.write("'><font color=\"White\">Movies</a></li>\n");
      out.write("     <li><font color=\"White\"size='+3'><a href='");
out.println(response.encodeURL("LatestCollectionOfMovies.jsp").toString());
      out.write("'><font color=\"White\">Latest Collection Of Movies</a></li>\n");
      out.write("                <li><font color=\"White\"size='+3'><a href='");
out.println(response.encodeURL("GetLogDetails.jsp").toString());
      out.write("'><font color=\"White\">Get Log Details</a></li>\n");
      out.write("        \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

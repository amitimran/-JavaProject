package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Registration Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("<td valign=\"top\">\n");
      out.write("<form method='post' action='RegisterServlet'>\n");
      out.write("<table cellspacing='10' align='center'>\n");
      out.write("<tr>\n");
      out.write("<td><font color='yellow' size='+4'>New User Registration Form\n");
      out.write("</tr>\n");
      out.write("</td>\n");
      out.write("</table>\n");
      out.write("<table cellspacing='20' align='center'border='3' bordercolor='white'>\n");
      out.write("    <tr><td bordercolor='white'><font color=\"white\">User Name:<td COLSPAN='2'bordercolor='white'><input type='text' name='tt1'>\n");
      out.write("<tr><td bordercolor='white'><font color=\"white\">User Id:<td COLSPAN='2'bordercolor='white'>\n");
      out.write("<input type='text' name='tt2'>\n");
      out.write("</tr>\n");
      out.write("<tr><td bordercolor='white'><font color=\"white\">Password:<td COLSPAN='2'bordercolor='white'>\n");
      out.write("<input type='password' name='tt3'>\n");
      out.write("</tr>\n");
      out.write("<tr><td bordercolor='white'><font color=\"white\">Re-enter Password:<td COLSPAN='2' bordercolor='white'><input type='password' name='tt4'>\n");
      out.write("<tr><td bordercolor='white'><font color=\"white\">Address:<td COLSPAN='2' bordercolor='white'><input type='textArea' name='tt5'>\n");
      out.write("<tr><td bordercolor='white'><font color=\"white\">State:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt6'>\n");
      out.write("<tr><td bordercolor='white'><font color=\"white\">Country:<td COLSPAN='2' bordercolor='white'><input type='text' name='tt7'>\n");
      out.write("<tr><td bordercolor='white'><input type='Submit'value='Submit'>\n");
      out.write("<td bordercolor='white'><input type='RESET'value='Reset'>\n");
      out.write("</table>\n");
      out.write("</form>\n");
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

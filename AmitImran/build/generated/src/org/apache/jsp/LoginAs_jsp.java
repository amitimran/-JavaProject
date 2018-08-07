package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginAs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Home Page</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("<td valign=\"top\"> <br/><B><I><font style='font-family: 'Brush Script MT Italics', Gadget, sans-serif;' size='+1' color='white'>Sound & Stage Entertainment was founded in 1995. \n");
      out.write("It started as an event management company but later acquired land and developed 15 world class movie theaters across the United States. \n");
      out.write("Each of these theaters is a multiplex that shows two to four movies at a time. The company generates considerable revenue from these theaters.\n");
      out.write("</p>\n");
      out.write("<p>\n");
      out.write("Sound & Stage Entertainment manages 15 movie theaters. \n");
      out.write("Each theater has a booking counter where people can buy tickets for the current and upcoming shows. \n");
      out.write("To book the tickets kindly log on to the website.\n");
      out.write("</p>\n");
      out.write("<form method='Post' action='SubmitServlet'>\n");
      out.write("<table cellspacing='10' align='center'>\n");
      out.write("<tr>\n");
      out.write("<td><font color='orange' size='+4'>LOGIN AS:\n");
      out.write("</tr>\n");
      out.write("</td>\n");
      out.write("</table>\n");
      out.write("<table cellspacing='20' align='center'border='4' bordercolor='white'>\n");
      out.write("<tr><td bordercolor='white'><input type='Radio' value='existinguser' name='r2' CHECKED>Existing User\n");
      out.write("<tr><td bordercolor='white'><input type='Radio'value='newuser' name='r2'>New User\n");
      out.write("<tr><td bordercolor='white'><input type='Submit'value='Submit'>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<body>\n");
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

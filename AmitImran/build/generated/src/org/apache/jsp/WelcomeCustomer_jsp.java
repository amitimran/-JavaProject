package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Customer</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template.jsp", out, false);
      out.write("\n");
      out.write("    <td valign=\"top\" rowspan=\"200\"colspan=\"80\">\n");
      out.write("         <span style=\"float: right\">\n");
      out.write("         <form method=\"post\" action=\"LogOut\">\n");
      out.write("   <br> <input type=\"submit\" value=\"Logout User\"/></br>\n");
      out.write("</form>\n");
      out.write("            </span>\n");
      out.write("       <br><br> <font color='#00FF00' size='+5'>Welcome to Sound & Stage Entertainment Website !!</font></br></br>\n");
      out.write("        <table>\n");
      out.write("            <ul>\n");
      out.write("<li><font color='#FF0000'size='+3'><a href='");
out.println(response.encodeURL("Seats Mapping.jsp").toString());
      out.write("'><font color=\"White\">Seats Mapping</a></li>\n");
      out.write("<li><font color='#FF0000'size='+3'><a href='");
out.println(response.encodeURL("Online Ticket.jsp").toString());
      out.write("'><font color=\"White\">Online Booking</a></li>           \n");
      out.write("<li><font color='#FF0000'size='+3'><a href='");
out.println(response.encodeURL("reviews.jsp").toString());
      out.write("'><font color=\"White\">Review</a></li>\n");
      out.write("<li><font color='#FF0000'size='+3'><a href='");
out.println(response.encodeURL("contact.jsp").toString());
      out.write("'><font color=\"White\">Contact</a></li>\n");
      out.write("\n");
      out.write("\n");
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

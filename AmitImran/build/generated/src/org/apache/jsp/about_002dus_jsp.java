package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_002dus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Cinema World | About Us</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"js/jquery-1.4.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Gill_Sans_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/script.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("<script type=\"text/javascript\" src=\"js/ie_png.js\"></script>\n");
      out.write("<script type=\"text/javascript\">ie_png.fix('.png, .link1 span, .link1');</script>\n");
      out.write("<link href=\"css/ie6.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body id=\"page2\">\n");
      out.write("<!-- START PAGE SOURCE -->\n");
      out.write("<div class=\"tail-top\">\n");
      out.write("  <div class=\"tail-bottom\">\n");
      out.write("    <div id=\"main\">\n");
      out.write("      <div id=\"header\">\n");
      out.write("        <div class=\"row-1\">\n");
      out.write("          <div class=\"fleft\"><a href=\"#\">Cinema <span>World</span></a></div>\n");
      out.write("   \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row-2\">\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"Movie Theaters.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"about-us.jsp\" class=\"active\">About</a></li>\n");
      out.write("                     \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"content\">\n");
      out.write("        <div class=\"line-hor\"></div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("          <div class=\"border-right\">\n");
      out.write("            <div class=\"border-left\">\n");
      out.write("              <div class=\"inner\">\n");
      out.write("                <h3>About <span>The Project</span></h3>\n");
      out.write("                <p class=\"p1\">I, Amit Singh and Imran Siddique are here to present our project on Topic Sound and Stage Entertainment.Basically, its all about Entertainment,Entertainment and Entertainment.</p>\n");
      out.write("                <p>Sound & Stage Entertainment was founded in 1995. It started as an event management company but later acquired land and developed 15 world class movie theaters across the United States. Each of these theaters is a multiplex that shows two to four movies at a time. The company generates considerable revenue from these theaters.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("          <h3>Our <span>Team Members</span></h3>\n");
      out.write("          <ul class=\"list\">\n");
      out.write("              <li><img src=\"images/poonam.jpg\" alt=\"\" /><a href=\"#\">Team Helper</a><br />\n");
      out.write("              Our Team Helper is Ma'am Poonam Gaba.She is very kind with all of us.She took a kind Interest and helped us in the project.</li>\n");
      out.write("            <li><img src=\"images/amit.JPG\" alt=\"\" /><a href=\"https://www.facebook.com/amit.singh.7121\">Team Leader</a><br />\n");
      out.write("              I,Amit Singh Working as a TL (Team Leader) in this Project.Iam hard Working and has Leadership Quality and Iam Quick Learner.</li>\n");
      out.write("            <li><img src=\"images/2page-img2.jpg\" alt=\"\" /><a href=\"https://www.facebook.com/profile.php?id=100011565064237\">Team Member</a><br />\n");
      out.write("              I, Imran Siddique Working as a Team Member in this Project.I have good Communication Skills and Iam Adaptive and Innovative.</li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"footer\">\n");
      out.write("        <div class=\"left\">\n");
      out.write("          <div class=\"right\">\n");
      out.write("            <div class=\"footerlink\">\n");
      out.write("              <p class=\"lf\">Copyright &copy; 2010 <a href=\"#\">SiteName</a> - All Rights Reserved</p> <div style=\"clear:both;\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\"> Cufon.now(); </script>\n");
      out.write("<!-- END PAGE SOURCE -->\n");
      out.write("</body>\n");
      out.write("</html>");
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

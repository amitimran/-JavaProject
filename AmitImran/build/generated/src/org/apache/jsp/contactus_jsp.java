package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("\tBroadcast by TEMPLATED\n");
      out.write("\ttemplated.co @templatedco\n");
      out.write("\tReleased for free under the Creative Commons Attribution 3.0 license (templated.co/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t\t<title>Contact us</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("</head>\n");
      out.write("\t<body>\n");
      out.write("<header id=\"header\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<a href=\"#menu\"><span>Menu</span></a>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t\t\t<nav id=\"menu\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"contactus.jsp\">contact us</a></li>\n");
      out.write("                                 </ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<!-- Banner -->\n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\t\tTo use a video as your background, set data-video to the name of your video without\n");
      out.write("\t\t\t\tits extension (eg. images/banner). Your video must be available in both .mp4 and .webm\n");
      out.write("\t\t\t\tformats to work correctly.\n");
      out.write("\t\t\t-->\n");
      out.write("\t\t\t\t<section id=\"banner\" data-video=\"images/banner\">\n");
      out.write("\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<h2>Contact Me</h2>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"field half first\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"name\">Name</label>\n");
      out.write("\t\t\t\t\t\t\t<input name=\"name\" id=\"name\" type=\"text\" placeholder=\"Name\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"field half\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<input name=\"email\" id=\"email\" type=\"email\" placeholder=\"Email\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"field\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"message\">Message</label>\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"message\" id=\"message\" rows=\"6\" placeholder=\"Message\"></textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<ul class=\"actions\">\n");
      out.write("\t\t\t\t\t\t\t<li><input value=\"Send Message\" class=\"button alt\" type=\"submit\"></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon round fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon round fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"icon round fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t&copy; Untitled. Design: <a href=\"https://templated.co\">TEMPLATED</a>. Images: <a href=\"https://unsplash.com\">Unsplash</a>.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
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

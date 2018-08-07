package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tRoad Trip by TEMPLATED\n");
      out.write("\t\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Sound & Stage Entertainment</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<a href=\"#menu\"><span>Menu</span></a>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t\t<nav id=\"menu\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("                                        <li><a href=\"LoginAs.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<section id=\"banner\" class=\"bg-img\" data-bg=\"pic11.jpg\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t<h1><font color=\"yellow\">Sound & Stage Entertainment</h1>\n");
      out.write("\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"#one\" class=\"more\"></a>\n");
      out.write("\t\t\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- One -->\n");
      out.write("\t\t\t<section id=\"one\" class=\"wrapper post bg-img\" data-bg=\"pic12.jpg\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<article class=\"box\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>Sound Class</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<p>Sound & Stage Entertainment was founded in 1995. It started as an event management company but later acquired land and developed 15 world class movie theaters across the United States. Each of these theaters is a multiplex that shows two to four movies at a time. The company generates considerable revenue from these theaters.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"generic.html\"</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t</div>.\n");
      out.write("\t\t\t\t<a href=\"#two\" class=\"more\"></a>\n");
      out.write("\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<!-- Two -->\n");
      out.write("\t\t\t<section id=\"two\" class=\"wrapper post bg-img\" data-bg=\"pic13.jpg\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<article class=\"box\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>Entertainment,Entertainment and Entertainment</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<p>Sound & Stage Entertainment manages 15 movie theaters. Each theater has a booking counter where people can buy tickets for the current and upcoming shows. In addition, people can enquire about seat availability for a particular show over the phone.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<footer>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"generic.html\"</a>\n");
      out.write("\t\t\t\t\t\t</footer>\n");
      out.write("\t\t\t\t\t</article>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t\t<footer id=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"icons\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://twitter.com/login\" class=\"icon round fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.facebook.com\" class=\"icon round fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://www.instagram.com\" class=\"icon round fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t\t\t\t&copy; Untitled. Design: <a href=\"https://templated.co\">TEMPLATED</a>. Images: <a href=\"https://unsplash.com\">Unsplash</a>.\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/jquery.scrollex.min.js\"></script>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Movie_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Cinema A Entertainment Category Flat Bootstarp Resposive Website Template | Home :: w3layouts</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/style_1.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Cinema Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"full\">\n");
      out.write("\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a class=\"active\" href=\"Movie.jsp\"><i class=\"home\"></i></a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"top-header\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t<p>Movie Theater</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Search..\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search..';}\"/>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-info\">\n");
      out.write("\t\t\t\t<h1>BIG HERO 6</h1>\n");
      out.write("\t\t\t\t<p class=\"age\"><a href=\"#\">All Age</a> Don Hall, Chris Williams</p>\n");
      out.write("\t\t\t\t<p class=\"review\">Rating\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp;  8,5/10</p>\n");
      out.write("\t\t\t\t<p class=\"review reviewgo\">Genre\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : &nbsp;&nbsp; Animation, Action, Comedy</p>\n");
      out.write("\t\t\t\t<p class=\"review\">Release &nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;&nbsp; 7 November 2014</p>\n");
      out.write("\t\t\t\t<p class=\"special\">The special bond that develops between plus-sized inflatable robot Baymax, and prodigy Hiro Hamada, who team up with a group of friends to form a band of high-tech heroes.</p>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"review-slider\">\n");
      out.write("\t\t\t <ul id=\"flexiselDemo1\">\n");
      out.write("\t\t\t<li><img src=\"images/r1.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/r2.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/r3.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/r4.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/r5.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/r6.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(window).load(function() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t  $(\"#flexiselDemo1\").flexisel({\n");
      out.write("\t\t\t\tvisibleItems: 6,\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\tpauseOnHover: false,\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\tportrait: { \n");
      out.write("\t\t\t\t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t\tvisibleItems: 2\n");
      out.write("\t\t\t\t\t}, \n");
      out.write("\t\t\t\t\tlandscape: { \n");
      out.write("\t\t\t\t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\ttablet: { \n");
      out.write("\t\t\t\t\t\tchangePoint:768,\n");
      out.write("\t\t\t\t\t\tvisibleItems: 4\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"video\">\n");
      out.write("\t\t\t<iframe  src=\"https://www.youtube.com/embed/2LqzF5WauAw\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"news\">\n");
      out.write("\t\t\t<div class=\"col-md-6 news-left-grid\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"more-reviews\">\n");
      out.write("\t\t\t <ul id=\"flexiselDemo2\">\n");
      out.write("\t\t\t<li><img src=\"images/m1.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/m2.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/m3.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t\t<li><img src=\"images/m4.jpg\" alt=\"\"/></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(window).load(function() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t  $(\"#flexiselDemo2\").flexisel({\n");
      out.write("\t\t\t\tvisibleItems: 4,\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\tpauseOnHover: false,\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t\t\tresponsiveBreakpoints: { \n");
      out.write("\t\t\t\t\tportrait: { \n");
      out.write("\t\t\t\t\t\tchangePoint:480,\n");
      out.write("\t\t\t\t\t\tvisibleItems: 2\n");
      out.write("\t\t\t\t\t}, \n");
      out.write("\t\t\t\t\tlandscape: { \n");
      out.write("\t\t\t\t\t\tchangePoint:640,\n");
      out.write("\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\ttablet: { \n");
      out.write("\t\t\t\t\t\tchangePoint:768,\n");
      out.write("\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class videos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Cinema A Entertainment Category Flat Bootstarp Resposive Website Template | Videos :: w3layouts</title>\n");
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
      out.write("\t\t\t\t\t<li><a href=\"Movie.jsp\"><div class=\"hm\"><i class=\"home1\"></i><i class=\"home2\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"video-content\">\n");
      out.write("\t\t\t<div class=\"top-header span_top\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t<p>Movie Theater</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"search v-search\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Search..\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search..';}\"/>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right-content\">\n");
      out.write("\t\t\t\t<div class=\"right-content-heading\">\n");
      out.write("\t\t\t\t\t<div class=\"right-content-heading-left\">\n");
      out.write("\t\t\t\t\t\t<h3 class=\"head\">Latest Collection of videos</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- pop-up-box --> \n");
      out.write("\t\t<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t <script>\n");
      out.write("\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t$('.popup-with-zoom-anim').magnificPopup({\n");
      out.write("\t\t\t\t\ttype: 'inline',\n");
      out.write("\t\t\t\t\tfixedContentPos: false,\n");
      out.write("\t\t\t\t\tfixedBgPos: true,\n");
      out.write("\t\t\t\t\toverflowY: 'auto',\n");
      out.write("\t\t\t\t\tcloseBtnInside: true,\n");
      out.write("\t\t\t\t\tpreloader: false,\n");
      out.write("\t\t\t\t\tmidClick: true,\n");
      out.write("\t\t\t\t\tremovalDelay: 300,\n");
      out.write("\t\t\t\t\tmainClass: 'my-mfp-zoom-in'\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t</script>\t\t\n");
      out.write("\n");
      out.write("\t\t<!--//pop-up-box -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"content-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum1.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("\t\t\t\t\t\t<iframe  src=\"https://www.youtube.com/embed/2LqzF5WauAw\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum2.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum3.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum4.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum5.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum6.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum7.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum8.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum9.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum10.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum11.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"content-grid last-grid\">\n");
      out.write("\t\t\t\t\t\t<a class=\"play-icon popup-with-zoom-anim\" href=\"#small-dialog\"><img src=\"images/gridallbum1.jpg\" title=\"allbum-name\" /></a>\n");
      out.write("\t\t\t\t\t\t<h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</h3>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/likes.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/views.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><img src=\"images/link.png\" title=\"image-name\" /></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"button play-icon popup-with-zoom-anim\" href=\"#small-dialog\">Watch now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t<div class=\"pagenation\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Next</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<h6>Disclaimer : </h6>\n");
      out.write("\t\t<p class=\"claim\">This is a freebies and not an official website, I have no intention of disclose any movie, brand, news.My goal here is to train or excercise my skill and share this freebies.</p>\n");
      out.write("\t\t<a href=\"example@mail.com\">example@mail.com</a>\n");
      out.write("\t\n");
      out.write("\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Cinema A Entertainment Category Flat Bootstarp Resposive Website Template | Contact :: w3layouts</title>\n");
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
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a class=\"active\" href=\"contact.jsp\"><div class=\"cnt\"><i class=\"contact\"></i><i class=\"contact1\"></i></div></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"contact-content\">\n");
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
      out.write("\t\t\t<!---contact-->\n");
      out.write("<div class=\"main-contact\">\n");
      out.write("\t\t <h3 class=\"head\">CONTACT</h3>\n");
      out.write("\t\t <p>WE'RE ALWAYS HERE TO HELP YOU</p>\n");
      out.write("\t\t <div class=\"contact-form\">\n");
      out.write("\t\t\t <form>\n");
      out.write("\t\t\t\t <div class=\"col-md-6 contact-left\">\n");
      out.write("\t\t\t\t\t  <input type=\"text\" placeholder=\"Name\" required/>\n");
      out.write("\t\t\t\t\t  <input type=\"text\" placeholder=\"E-mail\" required/>\n");
      out.write("\t\t\t\t\t  <input type=\"text\" placeholder=\"Phone\" required/>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"col-md-6 contact-right\">\n");
      out.write("\t\t\t\t\t <textarea placeholder=\"Message\"></textarea>\n");
      out.write("\t\t\t\t\t <input type=\"submit\" value=\"SEND\"/>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t </form>\n");
      out.write("\t     </div>\n");
      out.write("\t\t <div class=\"contact_info\">\n");
      out.write("\t\t\t <h3>Find Us Here</h3>\n");
      out.write("\t\t\t <div class=\"map\">\n");
      out.write("\t\t\t\t<iframe width=\"100%\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed\"></iframe><br><small><a href=\"https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265\" style=\"color:#000;text-align:left;font-size:12px\">View Larger Map</a></small>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t </div>\n");
      out.write("</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<h6>Disclaimer : </h6>\n");
      out.write("\t\t<p class=\"claim\">This is a freebies and not an official website, I have no intention of disclose any movie, brand, news.My goal here is to train or excercise my skill and share this freebies.</p>\n");
      out.write("\t\t<a href=\"example@mail.com\">example@mail.com</a>\n");
      out.write("\t\t<div class=\"copyright\">\n");
      out.write("\t\t\t<p> Template by  <a href=\"http://w3layouts.com\">  W3layouts</a></p>\n");
      out.write("\t\t</div>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reviews_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Cinema A Entertainment Category Flat Bootstarp Resposive Website Template | Reviews :: w3layouts</title>\n");
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
      out.write("\t\t\t\t\t<li><a class=\"active\" href=\"reviews.jsp\"><div class=\"cat\"><i class=\"watching\"></i><i class=\"watching1\"></i></div></a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"review-content\">\n");
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
      out.write("\t\t\t<div class=\"reviews-section\">\n");
      out.write("\t\t\t\t<h3 class=\"head\">Movie Reviews</h3>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-9 reviews-grids\">\n");
      out.write("\t\t\t\t\t\t<div class=\"review\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.jsp\"><img src=\"images/r4.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"review-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"span\" href=\"single.jsp\">Lorem  <i>Movie Review</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"dirctr\"><a href=\"\">Reagan Gavin Rasquinha, </a>TNN, Mar 12, 2015, 12.47PM IST</p>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">Critic's Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;3.5/5  \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">Avg Readers' Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating c-rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div> \t\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; 3.3/5</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"yrw\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-button\">           \t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"dropdown\" tabindex=\"9\" data-settings='{\"wrapperClass\":\"flat\"}'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Your rating</option>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1.Poor</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">1.5(Below average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2.Average</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">2.5(Above average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">3.Watchable</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">3.5(Good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"7\">4.5(Very good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"8\">5.Outstanding</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rtm text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">REVIEW THIS MOVIE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"wt text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">WATCH THIS TRAILER</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Will Smith, Margot Robbie, Adrian Martinez, Rodrigo Santoro, BD Wong, Robert Taylor</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;Glenn Ficarra, John Requa</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Crime</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DURATION:&nbsp;&nbsp;&nbsp; &nbsp; 1 hour 45 minutes</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"review\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.jsp\"><img src=\"images/r6.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"review-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"span\" href=\"single.jsp\">Lorem  <i>Movie Review</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"dirctr\"><a href=\"\">Reagan Gavin Rasquinha, </a>TNN, Mar 12, 2015, 12.47PM IST</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">Critic's Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;3.5/5  \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">Avg Readers' Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating c-rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div> \t\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; 3.3/5</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"yrw\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-button\">           \t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"dropdown\" tabindex=\"9\" data-settings='{\"wrapperClass\":\"flat\"}'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Your rating</option>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1.Poor</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">1.5(Below average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2.Average</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">2.5(Above average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">3.Watchable</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">3.5(Good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"7\">4.5(Very good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"8\">5.Outstanding</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rtm text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">REVIEW THIS MOVIE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"wt text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">WATCH THIS TRAILER</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Will Smith, Margot Robbie, Adrian Martinez, Rodrigo Santoro, BD Wong, Robert Taylor</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;Glenn Ficarra, John Requa</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Crime</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DURATION:&nbsp;&nbsp;&nbsp; &nbsp; 1 hour 45 minutes</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"review\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.jsp\"><img src=\"images/r5.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"review-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"span\" href=\"single.jsp\">Lorem  <i>Movie Review</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"dirctr\"><a href=\"\">Reagan Gavin Rasquinha, </a>TNN, Mar 12, 2015, 12.47PM IST</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">Critic's Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;3.5/5  \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">Avg Readers' Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating c-rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div> \t\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; 3.3/5</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"yrw\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-button\">           \t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"dropdown\" tabindex=\"9\" data-settings='{\"wrapperClass\":\"flat\"}'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Your rating</option>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1.Poor</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">1.5(Below average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2.Average</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">2.5(Above average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">3.Watchable</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">3.5(Good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"7\">4.5(Very good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"8\">5.Outstanding</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rtm text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">REVIEW THIS MOVIE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"wt text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">WATCH THIS TRAILER</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Will Smith, Margot Robbie, Adrian Martinez, Rodrigo Santoro, BD Wong, Robert Taylor</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;Glenn Ficarra, John Requa</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Crime</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DURATION:&nbsp;&nbsp;&nbsp; &nbsp; 1 hour 45 minutes</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"review\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.jsp\"><img src=\"images/r1.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"review-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"span\" href=\"single.jsp\">Lorem  <i>Movie Review</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"dirctr\"><a href=\"\">Reagan Gavin Rasquinha, </a>TNN, Mar 12, 2015, 12.47PM IST</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">Critic's Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;3.5/5  \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">Avg Readers' Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating c-rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div> \t\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; 3.3/5</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"yrw\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-button\">           \t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"dropdown\" tabindex=\"9\" data-settings='{\"wrapperClass\":\"flat\"}'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Your rating</option>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1.Poor</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">1.5(Below average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2.Average</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">2.5(Above average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">3.Watchable</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">3.5(Good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"7\">4.5(Very good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"8\">5.Outstanding</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rtm text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">REVIEW THIS MOVIE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"wt text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">WATCH THIS TRAILER</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Will Smith, Margot Robbie, Adrian Martinez, Rodrigo Santoro, BD Wong, Robert Taylor</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;Glenn Ficarra, John Requa</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Crime</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DURATION:&nbsp;&nbsp;&nbsp; &nbsp; 1 hour 45 minutes</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"review\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"movie-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.jsp\"><img src=\"images/r3.jpg\" alt=\"\" /></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"review-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"span\" href=\"single.jsp\">Lorem  <i>Movie Review</i></a>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"dirctr\"><a href=\"\">Reagan Gavin Rasquinha, </a>TNN, Mar 12, 2015, 12.47PM IST</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">Critic's Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;3.5/5  \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview c-rating\">Avg Readers' Rating:</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div> \t\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"ratingview\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp; 3.3/5</p>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"yrw\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"dropdown-button\">           \t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"dropdown\" tabindex=\"9\" data-settings='{\"wrapperClass\":\"flat\"}'>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Your rating</option>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1.Poor</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"2\">1.5(Below average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"3\">2.Average</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"4\">2.5(Above average)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"5\">3.Watchable</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"6\">3.5(Good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"7\">4.5(Very good)</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"8\">5.Outstanding</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"rtm text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">REVIEW THIS MOVIE</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"wt text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">WATCH THIS TRAILER</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">CAST:&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Will Smith, Margot Robbie, Adrian Martinez, Rodrigo Santoro, BD Wong, Robert Taylor</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DIRECTION: &nbsp;&nbsp;&nbsp;&nbsp;Glenn Ficarra, John Requa</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">GENRE:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Crime</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"info\">DURATION:&nbsp;&nbsp;&nbsp; &nbsp; 1 hour 45 minutes</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 side-bar\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!---->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
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
      out.write("\t\t\t\t\t\tvisibleItems: 3\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\t\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t\n");
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

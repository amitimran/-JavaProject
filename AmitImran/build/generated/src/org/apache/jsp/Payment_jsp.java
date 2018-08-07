package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Payment Form Widget Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Payment Form Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/paystyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Fugaz+One' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Alegreya+Sans:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<h1>Payment Form Widget</h1>\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t$(document).ready(function () {\n");
      out.write("\t\t\t\t\t\t\t$('#horizontalTab').easyResponsiveTabs({\n");
      out.write("\t\t\t\t\t\t\t\ttype: 'default', //Types: default, vertical, accordion           \n");
      out.write("\t\t\t\t\t\t\t\twidth: 'auto', //auto or any width like 600px\n");
      out.write("\t\t\t\t\t\t\t\tfit: true   // 100% fit in a container\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t\t<div class=\"sap_tabs\">\n");
      out.write("\t\t\t\t\t\t\t<div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pay-tabs\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Select Payment Method</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <ul class=\"resp-tabs-list\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-0\" role=\"tab\"><span><label class=\"pic1\"></label>Credit Card</span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-1\" role=\"tab\"><span><label class=\"pic3\"></label>Net Banking</span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-2\" role=\"tab\"><span><label class=\"pic4\"></label>PayPal</span></li> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <li class=\"resp-tab-item\" aria-controls=\"tab_item-3\" role=\"tab\"><span><label class=\"pic2\"></label>Debit Card</span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"resp-tabs-container\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"payment-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Personal Information</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-for\">\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>EMAIL ADDRESS</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>FIRST NAME</h5>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"pay-title\">Credit Card Info</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-for\">\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>NAME ON CARD</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>CARD NUMBER</h5>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"pay-logo\" type=\"text\" value=\"0000-0000-0000-0000\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '0000-0000-0000-0000';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"transaction\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-form-left user-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>EXPIRATION</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"text_box\" type=\"text\" value=\"6\" min=\"1\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"text_box\" type=\"text\" value=\"1988\" min=\"1\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-form-right user-form-rt\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>CVV NUMBER</h5>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"xxxx\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'xxxx';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  id=\"brand\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"brand\"><span></span>By checking this box, I agree to the Terms & Conditions & Privacy Policy.</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"payment-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Net Banking</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"radio-btns\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"swit\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\" checked=\"\"><i></i>Andhra Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Allahabad Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Bank of Baroda</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Canara Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>IDBI Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Icici Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Indian Overseas Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Punjab National Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>South Indian Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>State Bank Of India</label> </div></div>\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"swit\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\" checked=\"\"><i></i>City Union Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>HDFC Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>IndusInd Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Syndicate Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Deutsche Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Corporation Bank</label> </div></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>UCO Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Indian Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>Federal Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"check_box\"> <div class=\"radio\"> <label><input type=\"radio\" name=\"radio\"><i></i>ING Vysya Bank</label> </div></div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Continue</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"payment-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>PayPal</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>Already Have A PayPal Account?</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"login-tab\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>Login</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"name@email.com\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'name@email.com';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" value=\"PASSWORD\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'PASSWORD';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-grids\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  id=\"brand1\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"brand1\"><span></span>Remember me?</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"user-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"LOGIN\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-3\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"payment-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"pay-title\">Dedit Card Info</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-for\">\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>NAME ON CARD</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>CARD NUMBER</h5>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"pay-logo\" type=\"text\" value=\"0000-0000-0000-0000\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '0000-0000-0000-0000';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"transaction\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-form-left user-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>EXPIRATION</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"text_box\" type=\"text\" value=\"6\" min=\"1\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"text_box\" type=\"text\" value=\"1988\" min=\"1\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tab-form-right user-form-rt\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<h5>CVV NUMBER</h5>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"xxxx\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'xxxx';}\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"SUBMIT\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"single-bottom\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  id=\"brand\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"brand\"><span></span>By checking this box, I agree to the Terms & Conditions & Privacy Policy.</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<p class=\"footer\">Copyright © 2016 Payment Form Widget. All Rights Reserved | Template by <a href=\"https://w3layouts.com/\" target=\"_blank\">w3layouts</a></p>\n");
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

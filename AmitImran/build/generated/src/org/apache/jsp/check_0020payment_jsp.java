package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_0020payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <title>Payment Form Widget Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Payment Form Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/paystyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Fugaz+One' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Alegreya+Sans:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <SCRIPT>\n");
      out.write("var date = new Date();\n");
      out.write("var month = date.getMonth()+1;\n");
      out.write("var day = date.getDate();\n");
      out.write("var year = date.getFullYear();\n");
      out.write("var output= month + '/' +day + '/' + year;\n");
      out.write("function compareDate()\n");
      out.write("{\n");
      out.write("\tif(Date.parse(document.form1.bookingdate.value)<Date.parse(output)){\n");
      out.write("\t\talert(\"You cannot select a date less than the current date\");\n");
      out.write("\t\t}\n");
      out.write("}\n");
      out.write("function checkNum() \n");
      out.write("{\n");
      out.write("\tx = event.charCode;\n");
      out.write("\tif (( x >= 65  && x <=90) || (x >= 97 && x <=122))\n");
      out.write("\t{\n");
      out.write("\t\talert(\"Enter Numeric Value\");\n");
      out.write("\t\tdocument.form1.num.value='';\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function total()\n");
      out.write("{\n");
      out.write("\tif(document.form1.num.value>20)\n");
      out.write("\t{\n");
      out.write("\t\talert(\"You cannot book more than 20 tickets at a time\");\n");
      out.write("\t\tdocument.form1.num.value='';\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\tdocument.form1.totalprice.value=(document.form1.price.value)*(document.form1.num.value);\n");
      out.write("}\n");
      out.write("function check()\n");
      out.write("{\n");
      out.write("\tfor( i = 0; i <= document.form1.RB.length; i++ ){\n");
      out.write("\n");
      out.write("\t\tif(document.form1.RB[0].checked==true) {\n");
      out.write(" \t\t\t document.form1.price.value=100;\n");
      out.write("\t\t}else if(document.form1.RB[1].checked==true) {\n");
      out.write(" \t\t\t document.form1.price.value=140;\n");
      out.write("\t\t}else if(document.form1.RB[2].checked==true) {\n");
      out.write("\t\t\t document.form1.price.value=200;\n");
      out.write("\t\t}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function sub()\n");
      out.write("{\n");
      out.write("\tif((document.form1.usrname.value!='')&&(document.form1.num.value!='')&&(Date.parse(document.form1.bookingdate.value)>Date.parse(output))&&(document.form1.sel.value!=0)&&(document.form1.timing.value!=7))\n");
      out.write("\t{\n");
      out.write("\t\talert(\"Your tickets have been booked.\");\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function validate()\n");
      out.write("{\n");
      out.write("\tif((document.form1.sel.value==0)||(document.form1.timing.value==7)||(Date.parse(document.form1.bookingdate.value)<Date.parse(output)))\n");
      out.write("\t{\n");
      out.write("\t\talert(\"Please select the date, movie name, and movie timings.\");\n");
      out.write("\t\treturn false\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\treturn true\n");
      out.write("}\n");
      out.write("</SCRIPT>\n");
      out.write("\n");
      out.write("<STYLE type=\"text/css\">\n");
      out.write("#submit{\n");
      out.write("margin-left:100px;\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("font-size:20px;\n");
      out.write("background-color:white;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("text-align:left;\n");
      out.write("font-size:20px;\n");
      out.write("}\n");
      out.write("table{\n");
      out.write("border:1px solid green;\n");
      out.write("}\n");
      out.write("form{\n");
      out.write("float:left;\n");
      out.write("margin-right:20px;\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("font-size:20px;}\n");
      out.write("h2{\n");
      out.write("background-color:green;\n");
      out.write("border:1px solid green;\n");
      out.write("margin-left:460px;}\n");
      out.write(".auto-style{\n");
      out.write("/* Chrome  */\n");
      out.write("overflow-x:-webkit-marquee;\n");
      out.write("-webkit-marquee-direction: up;\n");
      out.write("-webkit-marquee-style: scroll;\n");
      out.write("-webkit-marquee-speed:normal;\n");
      out.write("-webkit-marquee-increment: small;\n");
      out.write("-webkit-marquee-repetition: infinite;\n");
      out.write("}\n");
      out.write("</STYLE>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <h1><font color=\"red\">Sound And Stage Entertainment</h1>\n");
      out.write("            \n");
      out.write("            <a class=\"action action--buy\" href=\"AlertsUpdates.jsp\" role=\"button\">Alerts & Updates !!!</a>\n");
      out.write("            \n");
      out.write("            <div class=\"content\">\n");
      out.write("\n");
      out.write("                <script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        $('#horizontalTab').easyResponsiveTabs({\n");
      out.write("                            type: 'default', //Types: default, vertical, accordion           \n");
      out.write("                            width: 'auto', //auto or any width like 600px\n");
      out.write("                            fit: true   // 100% fit in a container\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("               <FORM name=\"form1\" onsubmit=\"return validate();\">\n");
      out.write("<TABLE>\n");
      out.write("<TR>\n");
      out.write("<TH colspan=\"2\">Book Your Tickets Online</TH>\n");
      out.write("</TR>\n");
      out.write("<TD>Name</TD>\n");
      out.write("<TD><INPUT type=\"text\" name=\"usrname\" placeholder=\"Enter Your Name\" required></TD>\n");
      out.write("</TR>\n");
      out.write("<TR> \n");
      out.write("<TD> Date of Bookings</TD>\n");
      out.write("<TD><INPUT type=\"date\" id=\"bookingdate\" required \n");
      out.write("onchange=\"compareDate();\"></TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>Movie</TD>\n");
      out.write("<TD><SELECT id=\"sel\">\n");
      out.write("<OPTION value=\"0\">Select Movie</OPTION>\n");
      out.write("<OPTGROUP label=\"Drama\">\n");
      out.write("<OPTION value=\"1\">Nightmare</OPTION>\n");
      out.write("<OPTION value=\"2\">Along Polly Came</OPTION>\n");
      out.write("</OPTGROUP>\n");
      out.write("<OPTGROUP label=\"Thriller\"> \n");
      out.write("<OPTION value=\"3\">Source Code</OPTION>\n");
      out.write("<OPTION value=\"4\">If only</OPTION>\n");
      out.write("</OPTGROUP>\n");
      out.write("<OPTGROUP label=\"Romantic\">\n");
      out.write("<OPTION value=\"5\">A walk to remember</OPTION>\n");
      out.write("<OPTION value=\"6\">Angel</OPTION>\n");
      out.write("</OPTGROUP>\n");
      out.write("</SELECT></TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>Show Timings</TD>\n");
      out.write("<TD><SELECT id=\"timing\">\n");
      out.write("<OPTION value=\"7\">Select Time</OPTION>\n");
      out.write("<OPTION value=\"8\">10:30AM</OPTION>\n");
      out.write("   <OPTION value=\"9\">5:30PM</OPTION> \n");
      out.write("<OPTION value=\"10\">12:30PM</OPTION> \n");
      out.write("</SELECT></TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>Select Class</TD>\n");
      out.write("<TD>\n");
      out.write("<INPUT type=\"Radio\" name=\"RB\" required\" onclick=\"check();\">Platinum</INPUT>\n");
      out.write("<INPUT type=\"Radio\" name=\"RB\" required onclick=\"check();\">Gold</INPUT>\n");
      out.write("<INPUT type=\"Radio\" name=\"RB\" required onclick=\"check();\">Exclusive</INPUT>\n");
      out.write("</TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>Price </TD>\n");
      out.write("<TD><INPUT type=\"text\" name=\"price\" disabled> </TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>Number of Tickets</TD> \n");
      out.write("<TD><INPUT type=\"text\" name=\"num\" placeholder=\"Enter Tickets\" required onchange=\"total();\" onkeypress=\"checkNum();\"> </TD>\n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>Total Price</TD> \n");
      out.write("<TD><INPUT TYPE=\"text\" NAME=\"totalprice\" disabled> </TD> \n");
      out.write("</TR>\n");
      out.write("<TR>\n");
      out.write("<TD>\n");
      out.write("<INPUT ID=\"submit\" type=\"submit\" onclick=\"sub();\"></Td><Td>\n");
      out.write("<INPUT type=\"reset\">\n");
      out.write("</TD>\n");
      out.write("</TR>\n");
      out.write("</TABLE>\n");
      out.write("</FORM>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

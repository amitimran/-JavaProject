package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AlertsUpdates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("background-color:green;\n");
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
      out.write("        \n");
      out.write("       <h1><font color=\"red\"></h1>\n");
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
      out.write("<DIV class=\"auto-style\">\n");
      out.write("    <br></br>\n");
      out.write("<P><font color=\"red\">New Payment Options has been introduced for ticket bookings.</P>\n");
      out.write("<br></br>\n");
      out.write("<P>Mobile Booking is now resumed w.e.f. 22-July-2018.</P>\n");
      out.write("<br></br>\n");
      out.write("<P>ID proof is required for getting student concession on tickets.</P>\n");
      out.write("<br></br>\n");
      out.write("<P>Ticket Bookings On Mobile: Now book your movie ticket -ANYWHERE ANYTIME through your Mobile Phones. </P>\n");
      out.write("<br></br>\n");
      out.write("<P>You are advised not to carry inflammable/dangerous/explosive articles as part of their luggage and also to desist from smoking in the movie halls. Please update your mobile number in our profile to receive SMS alerts for your ticket booking.</P>\n");
      out.write("<br></br>\n");
      out.write("<P>Never purchase e-ticket from unauthorized agents or persons.</P>\n");
      out.write("<br></br>\n");
      out.write("<P>No refund will be granted on cancellation of tickets .</P><br></br></DIV>\n");
      out.write("                \n");
      out.write("    </body>\n");
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

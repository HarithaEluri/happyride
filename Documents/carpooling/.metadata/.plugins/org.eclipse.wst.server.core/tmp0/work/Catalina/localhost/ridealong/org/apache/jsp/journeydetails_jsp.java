/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-07 04:26:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class journeydetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>signUpForm</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css1/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css1/style.css\">\n");
      out.write("<script src=\"js/index.js\"></script>\n");
      out.write("<link href=\"web/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("<link href=\"web/css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"web/js/jquery.easing.1.3.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"web/js/camera.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t\t   jQuery(function(){\n");
      out.write("\t\t\t\tjQuery('#camera_wrap_1').camera({\n");
      out.write("\t\t\t\t\theight: '500px',\n");
      out.write("\t\t\t\t\tpagination: false,\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t  </script>\n");
      out.write("     </head>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("     <body>\n");
      out.write("     <div class=\"wrap\">\n");
      out.write("\t\t<!----start-header----->\n");
      out.write("\t\t<div class=\"header\" id=\"top\">\n");
      out.write("\t\t\t<!----top-header----->\n");
      out.write("\t\t\t<div class=\"top-header\">\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!----End-top-header----->\n");
      out.write("\t\t\t<!---start-top-nav---->\n");
      out.write("\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t<div class=\"top-nav-left\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"welcome.jsp\"><img src=\"images/logo.jpg\"\n");
      out.write("\t\t\t\t\t\t\t\twidth=90px; title=\"logo\" /></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"licence.jsp\">offer ride</a></li>\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"findride\">take ride</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"profileview.jsp\">profile view</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"startwelcome.jsp\">logout</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-nav-right\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"><input type=\"submit\" value=\"\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---End-top-nav---->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!----End-header----->\n");
      out.write("\t</div>\n");
      out.write("\t<!----End-wrap----->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t<section id=\"content\">\n");
      out.write("\t\t<form action=\"journeydetails\" >\n");
      out.write("\t\t\t<h1>journey details</h1>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"starting point\" required=\"\" name=\"startingpoint\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"destination point\" required=\"\" name=\"destinationpoint\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"via point1\" required=\"\" name=\"via1\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"via point2\" required=\"\" name=\"via2\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"via point3\" required=\"\" name=\"via3\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"journey date\" required=\"\" name=\"journeydate\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"number\" placeholder=\"seats available\" required=\"\" name=\"seatsavailable\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"number\" placeholder=\"fare per seat\" required=\"\" name=\"fare\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t     \n");
      out.write("                        \n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Submit\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form><!-- form -->\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</section><!-- content -->\n");
      out.write("</div><!-- container -->\n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

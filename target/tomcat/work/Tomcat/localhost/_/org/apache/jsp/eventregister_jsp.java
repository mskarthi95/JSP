/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-26 12:51:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write("\n");
      out.write("\n");
      out.write("<!Doctype html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title> Event Registration </title>\n");
      out.write("\n");
      out.write("\t<meta charset='utf-8'>\n");
      out.write("\t<link rel='shortcut icon' href='fav.jpg' type='image' />\n");
      out.write("\t<meta name='viewport' content='width=device-width, initial-scale=1'>\n");
      out.write("\t<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>\n");
      out.write("\t<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>\n");
      out.write("\t<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>\n");
      out.write("\n");
      out.write("\t<style>\n");
      out.write("\t\t.well {\n");
      out.write("\t\t\tbackground-color: #3d40db;\n");
      out.write("\t\t\tpadding-left:400px;\n");
      out.write("\t\t\tfont-size: 30px;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.jumbotron {\n");
      out.write("\t\t\tcolor: #db443d;\n");
      out.write("\t\t\tbackground-color: #e4e8dc;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tlabel {\n");
      out.write("\t\t\tdisplay: inline-block;\n");
      out.write("\t\t\twidth: 140px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t}\n");
      out.write("\t.out{\n");
      out.write("\t\tmargin-left:300px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function onload()\n");
      out.write("{\n");
      out.write("document.getElementById('if').src=\"http://localhost:9090/ViewServlet\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload='onload();'>\n");
      out.write("\t<div class='container-fluid'>\n");
      out.write("\t\t<br/>\n");
      out.write("\t\t<div class='well'>Event Registration-Admin Home\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t<a href=\"/Logout\"><button class=\"btn btn-danger out\">Sign Out</button></a>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br/>\n");
      out.write("\n");
      out.write("\t\t<div class='jumbotron'>\n");
      out.write("\t\t\t<form action='admin_SaveServlet' class='form-inline' method='post'>\n");
      out.write("\t\t\t\t<div class='row'>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class='col-sm-4'>\n");
      out.write("\t\t\t\t\t\t<label>First Name:</label> <input type='text' required placeholder='First Name' name='firstname'/><br/><br/>  \n");
      out.write("    <label>Last Name:</label> <input type='text'  placeholder='Initial'  name='lastname' /><br/><br/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class='col-sm-4'>\n");
      out.write("\t\t\t\t\t\t<label>Email Id:</label> <input type='email' placeholder='Email' required name='email' /><br/><br/>\n");
      out.write("\t\t\t\t\t\t<label>Date:</label> <input type='date' required placeholder='Date' name='date' /><br/><br/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class='col-sm-4'>\n");
      out.write("\t\t\t\t\t\t<label>Time:</label> <input type='time' placeholder='Time' required name='time' /><br/><br/>\n");
      out.write("\t\t\t\t\t\t<label>Topic:</label> <input type='text' placeholder='Topic' required name='topic' /><br/><br/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label>Location: </label>\n");
      out.write("\t\t\t\t\t<select name='location'>  \n");
      out.write("    <option>Coimbatore</option>  \n");
      out.write("    <option>Bangalore</option>  \n");
      out.write("    <option>other</option>  \n");
      out.write("    </select>\n");
      out.write("\t\t\t\t\t<br/><br/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class='span12'>\n");
      out.write("\t\t\t\t\t\t<button  name=\"Register\" class='btn btn-primary' type='submit'>Register <span class='glyphicon glyphicon-save'></span></button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<button  class='btn btn-danger' type='reset'>Cancel <span class='glyphicon glyphicon-remove'></span></button>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<iframe name='if' id=\"if\"  height=\"300px\" width=\"1330px\" frameborder=\"0\">\n");
      out.write("\n");
      out.write("</iframe>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
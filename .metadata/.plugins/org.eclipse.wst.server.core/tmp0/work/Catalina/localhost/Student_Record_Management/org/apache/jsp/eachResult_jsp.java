/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-03-22 21:45:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Project.ConnectionProvider;
import java.sql.*;

public final class eachResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Project.ConnectionProvider");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("\r\n");

	try{
		String rollNo = request.getParameter("rollNo");
		String name = request.getParameter("name");
		Connection con = ConnectionProvider.getCon();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student inner join result on student.rollNo = result.rollNo where student.rollNo = '"+rollNo+"' and student.name = '"+name+"'");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		if(rs.next()){
			

      out.write("\r\n");
      out.write("<img src=\"left.png\" align=\"left\" width=\"150\" height=\"150\">\r\n");
      out.write("<center>\r\n");
      out.write("\t<img src=\"center.png\" width=\"150\" height=\"150\"> <img\r\n");
      out.write("\t\tsrc=\"right.png\" align=\"right\" width=\"150\" height=\"150\">\r\n");
      out.write("</center>\r\n");
      out.write("<a href=\"studentHome.jsp\">Back</a>\r\n");
      out.write("<hr class=\"new1\">\r\n");
      out.write("<style>\r\n");
      out.write("table {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttable-layout: fixed;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("\tpadding: 20px 15px;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-weight: 500;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tborder: 2px solid rgba(255, 255, 255, 0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* demo styles */\r\n");
      out.write("@import\r\n");
      out.write("\turl(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: -webkit-linear-gradient(left, #25c481, #25b7c4);\r\n");
      out.write("\tbackground: linear-gradient(to right, #25c481, #25b7c4);\r\n");
      out.write("\tfont-family: 'Roboto', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!--for demo wrap-->\r\n");
      out.write("<div class=\"tbl-header\">\r\n");
      out.write("\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>institution Name: IIIT</th>\r\n");
      out.write("\t\t\t\t<th>Course Name:");
      out.print(rs.getString(1));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>Branch Name:");
      out.print(rs.getString(2));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>RollNo:");
      out.print(rs.getString(3));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>Print Screen</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>Name: ");
      out.print(rs.getString(4));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>Father Name: ");
      out.print(rs.getString(5));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>Mother Name: ");
      out.print(rs.getString(6));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th>Gender: ");
      out.print(rs.getString(7));
      out.write("</th>\r\n");
      out.write("\t\t\t\t<th><a title=\"print screen\" alt=\"print screen\"\r\n");
      out.write("\t\t\t\t\tonclick=\"window.print();\" target=\"_blank\" style=\"cursor: pointer;\"><center>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"print.png\">\r\n");
      out.write("\t\t\t\t\t\t</center></a></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<style>\r\n");
      out.write("html {\r\n");
      out.write("\tfont-family: arial;\r\n");
      out.write("\tfont-size: 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td {\r\n");
      out.write("\tborder: 2px solid #726E6D;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("thead {\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground: #625D5D;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tbody>tr:nth-child(odd) {\r\n");
      out.write("\tbackground: #D1D0CE;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<head>\r\n");
      out.write("<hr class=\"new1\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\">Course</td>\r\n");
      out.write("\t\t\t\t<td rowspan=\"2\">Type</td>\r\n");
      out.write("\t\t\t\t<td rowspan=\"2\">Full Marks</td>\r\n");
      out.write("\t\t\t\t<td rowspan=\"2\">Passing Marks</td>\r\n");
      out.write("\t\t\t\t<td rowspan=\"2\">Obtained Marks</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Code</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">Name</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CS101</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">DBMS</td>\r\n");
      out.write("\t\t\t\t<td>Theory</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>30</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(10));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CS102</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">DAA</td>\r\n");
      out.write("\t\t\t\t<td>Theory</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>30</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(11));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CS103</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">COA</td>\r\n");
      out.write("\t\t\t\t<td>Theory</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>30</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(12));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CS104</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">DM</td>\r\n");
      out.write("\t\t\t\t<td>Theory</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>30</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(13));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CS105</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">AMC</td>\r\n");
      out.write("\t\t\t\t<td>Theory</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>30</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(14));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CS106</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">CS</td>\r\n");
      out.write("\t\t\t\t<td>Theory</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td>30</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(15));
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t\t<tfoot>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"footer\">Total Marks</td>\r\n");
      out.write("\t\t\t\t<td>600</td>\r\n");
      out.write("\t\t\t\t<td>180</td>\r\n");
      out.write("\t\t\t\t");
 int count = rs.getInt(10)+rs.getInt(11)+ rs.getInt(12) + rs.getInt(13)+rs.getInt(14) + rs.getInt(15); 
      out.write("\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t");
 out.println(count); 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"4\" class=\"footer\">Percentage</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t");
 out.println((count*100)/600); 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tfoot>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h6>Happy Coding!!</h6>\r\n");
      out.write("\t</center>\r\n");
      out.write("</body>\r\n");
}
		else{
			response.sendRedirect("errorResult.html");
		}
	}
	catch(Exception e){
		
	}

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

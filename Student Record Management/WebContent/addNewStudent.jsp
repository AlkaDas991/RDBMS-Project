<%@page import="Project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String course = request.getParameter("course");
String branch = request.getParameter("branch");
String rollNo = request.getParameter("rollNo");
String name   = request.getParameter("name");
String fatherName = request.getParameter("fatherName");
String motherName = request.getParameter("motherName");
String gender = request.getParameter("gender");
String pass = request.getParameter("pass");

try{
	Connection con = Project.ConnectionProvider.getCon();
	Statement st = con.createStatement();
	st.executeUpdate("insert into student values('"+course+"','"+branch+"','"+rollNo+"','"+name+"','"+fatherName+"','"+motherName+"','"+gender+"','"+pass+"')");
	response.sendRedirect("newStudentSuccess.html");
}
catch(Exception e){
	out.println(e);
}
%>
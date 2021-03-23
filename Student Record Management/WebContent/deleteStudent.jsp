<%@page import="Project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
String branch = request.getParameter("branch");
String rollNo = request.getParameter("rollNo");
try{
	Connection con = Project.ConnectionProvider.getCon();
	Statement st = con.createStatement();
	int i = st.executeUpdate("delete from student where rollNo = '"+rollNo+"' and branch = '"+branch+"'");
	if(i>0)
		response.sendRedirect("deleteSuccess.html");
	else
		response.sendRedirect("deleteFailure.html");
}
catch(Exception e){
	response.sendRedirect("deleteFailure.html");
	
}
%>
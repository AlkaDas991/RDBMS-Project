<%@page import="Project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
	String rollNo = request.getParameter("rollNo");
	String DAA = request.getParameter("DAA");
	String DBMS = request.getParameter("DBMS");
	String COA = request.getParameter("COA");
	String DM = request.getParameter("DM");
	String AMC = request.getParameter("AMC");
	String CS = request.getParameter("CS");
	try{
		Connection con = ConnectionProvider.getCon();
		Statement st = con.createStatement();
		int i = st.executeUpdate("insert into result values('"+rollNo+"','"+DAA+"','"+DBMS+"','"+COA+"','"+DM+"','"+AMC+"','"+CS+"')");
		if(i>0)response.sendRedirect("insertStudentResultSuccess.html");
		else response.sendRedirect("insertStudentResultFailure.html");
	}
	catch(Exception e){
		response.sendRedirect("insertStudentResultFailure.html");
	}
%>

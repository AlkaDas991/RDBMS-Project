<%@page import="Project.ConnectionProvider"%>
<%@page import="java.sql.*"%>
<%
	try{
		String rollNo = request.getParameter("rollNo");
		String name = request.getParameter("name");
		Connection con = ConnectionProvider.getCon();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student inner join result on student.rollNo = result.rollNo where student.rollNo = '"+rollNo+"' and student.name = '"+name+"'");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		if(rs.next()){
			
%>
<img src="left.png" align="left" width="150" height="150">
<center>
	<img src="center.png" width="150" height="150"> <img
		src="right.png" align="right" width="150" height="150">
</center>
<a href="studentHome.jsp">Back</a>
<hr class="new1">
<style>
table {
	width: 100%;
	table-layout: fixed;
}

th {
	padding: 20px 15px;
	text-align: left;
	font-weight: 500;
	font-size: 12px;
	color: #fff;
	text-transform: uppercase;
	border: 2px solid rgba(255, 255, 255, 0.3);
}

/* demo styles */
@import
	url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);

body {
	background: -webkit-linear-gradient(left, #25c481, #25b7c4);
	background: linear-gradient(to right, #25c481, #25b7c4);
	font-family: 'Roboto', sans-serif;
}
</style>
<!--for demo wrap-->
<div class="tbl-header">
	<table cellpadding="0" cellspacing="0" border="0">
		<thead>
			<tr>
				<th>institution Name: IIIT</th>
				<th>Course Name:<%=rs.getString(1)%></th>
				<th>Branch Name:<%=rs.getString(2)%></th>
				<th>RollNo:<%=rs.getString(3)%></th>
				<th>Print Screen</th>
			</tr>
		</thead>
		<thead>
			<tr>
				<th>Name: <%=rs.getString(4)%></th>
				<th>Father Name: <%=rs.getString(5)%></th>
				<th>Mother Name: <%=rs.getString(6)%></th>
				<th>Gender: <%=rs.getString(7)%></th>
				<th><a title="print screen" alt="print screen"
					onclick="window.print();" target="_blank" style="cursor: pointer;"><center>
							<img src="print.png">
						</center></a></th>
			</tr>
		</thead>
	</table>
</div>
<style>
html {
	font-family: arial;
	font-size: 25px;
}

td {
	border: 2px solid #726E6D;
	padding: 15px;
	color: black;
	text-align: center;
}

thead {
	font-weight: bold;
	text-align: center;
	background: #625D5D;
	color: white;
}

table {
	border-collapse: collapse;
}

.footer {
	text-align: right;
	font-weight: bold;
}

tbody>tr:nth-child(odd) {
	background: #D1D0CE;
}
</style>
<head>
<hr class="new1">
</head>
<body>
	<table>
		<thead>
			<tr>
				<td colspan="3">Course</td>
				<td rowspan="2">Type</td>
				<td rowspan="2">Full Marks</td>
				<td rowspan="2">Passing Marks</td>
				<td rowspan="2">Obtained Marks</td>

			</tr>
			<tr>
				<td>Code</td>
				<td colspan="2">Name</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>CS101</td>
				<td colspan="2">DBMS</td>
				<td>Theory</td>
				<td>100</td>
				<td>30</td>
				<td><%=rs.getString(10)%></td>
			</tr>
			<tr>
				<td>CS102</td>
				<td colspan="2">DAA</td>
				<td>Theory</td>
				<td>100</td>
				<td>30</td>
				<td><%=rs.getString(11)%></td>
			</tr>
			<tr>
				<td>CS103</td>
				<td colspan="2">COA</td>
				<td>Theory</td>
				<td>100</td>
				<td>30</td>
				<td><%=rs.getString(12)%></td>
			</tr>
			<tr>
				<td>CS104</td>
				<td colspan="2">DM</td>
				<td>Theory</td>
				<td>100</td>
				<td>30</td>
				<td><%=rs.getString(13)%></td>
			</tr>
			<tr>
				<td>CS105</td>
				<td colspan="2">AMC</td>
				<td>Theory</td>
				<td>100</td>
				<td>30</td>
				<td><%=rs.getString(14)%></td>
			</tr>
			<tr>
				<td>CS106</td>
				<td colspan="2">CS</td>
				<td>Theory</td>
				<td>100</td>
				<td>30</td>
				<td><%=rs.getString(15)%></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4" class="footer">Total Marks</td>
				<td>600</td>
				<td>180</td>
				<% int count = rs.getInt(10)+rs.getInt(11)+ rs.getInt(12) + rs.getInt(13)+rs.getInt(14) + rs.getInt(15); %>
				<td>
					<% out.println(count); %>
				</td>
			</tr>
			<tr>
				<td colspan="4" class="footer">Percentage</td>
				<td colspan="3">
					<% out.println((count*100)/600); %>
				</td>
			</tr>
		</tfoot>
	</table>
	<center>
		<h6>Happy Coding!!</h6>
	</center>
</body>
<%}
		else{
			response.sendRedirect("errorResult.html");
		}
	}
	catch(Exception e){
		
	}
%>
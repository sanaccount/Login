<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.san.bean.Productbean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Productbean pb = (Productbean)request.getAttribute("data");%>
<H1> Updated Item is: </H1>
<table>
<tbody>
<tr><th>ID</th><th>Desc</th><th>Name</th></tr>

<tr><td><%out.println(pb.getId()); %></td>
<td><%out.print(pb.getDesc());%></td>
<td><%out.print(pb.getName());%></td></tr>

</tbody>
</table>
<br><br>

</body>
</html>
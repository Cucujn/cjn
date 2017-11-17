<form action="test1.jsp">
	username : <input type="text" name="username" />
	<br />
	<input type="submit">
</form>

Hello <%=request.getParameter("username")%>
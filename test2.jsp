<%@ page contentType="text/html; charset=gb2312"%>
<%
    String color = request.getParameter("color");
    if ("red".equals(color)) {
        response.sendRedirect("test1.jsp");
    } else if ("green".equals(color)) {
        response.sendRedirect("test1.jsp");
    }
%>
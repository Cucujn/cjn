<%@ page import="java.util.*"%>
<%
    // 取得登录的用户名
    String username = (String) session.getAttribute("username");

    // 销毁session
    session.invalidate();

    // 从在线列表中删除用户名
    List onlineUserList = (List) application.getAttribute("onlineUserList");
    onlineUserList.remove(username);

    // 成功
    response.sendRedirect("index.jsp");
%>
<%@ page contentType="text/html; charset=gb2312"%>
<%
    request.setCharacterEncoding("gb2312");
%>
<form action="login.jsp" method="post">
    用户名：<input type="text" name="username" />
    <br />
    <input type="submit" value="登录" />
</form>
<%@ page import="java.util.*"%>
<%
    request.setCharacterEncoding("gb2312");

    // 取得登录的用户名
    String username = request.getParameter("username");

    // 把用户名保存进session
    session.setAttribute("username", username);

    // 把用户名放入在线列表
    List onlineUserList = (List) application.getAttribute("onlineUserList");
    // 第一次使用前，需要初始化
    if (onlineUserList == null) {
        onlineUserList = new ArrayList();
        application.setAttribute("onlineUserList", onlineUserList);
    }
    onlineUserList.add(username);

    // 成功
    response.sendRedirect("result.jsp");
%>
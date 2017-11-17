<%@ page contentType="text/html; charset=gb2312" import="java.util.*"%>
<h3>您好：${username} [<a href="logout.jsp">注销</a>]</h3>
<%
    List onlineUserList = (List) application.getAttribute("onlineUserList");
    for (int i = 0; i < onlineUserList.size(); i++) {
        String onlineUsername = (String) onlineUserList.get(i);
%>
				<tr>
                    <td><%=onlineUsername%></td>
                </tr>
<%
    }
%>
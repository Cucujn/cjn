<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主函数</title>
</head>
<body>
<!-- 导入javaBean类 -->
<%@ page import="com.weeklyreport.www.TsetBean" %>
<h2>include 动作实例</h2>
<jsp:include page="date.jsp" flush="flush"></jsp:include>
<!-- 声明javaBean对象 -->
<jsp:useBean id="test" class="com.weeklyreport.www.TsetBean"></jsp:useBean>
<!--访问javaBean属性  -->
<jsp:setProperty property="message" name="test" value="啦" />

<p>输出信息</p>
<jsp:getProperty name="test" property="message" />
<jsp:element name="xmlElement">
<jsp:attribute name="xmlElementAttr">
   属性值
</jsp:attribute>
<jsp:body>
   XML 元素的主体
</jsp:body>
</jsp:element>
</body>
</html>
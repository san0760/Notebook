<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showMessage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body><center>
    <font size="5"><a href="/Notebook/goPostMessageUi.do?flag=goPostMessageUi">POST</a></font>
    <font size="5"><a href="/Notebook/login.do?flag=logout">LOG OUT</a></font><br>
    欢迎：${user.username}&nbsp;Message:
    <table >
    		<tr><th>from</th><th>time</th><th>to</th><th>main</th></tr>
    		<c:forEach items="${messageList }" var="message">
    		<tr><td>${message.from.username }</td><td>${message.mesTime }</td><td>${message.to.username }</td><td>${message.main }</td></tr>
    		</c:forEach>
    </table>
  </center></body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'postMessage.jsp' starting page</title>
    
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
  	<font size="6"><a href="#">查看信息</a></font><font size="6"><a href="#">退出系统</a></font>
  	<form action="/Notebook/goPostMessageUi.do?flag=postMessage" method="post">
  		<table>
  			<tr><td>接收人</td><td><input type="text" name="to" /></td></tr>
  			<tr><td>发送内容</td><td><textarea rows="10" cols="20" name="main">请输入内容</textarea></td></tr>
  			<tr><td><input type="submit" value="Post" /></td><td><input type="reset" value="Reset" /></td></tr>
  		</table>
  	</center></form>
  </body>
</html>

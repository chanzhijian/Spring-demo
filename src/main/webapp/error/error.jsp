<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String contextPath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=contextPath %>" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rev="stylesheet" media="all" href="resources/css/style.css" type="text/css" rel="stylesheet">
<title>错误提示</title>
</head>
	<body>
		<div class="succeed">
		<p class="p1">无权访问！ </p>
	</div>
	</body>
</html>

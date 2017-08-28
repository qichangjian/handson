<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<title>list</title>
</head>
<body>
	<center><h2>雇员信息</h2></center>
	<a href="add.jsp"><p style="margin-left:300px;">添加雇员</p></a>
	<table class="table table-striped">
		
		<tr>
			<td>雇员编号</td>
			<td>字段姓名</td>
			<td>雇员性别</td>
			<td>字段年龄</td>
			<td>所属部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="bean">
		<tr>
			<td>${bean.emp_id }</td>
			<td>${bean.emp_name }</td>
			<td>${bean.emp_sex }</td>
			<td>${bean.emp_age }</td>
			<td>${bean.emp_depart }</td>
			<td>
				<a href="toupdateEmployee.do?emp_id=${bean.emp_id }&emp_name=${bean.emp_name }&emp_sex=${bean.emp_sex }&emp_age=${bean.emp_age }&emp_depart=${bean.emp_depart }">修改</a>
				<a href="deleteEmployee.do?emp_id=${bean.emp_id }">删除</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>
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
<style type="text/css">
        ul li{
        list-style: none;
        }
</style>
<title>add</title>
</head>
<body>
	<div>
		 <form method="post" action="updateEmployee.do">
					 <ul>
						 <li class="text-info">雇员id: </li>
						 <li><input type="text" name="emp_id" value="${emp_id }" ></li>
					 </ul>
					<ul>
						 <li class="text-info">雇员姓名: </li>
						 <li><input type="text" name="emp_name" value="${emp_name }"></li>
					 </ul>
					 <ul>
						 <li class="text-info">雇员性别: </li>
						 <li>
						 	<input name="emp_sex" type="radio" value="1" checked/>男
						 	<input name="emp_sex" type="radio" value="2" />女
						 </li>
					 </ul>				 
					<ul>
						 <li class="text-info">雇员年龄: </li>
						 <li><input type="text" name="emp_age" value="${emp_age }"></li>
					 </ul>
					 <ul>
						 <li class="text-info">所属部门: </li>
						 <li><input type="text" name="emp_depart" value="${emp_depart }"></li>
					 </ul>
					<p style="color: red;"> ${failuretip}</p>
					<p style="color: green;"> ${successtip}</p>	
					 <input type="submit" value="修改">
					 <a href="list.do">返回list</a>
				 </form>
	</div>
</body>
</html>
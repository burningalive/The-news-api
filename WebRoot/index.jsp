<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  <body>
  
  <script src="./js/external/jquery.min.js"></script>
  <script> 
    $.post("insertOnePress.html",{title:"昨天你吃了吗",brief:"昨天你到底吃了什么啊",content:"我昨天吃了鸡蛋饼",pressImage:"",titleImage:"",user_Id:"3"},function(result){
		    console.log("添加一条新闻");
		    console.log(result);
		});
	$.post("deleteOnePress.html",{id:"3"},function(result){
		    console.log("删除指定新闻");
		    console.log(result);
		});
	$.post("updateOnePress.html",{id:"1",user_Id:"3",title:"今天你吃了吗",brief:"今天你到底吃了什么啊",content:"我昨天吃了手抓饼"},function(result){
		    console.log("更改指定新闻");
		    console.log(result);
		});
  	$.post("selectAllPress.html",{},function(result){
  			console.log("查询全部新闻");
		    console.log(result);
		});
	$.post("selectOnePress.html",{id:"1"},function(result){
		    console.log("查询指定新闻细则");
		    console.log(result);
		});
  </script>
  </body>
</html>

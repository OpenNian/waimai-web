<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/commons/include.jsp" %>
<!DOCTYPE HTML> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<meta http-equiv="description" content="brigtengold login"> 
<meta http-equiv="author" content="brigtengold"> 
<title>我的外卖，崛起吧——崛起的外卖网，提供快速，方便，好用的外卖服务，其服务与各中小店铺</title>
<link href="${ctx }resources/css/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <form action="${ctx }background/loginCheck.htm" id="login" method="post">
  	<h1>Log In</h1>
	  <div style="margin-top: 15px;color:red;" id="messageDiv">${requestScope.error }</div>
  	<fieldset id="inputs">
  		<input id="username" name="username" type="text" placeholder="Username" 
  		value="${sessionScope['SPRING_SECURITY_LAST_USERNAME']}" autofocus required/>
  		<input id="password" name="password" type="password" placeholder="Password" required/>
  	</fieldset>
  	<fieldset id="actions">
  		<input id="submit" type="submit" value="Log in"/>
  		<a href="">Forgot your password?</a>
  	</fieldset>
  	<div id="login_footer">
  	<%
  		Calendar now = Calendar.getInstance(TimeZone.getDefault(),Locale.getDefault());
  	%>
      Copyright &copy; <%=now.get(Calendar.YEAR) %> linian365boy#foxmail.com。把#换成@
    </div>
  </form>
</body>
</html>
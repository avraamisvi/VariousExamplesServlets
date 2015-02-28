<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://abraaotaglib2" prefix="t2" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	TesteDipatcher
	<% session.setAttribute("abacate1", "<h1>valor2</h1>"); %>
	
	<% pageContext.setAttribute("abobrinha", "val"); %>
	<% session.setAttribute("abobrinha", "abobrinha"); %>
	
	${sessionScope.abobrinha}
	${pageScope.abobrinha}
	
	<c:out escapeXml="false" value="${sessionScope.abacate1}"/>
	<c:out escapeXml="true" value="${sessionScope.abacate1}" />
	<c:out value="${sessionScope.abacate1}" />
	
	<br clear="all">
	${param.testPar}
	${paramValues.testPar[0]}
	
</body>
</html>
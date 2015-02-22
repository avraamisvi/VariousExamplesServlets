<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> strs = new ArrayList<String>();
	for(int i = 0; i < 10; i++) {
		strs.add("num:" + i);
	}
	
	request.setAttribute("htmltext", "<h1>This is heading</h1>");
	pageContext.setAttribute("abacates", strs);
%>

<%
	for(String st : strs) {
		%>
	<% out.append(st).append("<br clear='all'>"); %>
<%
	}
%>

${htmltext}

with Core:
<c:out value="${htmltext}" escapeXml="false"/>

<c:forEach var="str1" items="${abacates}">
	${str1}
</c:forEach>

</body>
</html>
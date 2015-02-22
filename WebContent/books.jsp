<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
 <jsp:useBean class="jsp.tests.Book" type="jsp.tests.Book" id="bookorcd"/> 
 <jsp:getProperty name="bookorcd" property="isbn" />
 
 <jsp:useBean class="jsp.tests.AudioBook" type="jsp.tests.Book" id="testbook2" /> 
 <jsp:getProperty name="testbook2" property="test" />
 
 <br clear="all">
 <jsp:setProperty property="test" name="testbook2" value="${bookorcd.isbn}"/>
 <jsp:getProperty name="testbook2" property="test" />
  
</body>
</html>
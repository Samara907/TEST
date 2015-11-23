<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>/1123/select.jsp</title>
</head>
<body>
<c:forEach var="dto" items="${list }">
	${dto.id }, ${dto.pw }, ${dto.age }, ${dto.reg }
</c:forEach>
</body>
</html>
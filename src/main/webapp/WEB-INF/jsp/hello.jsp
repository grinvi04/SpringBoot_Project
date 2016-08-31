<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="/webjars/bootstrap/4.0.0-alpha.3/dist/css/bootstrap.min.css">
<script src="/webjars/jquery/3.1.0/dist/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.0.0-alpha.3/dist/js/bootstrap.min.js"></script>

<script type="text/javascript">
$(document).ready(function() {
	$('div').text('jquery add');
});
</script>

<title>Insert title here</title>
</head>
<body>
	<c:out value="<xmp>" escapeXml="true"></c:out>
	<h2>hello! ${name}</h2>
	<div>JSP version</div>
</body>
</html>
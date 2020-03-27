<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<style>
	div#footer{
		text-align:center;
	}
	div#footer > a{
		text-decoration:none;
	}
</style>
<script>
</script>
<title>SHORTEN URL -> ORIGINAL URL LIST</title>
<body>
<div class = "container">
    <h2>SHORTEN URL'S COUNT </h2>
    <table class = "table table-bordered">
        <thead>
            <tr>
                <th>shortenUrl</th>
                <th>count</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var = "urlDataCount" items = "${urlDataCountList}">
                <tr>
                    <td>${urlDataCount.shortUrl}</td>
                    <td>${urlDataCount.count}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body> 
<div id = "footer">
</div>
</html>

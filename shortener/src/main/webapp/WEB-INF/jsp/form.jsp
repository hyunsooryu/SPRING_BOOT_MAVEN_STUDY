<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<title>SHORTEN URL 만들기</title>
		<script>
			function send(){
				window.location.href = "/api/register/" + document.getElementById('originalUrl').value;
			}
		</script>
	</head>
	<body>
		<form action = "/api/register" method = "POST">
		<input type = "text" id = "originalUrl" name = "originalUrl">
		<button>값 넘겨주기</button>
		</form>
		<button onclick = "send();">전송</button>
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>HelloServlet</title>
</head>
<body>
<input type="button"value="HelloServlet"onClick="location.href='HelloServlet'">
<input type="button"value="WelcomServlet"onClick="location.href='welcome.jsp'">
<<<<<<< HEAD
<input type="button" value="問い合わせ" onClick="location.href='inquiry.jsp'">
GET 通信
<form method="get" action="TestServlet">
<input type="text" name="username"> 
<input type="password" name="password"> 
<input type="submit" value="送信">
</form> 
 POST 通信
<form method="post" action="TestServlet">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="送信">
</form> 
=======
<input type="button"value="問い合わせ"onClick="location.href='inquiry.jsp'">
<input type="button"value="MySQLServlet"onClick="location.href='MySQLServlet'">

<br>
Get通信
<form method="get"action="TestServlet">
<input type="text" name ="username">
<input type="password" name="password">
<input type="submit" value="送信">
</form>

POST通信
<form method="post"action="TestServlet">
<input type ="text" name="username">
<input type="password"name="password">
<input type="submit" value="送信">
</form>
>>>>>>> 8c394c83d99aa7d3b9cd890bcdb0cd90ddc46889
</body>
</html>
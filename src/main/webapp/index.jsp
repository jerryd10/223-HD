<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome to my webpage!</title>

</head>
<body>
  <h1>My simple webpage</h1>
  <p>Hiiiiiiiiiiiiiiiiiiiiiiiiiiiii</p>

  <form action="${pageContext.request.contextPath}/mypage">
  Back to mypage? <input type="submit" value="Yes" />  
  </form>

</body>
</html>



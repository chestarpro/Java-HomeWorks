<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Authorization</title>
	<link rel="stylesheet" href="cssLogin/style.css">

	<!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
  <form action="${pageContext.request.contextPath}/authorization" method="post" class="login">
    <p>
      <label for="login">Логин:</label>
      <input type="text" name="login" id="login" value="Your login">
    </p>
    <p>
      <label for="password">Пароль:</label>
      <input type="password" name="password" id="password" value="4815162342">
    </p>
    <p class="login-submit">
      <button type="submit" class="login-button">Войти</button>
    </p>

    <p class="forgot-password"><a href="index.html">Забыл пароль?</a></p>
  </form>
</body>
</html>

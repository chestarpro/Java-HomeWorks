<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="cssRegistration/style.css">
    <title>Форма регистрации</title>
</head>
<body>
    <main>
     <h1>${result} <% request.getParameter("result"); %></h1>
        <div class="circle"></div>
        <div class="register-form-container">
            <form action="${pageContext.request.contextPath}/registration" method="post">
                <h1 class="form-title">
                    Регистрация
                </h1>
                <div class="form-fields">
                    <div class="form-field">
                        <input type="text" name="login" placeholder="Имя">
                    </div>
                    <div class="form-field">
                        <input type="email" name="email" placeholder="Почта" required>
                    </div>
                    <div class="form-field">
                        <input type="password" name="password" placeholder="Пароль" required minlength="8" maxlength="128">
                    </div>
                </div>
                <div class="form-buttons">
                    <input type="submit" name="submit" value="Регистрация">
                </div>
            </form>
        </div>
    </main>
</body>
</html>
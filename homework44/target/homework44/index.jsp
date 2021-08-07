<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <title>homework44</title>
    <style> h1 {
         margin: 1em 0 0.5em 0;
         color: #148773;
         font-size: 45px;
         line-height: 40px;
         font-weight: bold;
         font-family: 'Josefin Sans', sans-serif;
         }
         b {
         margin: 1em 0 0.5em 0;
         color: #148773;
         font-size: 25px;
         line-height: 40px;
         font-weight: bold;
         font-family: 'Josefin Sans', sans-serif;
         }
         label {
         margin: 1em 0 0.5em 0;
         color: #148773;
         font-size: 15px;
         line-height: 40px;
         font-weight: bold;
         font-family: 'Josefin Sans', sans-serif;
         }
      </style>
</head>
<body>
<center>
    <h1>Registration</h1>
    <table border="1" cellspacing= "1" style="width: 20%; border-color: #148773;">
        <tr>
            <th>
                <form action="${pageContext.request.contextPath}/registration" method="post">
                    <br>
                    <br>
                    <div>
                        <input type="text" name="login" placeholder="Login" style="width: 70%;">
                    </div>
                    <br>
                    <div>
                        <input type="email" name="email" placeholder="Email" style="width: 70%;">
                    </div>
                    <br>
                    <div>
                        <input type="password" name="password" placeholder="Password" style="width: 70%;">
                    </div>
                    <br>
                    <b>Gender?</b>
                    <br>
                    <input type="radio" name="gender" value="Man" ><label>Man</label>
                    <input type="radio" name="gender" value="Woman" ><label>Woman</label>
                    <br>
                    <br>
                    <input type="submit" value="Registration">
                </form>
            </th>
        </tr>
    </table>
</center>
</body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>homework41</title>
<style>
        .red {
            color: red;
        }

    </style>
</head>
<body style="margin:0px;padding:0px;">
    <h1 style="margin-left: 5%; text-shadow: 1px 1px 1px black, 8px 5px 10px grey; color:#FF4848; font-family: comic sans ms" ><big> February 2021 </big></h1>
    <table border = "7" cellspacing="5" style="margin-left: 5%; background-image: url(winter2.jpg); font: 20px comic sans ms; box-shadow: 13px 10px 20px rgba(0,0,0,0.5);" width="500" height = "250">
    <tr>
    <th> Mon </th> <th> Tue </th> <th> Wed </th> <th> Thu </th> <th> Fri </th> <th class="red"> Sat </th> <th class="red"> Sun </th>
    </tr>
    <tr>
    <th> 1 </th> <th> 2 </th>  <th> 3 </th> <th> 4 </th> <th> 5 </td> <th class="red"> 6 </th> <th class="red"> 7 </th>
    </tr>
    <tr>
    <th> 8 </td> <th> 9 </td>  <th> 10 </td> <th> 11 </td> <th> 12 </td> <th class="red"> 13 </td> <th class="red"> 14 </th>
    </tr>
    <tr>
    <th> 15 </th> <th> 16 </th>  <th> 17 </th> <th> 18 </th> <th> 19 </th> <th class="red"> 20 </th> <th class="red"> 21 </th>
    </tr>
    <tr>
    <th> 22 </th> <th> 23 </th>  <th> 24 </th> <th> 25 </th> <th> 26 </th> <th class="red"> 27 </th> <th class="red"> 28 </th>
    </tr>

    </table>

    <form action="${pageContext.request.contextPath}/name" method="post">
    <input type="text" name="name" placeholder="Enter your name:" style="margin-left: 5%; margin-top:1%">
    <input type="submit" name="submit" value="submit">
    </form>
</body>
</html>

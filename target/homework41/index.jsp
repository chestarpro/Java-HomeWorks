<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>homework41</title>
</head>
<body style="margin:0px;padding:0px;">
    <h1 style="margin-left: 6%; text-shadow: 1px 1px 1px black, 8px 5px 10px grey; color:#FF4848;" > Февраль 2018 </h1>
    <table cellspacing="5" style="margin-left: 5%; background-image: url(winter2.jpg); font: 20px comic sans ms; box-shadow: 13px 10px 20px rgba(0,0,0,0.5);" width="400" height = "200">
    <tr>
    <th> Пн </th> <td> </td> <td>5</td> <td>12</td> <td>19</td> <td>26</td>
    </tr>
    <tr>
    <th> Вт </th> <td> </td> <td>6</td> <td>13</td> <td>20</td> <td>27</td>
    </tr>
    <tr>
    <th> Ср </th> <td> </td> <td>7</td> <td>14</td> <td>21</td> <td>28</td>
    </tr>
    <tr>
    <th> Чт </th> <td>1</td> <td>8</td> <td>15</td> <td>22</td> <td> </td>
    </tr>
    <tr>
    <th> Пт </th> <td>2</td> <td>9</td> <td>16</td> <td>23</td> <td> </td>
    </tr>
    <tr style="color:#FF2D00; text-shadow: 1px 1px 0px grey">
    <th> Сб </th> <td>3</td> <td>10</td> <td>17</td> <td>24</td> <td> </td>
    </tr>
    <tr style="color:#FF2D00; text-shadow: 1px 1px 0px grey">
    <th> Вс </th> <td>4</td> <td>11</td> <td>18</td> <td>25</td> <td> </td>
    </tr>
    </table>

    <form action="${pageContext.request.contextPath}/name" method="post">
    <input type="text" name="name" placeholder="Enter your name:" style="margin-left: 5%; margin-top:1%">
    <input type="submit" name="submit" value="submit">
    </form>
</body>
</html>

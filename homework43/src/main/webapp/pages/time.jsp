<html>
   <head>
      <title>Time</title>
      <style> h1 {
         margin: 1em 0 0.5em 0;
         color: #148773;
         font-size: 45px;
         line-height: 40px;
         font-weight: bold;
         font-family: 'Josefin Sans', sans-serif;
         }
      </style>
   </head>
   <body>
      <center>
         <h1>
            Time <%= java.time.LocalTime.now() %> |
            Date <%= java.time.LocalDate.now() %>
         </h1>
      </center>
   </body>
</html>

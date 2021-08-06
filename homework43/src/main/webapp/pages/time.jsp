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
            Time <%= new java.sql.Timestamp(new java.util.Date().getTime()).getHours() %> :
            <%= new java.sql.Timestamp(new java.util.Date().getTime()).getMinutes() %> :
            <%= new java.sql.Timestamp(new java.util.Date().getTime()).getSeconds() %> |
            Date <%= new java.sql.Date(new java.util.Date().getTime()) %>
         </h1>
      </center>
   </body>
</html>

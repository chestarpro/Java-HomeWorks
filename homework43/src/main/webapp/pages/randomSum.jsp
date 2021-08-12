<%
   int num1 = new java.util.Random().nextInt(1000 + 1 - 1) + 1;
   int num2 = new java.util.Random().nextInt(1000 + 1 - 1) + 1;
%>
<html>
   <head>
      <title>RandomSum</title>
      <style> h1 {
         margin: 1em 0 0.5em 0;
         color: #148773;
         font-size: 45px;
         line-height: 40px;
         font-weight: bold;
         font-family: 'Josefin Sans', sans-serif;
         }
         h2 {
         margin: 1em 0 0.5em 0;
         color: #343434;
         font-size: 22px;
         line-height: 40px;
         font-weight: 100;
         text-transform: uppercase;
         font-family: 'Josefin Sans', sans-serif;
         letter-spacing: 1px;
         font-style: italic;
         }
      </style>
   </head>
   <body>
      <center>
         <h1> <%= num1 %> + <%= num2 %> = <%= num1+num2 %> </h1>
         <h2>
         Sum of two random numbers
         </h2>
      </center>
   </body>
</html>

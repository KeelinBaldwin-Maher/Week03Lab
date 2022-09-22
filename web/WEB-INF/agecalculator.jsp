<%-- 
    Document: agecalculator
    Created on: Sep 21, 2022, 11:51:58 AM
    Author: Keelin Baldwin-Maher
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calcualtor</title>
        
    </head>
    
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age">
            Enter your age: <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="Age next birthday">
            <span>
                ${wrongInputMessage}
                ${nextAgeMessage}
            </span>
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>
        </form>
            
       </body>
       
</html>

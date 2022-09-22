<%-- 
    Document   : aritmeticcalculator
    Created on : Sep 22, 2022, 1:29:12 PM
    Author     : ety
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aritmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="text" name="firstNumber" value="${firstNumber}">
            <br>
            Second: <input type="text" name="secondNumber" value="${secondNumber}">
            <br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%">
        </form>
            <br>
            Result: <span>${result}</span>
            <br>
            <a href="age">Age Calcualtor</a>
    </body>
</html>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
                <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>Enter first Number:</label>
            <input type="int" name="first_no" value="${first_Num}">
            
            <br>
            <label>Enter Second Number:</label>
            <input type="int" name="second_no" value="${second_Num}">
            
            <br>
            <input type="submit" value="+" name='operation' >
            <input type="submit" value="-" name='operation' >
            <input type="submit" value="*" name='operation' >
            <input type="submit" value="%" name='operation' >
        </form>
            <p>Result: ${message}</p>
            <a href="http://localhost:8084/Calculators/age">Age Calculator</a>
    </body>
</html>

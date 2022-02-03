

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
                <h1>Arithmetic Calculator</h1>
        <form method="post" action="age">
            <label>Enter first Number:</label>
            <input type="int" name="first_no" value="${firstNo}">
            
            <br>
            <label>Enter Second Number:</label>
            <input type="int" name="second_no" value="${secondNo}">
            
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
            <p>Result ${message}</p>
            <a href="http://localhost:8084/Calculators/age">Arithmetic Calculator</a>
    </body>
</html>

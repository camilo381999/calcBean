<%-- 
    Document   : calcjsp
    Created on : 1/04/2020, 02:35:27 PM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--<form action="calcservlet" method="POST">
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" value="ADD">
        </form>--%>
        
        <form name="calcjsp" action="calcservlet" method="POST">
            <input type="text" name="ans" value="">
            <br>
            <input type="button" value="1" onClick="calcjsp.ans.value+='1'">
            <input type="button" value="2" onClick="calcjsp.ans.value+='2'">
            <input type="button" value="3" onClick="calcjsp.ans.value+='3'">
            <input type="button" value="+" onClick="calcjsp.ans.value+='+'">
            <br>
            <input type="button" value="4" onClick="calcjsp.ans.value+='4'">
            <input type="button" value="5" onClick="calcjsp.ans.value+='5'">
            <input type="button" value="6" onClick="calcjsp.ans.value+='6'">
            <input type="button" value="-" onClick="calcjsp.ans.value+='-'">
            <br>
            <input type="button" value="7" onClick="calcjsp.ans.value+='7'">
            <input type="button" value="8" onClick="calcjsp.ans.value+='8'">
            <input type="button" value="9" onClick="calcjsp.ans.value+='9'">
            <input type="button" value="*" onClick="calcjsp.ans.value+='*'">
            <br>
            <input type="button" value="0" onClick="calcjsp.ans.value+='0'">
            <input type="button" value=", " onClick="calcjsp.ans.value+=','">
            <input type="button" value="/ " onClick="calcjsp.ans.value+='/'">
            <input type="submit" value="=" >
        </form>
    </body>
</html>

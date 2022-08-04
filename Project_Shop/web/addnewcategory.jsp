<%-- 
    Document   : addnewcategory
    Created on : Mar 17, 2022, 10:05:27 AM
    Author     : THANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="addnewcategory" method="post">
            <table>
                <tr>
                    <td>Category name: </td>
                    <td><input name="name" type="text"/></td>
                </tr>
                <tr>
                    <td>description: </td>
                    <td><input name="dess" type="text"/></td>
                </tr>
                <tr>
                    <td><input value="Submit" type="submit"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>

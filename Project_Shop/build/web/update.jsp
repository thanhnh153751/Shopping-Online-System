<%-- 
    Document   : update
    Created on : Feb 22, 2022, 12:04:50 AM
    Author     : THANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <style>
            .infor{
                text-align: center;
            }




        </style>
    </head>
    <body>
        <a href="manager" style="text-decoration: none"><h2>Manager Products</h2></a>
        <h1 style="text-align: center">Update Product</h1>
        <c:set var="p" value="${requestScope.product}"/>
        <form action="update" method="post" enctype="multipart/form-data">
            <table style="margin: 0 auto;">
                <tr>
                    <td> Product ID</td>
                    <td><input type="number" name="id" readonly value="${p.productID}"/></td>
                </tr>
                <tr>
                    <td>enter Product Name</td>
                    <td><input type="text" name="name" value="${p.productName}"/></td>
                </tr>
                <tr>
                    <td>enter Unit Price</td>
                    <td><input type="text" name="price" value="${p.unitPrice}"/>(VNĐ)</td>
                </tr>
                <tr>
                    <td>enter Units In Stock</td>
                    <td><input type="number" name="inStock" value="${p.unitsInStock}"/></td>
                </tr>
                <tr>
                    <td>enter Units On Order</td>
                    <td><input type="number" name="onOrder" value="${p.unitsOnOrder}"/></td>
                </tr>
                <tr>
                    <td>enter Product Description</td>
                    <td><input type="text" name="description" value="${p.description}"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <c:if test="${p.image != null}">
                            <img src="${p.image}" width="80px" height="60px"/>
                        </c:if>

                    </td>
                </tr>

                <tr>
                    <td>enter Photo</td>
                    <td><input type="file" class="form-control" name="file" placeholder="Enter photo" ></td>
                </tr>
                <tr>
                    <td>enter Category</td>
                    <td>
                        <c:set value="${p.categori.categoryID}" var="cs"></c:set>
                        <select name="cid" >             
                            <c:forEach items="${requestScope.category}" var="d">
                                <option  value="${d.categoryID}" <c:if test="${d.categoryID == cs}">selected</c:if> >${d.categoryName}</option>    
                            </c:forEach>

                        </select>

                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SAVE"/></td>
                </tr>
            </table>


        </form>
    </body>
</html>

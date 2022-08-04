<%-- 
    Document   : mycart
    Created on : Mar 4, 2022, 11:43:18 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>

        <title>My bag</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>lion</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">



        <style>
            table{
                border-collapse: collapse;
            }
            .tr{
                text-align: right;
            }
            a{
                text-decoration: none;
                color: chocolate;
                font-size: 22px;
                font-weight: bold;
            }
            tbody, td, tfoot, th, thead, tr {


                border-width: 1px;
            }
        </style>
    </head>
    <body>
        <div style="display: flex;justify-content: space-around;">
            <div style="width: 50%;">
                <h1>Shopping cart online</h1>
                <table border="1px" width="100%">
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Image</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Total money</th>
                        <th>Action</th>
                    </tr>
                    <c:set var="o" value="${requestScope.cart}"/>
                    <c:set var="tt" value="0"/>
                    <c:forEach items="${o.items}" var="i">
                        <c:set var="tt" value="${tt+1}"/>
                        <tr>
                            <td>${tt}</td>
                            <td>${i.product.productName}</td>
                            <td><img style="width: 60px;height: 40px;" src="${i.product.image}"/></td>
                            <td style="text-align: center">
                                <button style="background-color: transparent;"><a href="process?num=-1&id=${i.product.productID}">-</a></button>
                                ${i.quantity}
                                <button style="background-color: transparent;"><a href="process?num=1&id=${i.product.productID}">+</a></button>
                            </td>
                            <td class="tr ">
                                <p class="monney"><fmt:formatNumber pattern="##.#" value="${i.price}"/>đ</p>
                            </td>
                            <td class="tr">
                                <p class="monney"><fmt:formatNumber pattern="##.#" value="${(i.price*i.quantity)}"/>đ</p>
                            </td>
                            <td style="text-align: center">
                                <form action="process" method="post">
                                    <input type="hidden" name="id" value="${i.product.productID}"/>
                                    <input type="submit" value="Return item"/>   
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <span style="color: red;font-size: 20px;">Total money: <span class=" monney">${o.totalMoney}</span> đ</span>
                <hr/>
                <c:if test="${cookie.cart != null && !(cookie.cart.value eq '')}">
                <form action="checkout" method="post">
                    <input type="submit" value="Check out"/>
                </form>
                </c:if>
                <hr/>
                <h5 style="color: red">${requestScope.check}</h5> 
                <a href="home">CONTINUE SHOPPING</a>
            </div>

            <div style="background-color: #d9bfd2">
                <c:if test="${requestScope.bill != null}">
                    <h1>Your Bill</h1>
                    <table border="1px" width="100%" >
                        <tr>
                            <th>No</th>
                            <th>Name</th>
                            <th>Image</th>
                            <th>Quantity</th>
                            <th>Price</th>
                            <th>Total money</th>

                        </tr>
                        <c:set var="od" value="${requestScope.bill}"/>
                        <c:set var="tt" value="0"/>
                        <c:forEach items="${od.items}" var="i">
                            <c:set var="tt" value="${tt+1}"/>
                            <tr>
                                <td>${tt}</td>
                                <td>${i.product.productName}</td>
                                <td><img style="width: 60px;height: 40px;" src="${i.product.image}"/></td>
                                <td style="text-align: center">${i.quantity}</td>
                                <td class="tr ">
                                    <p class="monney"><fmt:formatNumber pattern="##.#" value="${i.price}"/>đ</p>
                                </td>
                                <td class="tr">
                                    <p class="monney"><fmt:formatNumber pattern="##.#" value="${(i.price*i.quantity)}"/>đ</p>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                    <span style="color: red;font-size: 20px;">Total Bill: <span class=" monney">${od.totalMoney}</span> đ</span>
                </c:if>
            </div>
        </div>
    </body>
</html>
<script src="js/customJS/myjs.js"></script>

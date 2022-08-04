<%-- 
    Document   : manager
    Created on : Feb 18, 2022, 11:32:59 PM
    Author     : THANH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
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
        <title>JSP Page</title>
        <style>
            table{
                text-align: center;
                margin: 0 auto;
            }
            tbody, td, tfoot, th, thead, tr {


                border-width: 1px;
            }
            button a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <header>
            <!-- header inner -->
            <div class="head_top" style="padding-bottom: 0px;">
                <div class="header">

                    <div class="container-fluid">

                        <div class="row">
                            <div class="col-lg-2 logo_section">
                                <div class="full">
                                    <div class="center-desk">
                                        <div class="logo">
                                            <!--                                                    <a href="index.html"><img src="images/logo.png" alt="#"></a>-->
                                            <a href="home"><h1 style="color: white">THANK-SHOP</h1></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-10">
                                
                            </div>
                        </div>
                    </div>
                </div>

                <!-- end header inner -->

                <!-- end header -->




            </div>

            <!-- start baner -->

            <!-- end baner -->
        </header>



        <h1 style="text-align: center">Manager Customer</h1>
        <table border="1px">
            <tr>
                <th>CustomerID</th>
                <th>ContactName</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Username</th>
                <th>Password</th>
                <th>image</th>
                <th>status</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.customer}" var="li">
                <c:if test="${li.role != 1}">
                <tr>
                    <td>${li.customerID}</td>
                    <td>${li.contactName}</td>
                    <td>${li.address}</td>
                    <td>${li.phone}</td>
                    <td>${li.username}</td>
                    <td>${li.password}</td>                   
                    <td><img style="width: 80px;height: 80px;" src="${li.image}"/></td>
                    <td>
                        <c:if test="${li.status==1}"><img style="width: 20px;height: 20px;" src="images/green.png"/></c:if>
                        <c:if test="${li.status==0}"><img style="width: 20px;height: 20px;" src="images/red.png"/></c:if>                      
                    </td>
                    

                    <td> 
                    <c:if test="${li.status==1}"><button type="button"><a style="background-color: red" href="#" onclick="doBlock('${li.customerID}')">block</a></button></c:if>
                        &nbsp;&nbsp;&nbsp; 
                    <c:if test="${li.status==0}"><button type="button"><a style="background-color: greenyellow" href="#" onclick="doBlock('${li.customerID}')">unblock</a></button></c:if>
                    <c:if test="${li.status==0 || li.status==1}"><button type="button"><a href="#" onclick="doDelete('${li.customerID}')">remove</a> </button></c:if>
                    <c:if test="${li.status==-1}">account has been deleted</c:if>
                    <button type="button"><a href="#" onclick="viewOrder('${li.customerID}')">View Order</a> </button>
                    </td>

                </tr> 
                </c:if>
            </c:forEach>
                
        </table>
    </body>
</html>
<script type="text/javascript">
    function doDelete(id) {
        if (confirm("bạn có chắc chắn muốn XÓA tài khoản có ID là: '" + id + "'?")) {
            window.location = "deletecusbyadmin?id=" + id;
        }
    }
    function doBlock(id) {
        if (confirm("bạn có chắc chắn muốn "+((id==1) ? "KHÓA" : "MỞ KHÓA") +" tài khoản có ID là: '" + id + "'?")) {
            window.location = "blockcustomer?id=" + id;
        }
    }
    function viewOrder(id) {
            window.location = "historyorder?id=" + id;      
    }
</script>
<script src="js/customJS/myjs.js"></script>

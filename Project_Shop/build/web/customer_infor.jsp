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
                margin-left: 10%;
            }
            tbody, td, tfoot, th, thead, tr {


                border-width: 1px;
            }
            button a{
                text-decoration: none;
            }
            .pass{
                margin-left: 10%;
                color: #d2390a;
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



        <h1 style="text-align: center">Customer information</h1>

        <c:if test="${requestScope.check.status != -1}">
        <table border="">
            
            <c:set value="${requestScope.customer}" var="li"/>
                      
            <tr>
                <td>ContactName</td>
                <td>${li.contactName}</td>
            </tr>
            <tr>
                <td>Address</td>
                <td>${li.address}</td>
            </tr>
            <tr>
                <td>Phone</td>
                <td>${li.phone}</td>
            </tr>
            <tr>
                <td>Account name</td>
                <td>${li.username}</td>
            </tr>
            <tr>
                <td>images</td>
                <td><img style="width: 80px;height: 80px;" src="${li.image}"/></td>
            </tr>

            <tr>
                <td>
                    <button type="button"><a href="update_customer?id=${li.username}">edit</a></button>&nbsp;&nbsp;&nbsp; 

                </td>
                <td>

                    <button type="button"><a href="#" onclick="doDelete('${li.username}')">remove</a> </button>

                </td>

            </tr>

            
        </table>
                    <a class="pass" href="change_pass">Change password</a>
        </c:if>
                  
        <c:if test="${requestScope.check.status == 0}"><p style="color: red">Tài khoản đã bị khóa tạm thời và KHÔNG THỂ mua hàng với lí do vi phạm nguyên tắc cộng đồng</p></c:if>
        <c:if test="${requestScope.check.status == -1}"><h5>${requestScope.mess}</h5></c:if>
    </body>
</html>
<script type="text/javascript">
    function doDelete(id) {
        if (confirm("bạn có chắc chắn muốn xóa sản phẩm có ID là: '" + id + "'?")) {
            window.location = "delete_customer?id=" + id;
        }
    }
</script>
<script src="js/customJS/myjs.js"></script>

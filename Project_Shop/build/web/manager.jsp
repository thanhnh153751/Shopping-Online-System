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



        <h1 style="text-align: center">Manager Products</h1>
        <a style="display: flex;  justify-content: center; margin-bottom: 20px" href="addnew"><button style=" border: #fd7e14 solid 1px" type="button" >ADD NEW</button></a>

        <table border="1px">
            <tr>
                <th>ProductID</th>
                <th>CategoryName</th>
                <th>ProductName</th>
                <th>image</th>
                <th>Price</th>
                <th>Units In Stock</th>
                <th>Units On Order</th>
                <th>description</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${requestScope.listProduct}" var="li">
                <tr>
                    <td>${li.productID}</td>
                    <td>${li.categori.categoryName}</td>
                    <td>${li.productName}</td>
                    <td><img style="width: 80px;height: 60px;" src="${li.image}"/></td>
                    <td class="monney">${li.unitPrice}</td>
                    <td>${li.unitsInStock}</td>
                    <td>${li.unitsOnOrder}</td>
                    <td>${li.description}</td>

                    <td>
                        <button type="button"><a href="update?id=${li.productID}">edit</a></button>&nbsp;&nbsp;&nbsp; 
                        <button type="button"><a href="#" onclick="doDelete('${li.productID}')">remove</a> </button>

                    </td>

                </tr>    
            </c:forEach>
        </table>
    </body>
</html>
<script type="text/javascript">
    function doDelete(id) {
        if (confirm("b???n c?? ch???c ch???n mu???n x??a s???n ph???m c?? ID l??: '" + id + "'?")) {
            window.location = "delete?id=" + id;
        }
    }
</script>
<script src="js/customJS/myjs.js"></script>

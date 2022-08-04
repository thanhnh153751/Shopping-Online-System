<%-- 
    Document   : home
    Created on : Feb 10, 2022, 12:33:59 AM
    Author     : THANH
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Categories"%>
<%@page import="java.util.Locale.Category"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>thank</title>
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
        <link rel="stylesheet" href="css/nouislider.css">
        <script src="js/nouislider.js"></script>

        <style>
            .pagination {
                display: inline-block;
            }
            .pagination a {
                color: black;
                font-size: 22px;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
            }
            .pagination a.active {
                background-color: #ee3e0f;
                color: black;
            }
            .pagination a:hover:not(.active) {
                background-color: #ee3e0f;
            }
            .fiter{
                display: flex;

            }
            .fiter .sub_fiter{
                padding: 5%;

            }
        </style>

        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
    </head>
    <!-- body -->

    <body class="main-layout">
        <!-- loader  -->
        <!--        <div class="loader_bg">
                    <div class="loader"><img src="images/loading.gif" alt="#" /></div>
                </div>-->

        <div class="wrapper">

            <!-- end loader -->
            <div class="sidebar">
                <!-- Sidebar  -->
                <nav id="sidebar">

                    <div id="dismiss">
                        <i class="fa fa-arrow-left"></i>
                    </div>

                    <ul class="list-unstyled components">

                        <li class="active">
                            <a href="index.html">Home</a>
                        </li>
                        <c:if test="${sessionScope.account != null && sessionScope.account.role==1}">
                            <li>
                                <a href="check?action=manager">Manager</a>
                            </li>
                            <li>
                                <a href="check?action=managerCategory">Manager Category</a>
                            </li>
                            <li>
                                <a href="check?action=managerCustomer">Manager Customer</a>
                            </li>
                            
                            <li>
                                <a href="check?action=statistic">Statistic</a>
                            </li>
                        </c:if>
                        <c:if test="${sessionScope.account != null && sessionScope.account.role==2}">
                            <li class="menu_iconb">
                                <a href="customer_infor">My account</a>
                            </li>
                            <li>
                                <a href="historyorder">Transaction history</a>
                            </li>
                            <li class="menu_iconb">
                                <a href="#" onclick="doLogout()">Log out <img style="margin-right: 15px;" src="icon/5.png" alt="#" /> </a>
                            </li>                           
                        </c:if>
                        <c:if test="${sessionScope.account == null && sessionScope.account.role==2}">    
                            <li class="menu_iconb">
                                <a href="login">Log in <img style="margin-right: 15px;" src="" alt="#" /> </a>
                            </li>
                        </c:if>
                    </ul>

                </nav>
            </div>

            <div id="content">
                <!-- header -->
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
                                        <div class="right_header_info">

                                            <ul>

                                                <form action="home2" id="search-bar">
                                                    <li class="menu_iconb">
                                                        <input style="margin-right: 15px;" class="tetter" placeholder="Search" type="text" name="name" value="${requestScope.key}">
                                                    </li>

                                                    <li class="menu_iconb">

                                                        <a onclick="document.getElementById('search-bar').submit()"><img style="margin-right: 15px;" src="icon/3.png" /></a>


                                                    </li> 
                                                </form>

                                                <!--<li class="menu_iconb">
                                                <a href="#"><img style="margin-right: 15px;" src="icon/1.png" alt="#" />7213456789</a>
                                                </li>-->
                                                <c:if test="${sessionScope.account != null}">
                                                    <li class="menu_iconb">
                                                        <a href="#" onclick="doLogout()">Log out <img style="margin-right: 15px;" src="icon/5.png" alt="#" /> </a>
                                                    </li>
                                                    <li class="menu_iconb">
                                                        <a href="customer_infor">${sessionScope.account.username}<img style="margin-left: 15px;" src="icon/6.png" alt="#" /></a>
                                                    </li>
                                                </c:if>
                                                <c:if test="${sessionScope.account == null}">    
                                                    <li class="menu_iconb">
                                                        <a href="login">Log in <img style="margin-right: 15px;" src="icon/5.png" alt="#" /> </a>
                                                    </li>
                                                </c:if>
                                                <li class="tytyu">
                                                    <a href="showbag"> <img style="margin-right: 15px;" src="icon/2.png" alt="#" /><span id="size_bag">${requestScope.size}</span></a>
                                                </li>


                                                <li>
                                                    <button type="button" id="sidebarCollapse">
                                                        <img src="images/menu_icon.png" alt="#"/>
                                                    </button>
                                                </li>
                                            </ul>
                                        </div>
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





                <!-- Categories -->
                <div class="Categories">
                    <div class="container">

                        <!-- news shoes -->

                        <!--                        <a class="seemore" href="#">See more</a>-->
                        <!-- end news shoes -->





                        <!-- Categories -->
                        <div class="row">
                            <div class="col-md-12">
                                <div class="title">
                                    <!--<h2> Categories</h2>-->
                                    <c:set var="cid" value="${requestScope.cid}"/>

                                    <form id="f" action="list">
                                        <ul class="categiri" onchange="document.getElementById('f').submit()">
                                            <li <c:if test="${cid==0}">class="active"</c:if> ><a href="home2?cid=0">ALL</a></li> 
                                                <c:forEach items="${requestScope.category}" var="c">

                                                <li <c:if test="${c.categoryID==cid}">class="active"</c:if>   ><a href="home2?cid=${c.categoryID}">${c.categoryName}</a></li>

                                            </c:forEach>


                                        </ul>
                                    </form>

                                </div>
                            </div>
                        </div>
                        <!--bộ lọc mở-->
                        <!--                                                <div class="dropdown">
                                                                            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Filter</button>
                                                                            <div class="dropdown-menu">
                                                                                 
                                                                                <div class="row">
                                                                                    <div class="col-3">
                                                                                        <p>day la fiter</p>
                                                                                          
                                                                                    </div>
                                                                                </div>                       
                                                                            </div>                       
                                                                        </div>                       -->
                        <!--bộ lọc mở end-->
                        <form action="filter">
                            <div  class="fiter" style="">
                                <!--check box-->
                                <div>
                                    <%
                                        int[] clist = (int[]) request.getAttribute("cidF");

                                        boolean pos = false;
                                        if (clist != null) {
                                            pos = true;
                                        }

                                        List<Categories> calist = (List<Categories>) request.getAttribute("category");
                                        int index = 0;
                                    %>
                                    <h5 class="sub_fiter">Hãng giày</h5>
                                    <c:forEach items="${requestScope.category}" var="c">
                                        <%
                                            boolean status = false;
                                            if (pos) {
                                                for (int i = 0; i < clist.length; i++) {
                                                    if (clist[i] == calist.get(index).getCategoryID()) {
                                                        status = true;
                                                    }

                                                }
                                            }
                                        %>
                                        <input type="checkbox" name="cid_checkbox" value="${c.categoryID}" <c:if test="<%= pos && status%>">checked</c:if>/>${c.categoryName}<br/>
                                        <%
                                            index++;
                                        %>
                                    </c:forEach>

                                </div>
                                <%
                                    boolean b = false;
                                    boolean w = false;
                                    String[] color = (String[]) request.getAttribute("colorF");
                                    if (color != null) {
                                        for (int i = 0; i < color.length; i++) {
                                            if (color[i].equals("black")) {
                                                b = true;
                                            }
                                            if (color[i].equals("white")) {
                                                w = true;
                                            }

                                        }
                                    }
                                %>
                                <div>
                                    <h5 class="sub_fiter">Màu sắc</h5>                           
                                    <input type="checkbox" name="color_checkbox" value="black" <c:if test="<%=b%>">checked</c:if>/>Đen<br/>                            
                                    <input type="checkbox" name="color_checkbox" value="white" <c:if test="<%=w%>">checked</c:if>/>Trắng<br/>                            
                                    </div>
                                    <!--khoảng giá-->

                                    <div class="range" style="display:flex; justify-content: right;">
                                        <div>


                                            <h5>Khoảng giá</h5>
                                            <div id="slider"></div>
                                            <input id="slider-margin-value-min" name="min" value="100000" type="text" readonly="">
                                            <input id="slider-margin-value-max" name="max" value="10000000" type="text" readonly=""> 
                                        </div>


                                    </div>
                                    <!--sắp xếp theo giá-->

                                    <div class="sub_fiter">
                                        <select name="getOrder">
                                            <option value="none">Sắp xếp theo</option>
                                            <option value="ASC" <c:if test="${requestScope.orderF eq 'ASC'}">selected</c:if> >Giá tăng dần</option>
                                        <option value="DESC" <c:if test="${requestScope.orderF eq 'DESC'}">selected</c:if >>Giá giảm dần</option>
                                        </select>
                                    </div>
                                    <button type="submit" style="height: 40px;width: 40px;background: gray">Lọc</button>
                                </div>
                            </form>

                            <script>
                                var slider = document.getElementById('slider');

                                noUiSlider.create(slider, {
                                    start: [${requestScope.downF==null ? 1000 :requestScope.downF}, ${requestScope.upF==null ? 100000 : requestScope.upF}],
                                    connect: true,
                                    step: 100,
                                    range: {
                                        'min': 1000,
                                        'max': 100000
                                    }
                                });

                                var marginMin = document.getElementById('slider-margin-value-min'),
                                        marginMax = document.getElementById('slider-margin-value-max');
                                var inputs = [marginMin, marginMax];
                                slider.noUiSlider.on('update', function (values, handle) {
                                    inputs[handle].setAttribute('value', values[handle].replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ","));
                                    //                                inputs[handle].value = parseInt(values[handle], 10);
                                    inputs[handle].value = values[handle].replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",");


                                });
                        </script>



                        <!-- all shoes -->
                        <div id="shoes" class="shoes-bg">

                            <form name="fp" action="" method="post">
                                <div class="row">


                                    <c:forEach items="${requestScope.product}" var="p">
                                        <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12 margintop">
                                            <div class="shoes-box">
                                                <!--<h5>Sale</h5>-->
                                                <i><img src="${p.image}"/></i>
                                                <p><span class="nolmal">${p.productName}</span></p>
                                                <h4>Price: <span class="nolmal monney" style="color: red">${p.unitPrice}</span>đ<br/><span style="font-size: 70%;">kho:${p.unitsInStock}</span></h4>

                                            </div>
                                            <div style="display: flex;">
                                                <a class="buynow" onclick="buynow('${p.productID}')">Buy now</a>
                                                <a class="buynow" onclick="buy('${p.productID}')" >Add to cart</a>

                                            </div>

                                        </div>        
                                    </c:forEach>
                                    <input name="url" type="text" value="${requestScope.url}" hidden="">


                                </div>
                            </form>
                            <script type="text/javascript">
                                function buy(id) {
                                    document.fp.action = "buy?id=" + id + "&num=" + 1;
                                    document.fp.submit();
                                }
                                function buynow(id) {
                                    document.fp.action = "buy?id=" + id + "&num=" + 1 + "&now=1";
                                    document.fp.submit();
                                }
                            </script>
                        </div>
                        <!-- end all shoes -->
                        <!--<a class="seemore" href="#">See more</a>-->
                        <!--phần của phân trang-->
                        <c:set var="page" value="${requestScope.page}"/>
                        <div class="pagination">
                            <!--khi chọn lọc-->

                            <c:forEach begin="${1}" end="${requestScope.numPage}" var="i">
                                <a class="${i==page?"active":""}" onclick="movePage('${i}')">${i} </a>
                            </c:forEach>
                            <script>
                                function movePage(pageNumber) {
                                    var url = window.location.href;

                                    var newurl = url.split('&page')[0];
                                    window.location = newurl + '&page=' + pageNumber;

                                }
                            </script>

                        </div>

                    </div>

                </div>




            </div>



            <!-- end Categories -->




            <section>
                <!--  save -->

                <!-- <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="save">
                                <div class="row">
                                    <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                                        <div class="save_box">
                                            <h3>save up to 50%</h3>
                                            <a href="#">Buy now</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> -->
                <!-- end save -->
            </section>


            <!--  footer -->
            <footer>
                <div class="footer">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="footer_top">
                                    <div class="row">
                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                                            <!-- <a href="index.html"> <img class="logo1" src="images/logo1.png" /></a> -->
                                        </div>
                                        <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                                            <ul class="sociel">
                                                <li> <a href="#"><i class="fa fa-facebook-f"></i></a></li>
                                                <li> <a href="#"><i class="fa fa-twitter"></i></a></li>
                                                <li> <a href="#"><i class="fa fa-instagram"></i></a></li>
                                                <li> <a href="#"><i class="fa fa-linkedin"></i></a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 ">
                                <div class="row">
                                    <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6 ">
                                        <div class="address">
                                            <h3>Contact us </h3>
                                            <ul class="loca">
                                                <li>
                                                    <a href="#"><img src="icon/loc.png" alt="#" /></a>145 londone
                                                    <br>uk </li>
                                                <li>
                                                    <a href="#"><img src="icon/call.png" alt="#" /></a>+12586954775 </li>
                                                <li>
                                                    <a href="#"><img src="icon/email.png" alt="#" /></a>demo@gmail.com </li>

                                            </ul>

                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-6 col-sm-6">
                                        <div class="address">
                                            <h3>customer service</h3>
                                            <ul class="Menu_footer">
                                                <li class="active"> <a href="#">My account</a> </li>
                                                <li><a href="#">Wishlist</a> </li>
                                                <li><a href="#">My Cart</a> </li>
                                                <li><a href="#">Checkout</a> </li>
                                                <li><a href="#">Login</a> </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-md-6 col-sm-6">
                                        <div class="address">
                                            <h3>corporation</h3>
                                            <ul class="Links_footer">
                                                <li class="active"><a href="#">My account</a> </li>
                                                <li><a href="#">Wishlist</a> </li>
                                                <li><a href="#">My Cart</a> </li>
                                                <li><a href="#"> Checkout</a> </li>
                                                <li><a href="#">Login</a> </li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="col-lg-3 col-md-6 col-sm-6 ">
                                        <div class="address">
                                            <h3>why choose us</h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna </p>
                                            <form class="newtetter">
                                                <input class="tetter" placeholder="Your email" type="text" name="Your email">
                                                <button class="submit">Subscribe</button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                </div>
        </div>

    </footer>
    <!-- end footer -->


</div>

<div class="overlay"></div>

<!-- Javascript files-->
<script src="js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/customJS/myjs.js"></script>
<!-- sidebar -->
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="js/custom.js"></script>
<script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
<script type="text/javascript">
                                function doLogout() {
                                    if (confirm("bạn có chắc chắn muốn logout?")) {
                                        window.location = "logout";
                                    }
                                }
</script>
<script type="text/javascript">
    $(document).ready(function () {
        $("#sidebar").mCustomScrollbar({
            theme: "minimal"
        });

        $('#dismiss, .overlay').on('click', function () {
            $('#sidebar').removeClass('active');
            $('.overlay').removeClass('active');
        });

        $('#sidebarCollapse').on('click', function () {
            $('#sidebar').addClass('active');
            $('.overlay').addClass('active');
            $('.collapse.in').toggleClass('in');
            $('a[aria-expanded=true]').attr('aria-expanded', 'false');
        });
    });
</script>

<script>
    $(document).ready(function () {
        $(".fancybox").fancybox({
            openEffect: "none",
            closeEffect: "none"
        });

        $(".zoom").hover(function () {

            $(this).addClass('transition');
        }, function () {

            $(this).removeClass('transition');
        });
    });
</script>
<script>
    // This example adds a marker to indicate the position of Bondi Beach in Sydney,
    // Australia.
    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 11,
            center: {
                lat: 40.645037,
                lng: -73.880224
            },
        });

        var image = 'images/maps-and-flags.png';
        var beachMarker = new google.maps.Marker({
            position: {
                lat: 40.645037,
                lng: -73.880224
            },
            map: map,
            icon: image
        });
    }
</script>
<!-- google map js -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA8eaHt9Dh5H57Zh0xVTqxVdBFCvFMqFjQ&callback=initMap"></script>
<!-- end google map js -->
</body>

</html>

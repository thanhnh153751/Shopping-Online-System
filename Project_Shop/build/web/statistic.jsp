<%-- 
    Document   : statistic
    Created on : Mar 13, 2022, 9:23:27 PM
    Author     : THANH
--%>

<%@page import="java.util.List"%>
<%@page import="model.Statistic.CategoryStatistic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>
        <style>
            body {
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
            }

            #chartdiv1 {
                width: 100%;
                height: 500px;
            }
            #chartdiv2 {
                width: 100%;
                height: 500px;
                margin-top: 100px;
            }
            #chartdiv3 {
                width: 100%;
                height: 500px;
                margin-top: 100px;
            }
            #chartdiv4 {
                width: 100%;
                height: 500px;
                margin-top: 100px;
            }
            #chartdiv5 {
                width: 100%;
                height: 500px;
                margin-top: 100px;
            }
            #f2{
                margin-top: 100px;
            }


        </style>
    </head>
    <body>

        <a style="text-decoration: none;" href="home"><h1>Back</h1></a>
        <h1>Category Number Statistic</h1> 
        <div id="chartdiv1"></div>
        <h1>Income of Shop</h1>

        <form id="f" onchange="document.getElementById('f').submit()" action="statistic">
            <select name="year">
                <option>Year</option>

                <c:forEach items="${requestScope.orderYear}" var="y">                   
                    <option value="${y.orderDate}">${y.orderDate}</option>
                </c:forEach>
            </select>
            <div id="columnchart_values" style="width: 900px; height: 300px;"></div>
        </form>

        <!--category mua nhiều nhất -->

        <form id="f2" onchange="document.getElementById('f2').submit()" action="statistic">
            <h1>Most bought brand</h1>   
            Chọn tháng: <select name="month2">
                <c:forEach items="${requestScope.date}" var="da">
                    <option value="${da.month}/${da.year}" <c:if test="${da.month == requestScope.month2  && da.year == requestScope.year2}">selected</c:if>  >${da.month}/${da.year}</option>
                </c:forEach>
            </select>
        </form>


        <div id="chartdiv2"></div>
        <!--khách hàng mua nhiều nhất---------------------------------------->
        <form id="f3" onchange="document.getElementById('f3').submit()" action="statistic">
            <h1>customers who shop the most</h1>   
            Chọn tháng: <select name="month3">
                <c:forEach items="${requestScope.date}" var="da">
                    <option value="${da.month}/${da.year}" <c:if test="${da.month == requestScope.month3  && da.year == requestScope.year3}">selected</c:if>>${da.month}/${da.year}</option>
                </c:forEach>
            </select>
        </form>
        <div id="chartdiv3"></div>

        <!--sản phẩm xem nhiều nhất--------------------------------------------->
        <form id="f4" action="statistic">
            <h1>Top most viewed shoes</h1> 
            Chọn tháng: <select name="month4">
                <c:forEach items="${requestScope.date4}" var="da">
                    <option value="${da.month}/${da.year}" <c:if test="${da.month == requestScope.month4  && da.year == requestScope.year4}">selected</c:if>>${da.month}/${da.year}</option>
                </c:forEach>
            </select>
            
                <input type="submit" value="Search">
            </form>
            <div id="chartdiv4"></div>
            
        <form id="f5" action="statistic">
            <h1>Top selling products</h1> 
            Chọn tháng: <select name="month5">
                <c:forEach items="${requestScope.date5}" var="da">
                    <option value="${da.month}/${da.year}" <c:if test="${da.month == requestScope.month5  && da.year == requestScope.year5}">selected</c:if>>${da.month}/${da.year}</option>
                </c:forEach>
            </select>
            
                <input type="submit" value="Search">
        </form>    
            <div id="chartdiv5"></div>
        </body>
    </html>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
            google.charts.load("current", {packages: ['corechart']});
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {
            var data = google.visualization.arrayToDataTable([
            ["Element", "Density", {role: "style"}],
    <c:forEach items="${requestScope.income}" var="in">
            ["Month ${in.month}", ${in.total}, ""],
    </c:forEach>

            ]);
            var view = new google.visualization.DataView(data);
            view.setColumns([0, 1,
            {calc: "stringify",
                    sourceColumn: 1,
                    type: "string",
                    role: "annotation"},
                    2]);
            var options = {
            title: "Year ${requestScope.year}(VNĐ)",
                    width: 600,
                    height: 400,
                    bar: {groupWidth: "95%"},
                    legend: {position: "none"},
            };
            var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values"));
            chart.draw(view, options);
            }
</script>
<script src="https://cdn.amcharts.com/lib/5/index.js"></script>
<script src="https://cdn.amcharts.com/lib/5/percent.js"></script>
<script src="https://cdn.amcharts.com/lib/5/themes/Animated.js"></script>
<script>
            /**
             * ---------------------------------------
             * This demo was created using amCharts 5.
             * 
             * For more information visit:
             * https://www.amcharts.com/
             * 
             * Documentation is available at:
             * https://www.amcharts.com/docs/v5/
             * ---------------------------------------
             */

// Create root element
// https://www.amcharts.com/docs/v5/getting-started/#Root_element
            var root1 = am5.Root.new("chartdiv1");
// Set themes
// https://www.amcharts.com/docs/v5/concepts/themes/
            root1.setThemes([
                    am5themes_Animated.new(root1)
            ]);
// Create chart
// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/
            var chart1 = root1.container.children.push(
                    am5percent.PieChart.new(root1, {
                    endAngle: 270
                    })
                    );
// Create series
// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Series
            var series1 = chart1.series.push(
                    am5percent.PieSeries.new(root1, {
                    valueField: "value",
                            categoryField: "category",
                            endAngle: 270
                    })
                    );
            series1.states.create("hidden", {
            endAngle: - 90
            });
// Set data
// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Setting_data
            series1.data.setAll([
//        {
//            category: "Lithuania",
//            value: 501.9
//        }, {
//            category: "Czechia",
//            value: 301.9
//        }, {
//            category: "Ireland",
//            value: 201.1
//        }, {
//            category: "Germany",
//            value: 165.8
//        }, {
//            category: "Australia",
//            value: 139.9
//        }, {
//            category: "Austria",
//            value: 128.3
//        }, {
//            category: "UK",
//            value: 99
//        }
    <c:forEach items="${requestScope.dataCategory}" var="c">
            {
            category: "${c.categoryName}",
                    value: ${c.numberCategory}
            },
    </c:forEach>

            ]);
            series1.appear(1000, 100);</script>

<!--Char222222222222222222222222222222222222222222222222222222222222222222222222222of amchar-->
<!--<script src="https://cdn.amcharts.com/lib/5/index.js"></script>-->
<script src="https://cdn.amcharts.com/lib/5/percent.js"></script>
<script src="https://cdn.amcharts.com/lib/5/themes/Animated.js"></script>
<script>
            /**
             * ---------------------------------------
             * This demo was created using amCharts 5.
             * 
             * For more information visit:
             * https://www.amcharts.com/
             * 
             * Documentation is available at:
             * https://www.amcharts.com/docs/v5/
             * ---------------------------------------
             */

// Create root element
// https://www.amcharts.com/docs/v5/getting-started/#Root_element
            var root2 = am5.Root.new("chartdiv2");
// Set themes
// https://www.amcharts.com/docs/v5/concepts/themes/
            root2.setThemes([
                    am5themes_Animated.new(root2)
            ]);
// Create chart
// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/
            var chart2 = root2.container.children.push(am5percent.PieChart.new(root2, {
            layout: root2.verticalLayout
            }));
// Create series
// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Series
            var series2 = chart2.series.push(am5percent.PieSeries.new(root2, {
            valueField: "value",
                    categoryField: "category"
            }));
// Set data
// https://www.amcharts.com/docs/v5/charts/percent-charts/pie-chart/#Setting_data
            series2.data.setAll([
    <c:forEach items="${requestScope.cate2}" var="ca2">
            {value: ${ca2.total}, category: "${ca2.categoryName}"},
    </c:forEach>

            ]);
// Create legend
// https://www.amcharts.com/docs/v5/charts/percent-charts/legend-percent-series/
            var legend2 = chart2.children.push(am5.Legend.new(root2, {
            centerX: am5.percent(50),
                    x: am5.percent(50),
                    marginTop: 15,
                    marginBottom: 15
            }));
            legend2.data.setAll(series2.dataItems);
// Play initial series animation
// https://www.amcharts.com/docs/v5/concepts/animations/#Animation_of_series
            series2.appear(1000, 100);</script>



<!--<script src="https://cdn.amcharts.com/lib/5/index.js"></script>-->
<script src="https://cdn.amcharts.com/lib/5/xy.js"></script>
<script src="https://cdn.amcharts.com/lib/5/themes/Animated.js"></script>
<script>
            /**
             * ---------------------------------------
             * This demo was created using amCharts 5.
             * 
             * For more information visit:
             * https://www.amcharts.com/
             * 
             * Documentation is available at:
             * https://www.amcharts.com/docs/v5/
             * ---------------------------------------
             */

// Create root element
// https://www.amcharts.com/docs/v5/getting-started/#Root_element
            var root3 = am5.Root.new("chartdiv3");
// Set themes
// https://www.amcharts.com/docs/v5/concepts/themes/
            root3.setThemes([
                    am5themes_Animated.new(root3)
            ]);
            var data3 = [
    <c:forEach items="${requestScope.custom3}" var="cus3">
            {
            name: "${cus3.username}",
                    steps: ${cus3.total},
                    pictureSettings: {
                    src: "${cus3.image}"
                    }
            },
    </c:forEach>
//            {
//            name: "Monicac",
//                    steps: 45688,
//                    pictureSettings: {
//                    src: "https://www.amcharts.com/wp-content/uploads/2019/04/monica.jpg"
//                    }
//            }, {
//            name: "Joey",
//                    steps: 35781,
//                    pictureSettings: {
//                    src: "https://www.amcharts.com/wp-content/uploads/2019/04/joey.jpg"
//                    }
//            }, {
//            name: "Ross",
//                    steps: 25464,
//                    pictureSettings: {
//                    src: "https://www.amcharts.com/wp-content/uploads/2019/04/ross.jpg"
//                    }
//            }, {
//            name: "Phoebe",
//                    steps: 18788,
//                    pictureSettings: {
//                    src: "https://www.amcharts.com/wp-content/uploads/2019/04/phoebe.jpg"
//                    }
//            }, {
//            name: "Rachel",
//                    steps: 15465,
//                    pictureSettings: {
//                    src: "https://www.amcharts.com/wp-content/uploads/2019/04/rachel.jpg"
//                    }
//            }, {
//            name: "Chandler",
//                    steps: 11561,
//                    pictureSettings: {
//                    src: "https://www.amcharts.com/wp-content/uploads/2019/04/chandler.jpg"
//                    }
            ];
// Create chart
// https://www.amcharts.com/docs/v5/charts/xy-chart/
            var chart3 = root3.container.children.push(
                    am5xy.XYChart.new(root3, {
                    panX: false,
                            panY: false,
                            wheelX: "none",
                            wheelY: "none",
                            paddingBottom: 50,
                            paddingTop: 40
                    })
                    );
// Create axes
// https://www.amcharts.com/docs/v5/charts/xy-chart/axes/

            var xRenderer3 = am5xy.AxisRendererX.new(root3, {});
            xRenderer3.grid.template.set("visible", false);
            var xAxis3 = chart3.xAxes.push(
                    am5xy.CategoryAxis.new(root3, {
                    paddingTop: 40,
                            categoryField: "name",
                            renderer: xRenderer3
                    })
                    );
            var yRenderer3 = am5xy.AxisRendererY.new(root3, {});
            yRenderer3.grid.template.set("strokeDasharray", [3]);
            var yAxis3 = chart3.yAxes.push(
                    am5xy.ValueAxis.new(root3, {
                    min: 0,
                            renderer: yRenderer3
                    })
                    );
// Add series
// https://www.amcharts.com/docs/v5/charts/xy-chart/series/
            var series3 = chart3.series.push(
                    am5xy.ColumnSeries.new(root3, {
                    name: "Income",
                            xAxis: xAxis3,
                            yAxis: yAxis3,
                            valueYField: "steps",
                            categoryXField: "name",
                            sequencedInterpolation: true,
                            calculateAggregates: true,
                            maskBullets: false,
                            tooltip: am5.Tooltip.new(root3, {
                            dy: - 30,
                                    pointerOrientation: "vertical",
                                    labelText: "{valueY}"
                            })
                    })
                    );
            series3.columns.template.setAll({
            strokeOpacity: 0,
                    cornerRadiusBR: 10,
                    cornerRadiusTR: 10,
                    cornerRadiusBL: 10,
                    cornerRadiusTL: 10,
                    maxWidth: 50,
                    fillOpacity: 0.8
            });
            var currentlyHovered3;
            series3.columns.template.events.on("pointerover", function (e) {
            handleHover3(e.target.dataItem);
            });
            series3.columns.template.events.on("pointerout", function (e) {
            handleOut3();
            });
            function handleHover3(dataItem) {
            if (dataItem && currentlyHovered3 != dataItem) {
            handleOut3();
            currentlyHovered3 = dataItem;
            var bullet = dataItem.bullets[0];
            bullet.animate({
            key: "locationY",
                    to: 1,
                    duration: 600,
                    easing: am5.ease.out(am5.ease.cubic)
            });
            }
            }

            function handleOut3() {
            if (currentlyHovered3) {
            var bullet = currentlyHovered3.bullets[0];
            bullet.animate({
            key: "locationY",
                    to: 0,
                    duration: 600,
                    easing: am5.ease.out(am5.ease.cubic)
            });
            }
            }

            var circleTemplate3 = am5.Template.new({});
            series3.bullets.push(function (root, series, dataItem) {
            var bulletContainer = am5.Container.new(root, {});
            var circle = bulletContainer.children.push(
                    am5.Circle.new(
                            root,
                    {
                    radius: 34
                    },
                            circleTemplate3
                            )
                    );
            var maskCircle = bulletContainer.children.push(
                    am5.Circle.new(root, {radius: 27})
                    );
            // only containers can be masked, so we add image to another container
            var imageContainer = bulletContainer.children.push(
                    am5.Container.new(root, {
                    mask: maskCircle
                    })
                    );
            var image = imageContainer.children.push(
                    am5.Picture.new(root, {
                    templateField: "pictureSettings",
                            centerX: am5.p50,
                            centerY: am5.p50,
                            width: 60,
                            height: 60
                    })
                    );
            return am5.Bullet.new(root, {
            locationY: 0,
                    sprite: bulletContainer
            });
            });
// heatrule
            series3.set("heatRules", [
            {
            dataField: "valueY",
                    min: am5.color(0xe5dc36),
                    max: am5.color(0x5faa46),
                    target: series3.columns.template,
                    key: "fill"
            },
            {
            dataField: "valueY",
                    min: am5.color(0xe5dc36),
                    max: am5.color(0x5faa46),
                    target: circleTemplate3,
                    key: "fill"
            }
            ]);
            series3.data.setAll(data3);
            xAxis3.data.setAll(data3);
            var cursor3 = chart3.set("cursor", am5xy.XYCursor.new(root3, {}));
            cursor3.lineX.set("visible", false);
            cursor3.lineY.set("visible", false);
            cursor3.events.on("cursormoved", function () {
            var dataItem = series3.get("tooltip").dataItem;
            if (dataItem) {
            handleHover3(dataItem);
            } else {
            handleOut3();
            }
            });
// Make stuff animate on load
// https://www.amcharts.com/docs/v5/concepts/animations/
            series3.appear();
            chart3.appear(1000, 100);</script>




<!--<script src="https://cdn.amcharts.com/lib/5/index.js"></script>-->
<script src="https://cdn.amcharts.com/lib/5/xy.js"></script>
<script src="https://cdn.amcharts.com/lib/5/themes/Animated.js"></script>
<script>
            /**
             * ---------------------------------------
             * This demo was created using amCharts 5.
             * 
             * For more information visit:
             * https://www.amcharts.com/
             * 
             * Documentation is available at:
             * https://www.amcharts.com/docs/v5/
             * ---------------------------------------
             */

// Create root element
// https://www.amcharts.com/docs/v5/getting-started/#Root_element
            var root4 = am5.Root.new("chartdiv4");
// Set themes
// https://www.amcharts.com/docs/v5/concepts/themes/
            root4.setThemes([
                    am5themes_Animated.new(root4)
            ]);
// Create chart
// https://www.amcharts.com/docs/v5/charts/xy-chart/
            var chart4 = root4.container.children.push(am5xy.XYChart.new(root4, {
            panX: false,
                    panY: false,
                    wheelX: "panX",
                    wheelY: "zoomX",
                    layout: root4.verticalLayout
            }));
// Data
            var colors4 = chart4.get("colors");
            var data4 = [
    <c:forEach items="${requestScope.listview}" var="v">
            {
            country: "${v.productName}",
                    visits: ${v.totalView},
                    icon: "${v.images}",
                    columnSettings: {fill: colors4.next()}
            },
    </c:forEach>

            ];
// Create axes
// https://www.amcharts.com/docs/v5/charts/xy-chart/axes/
            var xAxis4 = chart4.xAxes.push(am5xy.CategoryAxis.new(root4, {
            categoryField: "country",
                    renderer: am5xy.AxisRendererX.new(root4, {
                    minGridDistance: 30
                    }),
                    bullet: function (root, axis, dataItem) {
                    return am5xy.AxisBullet.new(root, {
                    location: 0.5,
                            sprite: am5.Picture.new(root, {
                            width: 24,
                                    height: 24,
                                    centerY: am5.p50,
                                    centerX: am5.p50,
                                    src: dataItem.dataContext.icon
                            })
                    });
                    }
            }));
            xAxis4.get("renderer").labels.template.setAll({
            paddingTop: 20
            });
            xAxis4.data.setAll(data4);
            var yAxis4 = chart4.yAxes.push(am5xy.ValueAxis.new(root4, {
            renderer: am5xy.AxisRendererY.new(root4, {})
            }));
// Add series
// https://www.amcharts.com/docs/v5/charts/xy-chart/series/
            var series4 = chart4.series.push(am5xy.ColumnSeries.new(root4, {
            xAxis: xAxis4,
                    yAxis: yAxis4,
                    valueYField: "visits",
                    categoryXField: "country"
            }));
            series4.columns.template.setAll({
            tooltipText: "{categoryX}: {valueY}",
                    tooltipY: 0,
                    strokeOpacity: 0,
                    templateField: "columnSettings"
            });
            series4.data.setAll(data4);
// Make stuff animate on load
// https://www.amcharts.com/docs/v5/concepts/animations/
            series4.appear();
            chart4.appear(1000, 100);
</script>



<!--char5--------------------------------------------------------------------------------------------------------------------------->

<script>
            /**
             * ---------------------------------------
             * This demo was created using amCharts 5.
             * 
             * For more information visit:
             * https://www.amcharts.com/
             * 
             * Documentation is available at:
             * https://www.amcharts.com/docs/v5/
             * ---------------------------------------
             */

// Create root element
// https://www.amcharts.com/docs/v5/getting-started/#Root_element
            var root5 = am5.Root.new("chartdiv5");
// Set themes
// https://www.amcharts.com/docs/v5/concepts/themes/
            root5.setThemes([
                    am5themes_Animated.new(root5)
            ]);
// Create chart
// https://www.amcharts.com/docs/v5/charts/xy-chart/
            var chart5 = root5.container.children.push(am5xy.XYChart.new(root5, {
            panX: false,
                    panY: false,
                    wheelX: "panX",
                    wheelY: "zoomX",
                    layout: root5.verticalLayout
            }));
// Data
            var colors5 = chart5.get("colors");
            var data5 = [
    <c:forEach items="${requestScope.listP}" var="v">
            {
            country: "${v.productName}",
                    visits: ${v.total},
                    icon: "${v.image}",
                    columnSettings: {fill: colors5.next()}
            },
    </c:forEach>

            ];
// Create axes
// https://www.amcharts.com/docs/v5/charts/xy-chart/axes/
            var xAxis5 = chart5.xAxes.push(am5xy.CategoryAxis.new(root5, {
            categoryField: "country",
                    renderer: am5xy.AxisRendererX.new(root5, {
                    minGridDistance: 30
                    }),
                    bullet: function (root, axis, dataItem) {
                    return am5xy.AxisBullet.new(root, {
                    location: 0.5,
                            sprite: am5.Picture.new(root, {
                            width: 24,
                                    height: 24,
                                    centerY: am5.p50,
                                    centerX: am5.p50,
                                    src: dataItem.dataContext.icon
                            })
                    });
                    }
            }));
            xAxis4.get("renderer").labels.template.setAll({
            paddingTop: 20
            });
            xAxis5.data.setAll(data5);
            var yAxis5 = chart5.yAxes.push(am5xy.ValueAxis.new(root5, {
            renderer: am5xy.AxisRendererY.new(root5, {})
            }));
// Add series
// https://www.amcharts.com/docs/v5/charts/xy-chart/series/
            var series5 = chart5.series.push(am5xy.ColumnSeries.new(root5, {
            xAxis: xAxis5,
                    yAxis: yAxis5,
                    valueYField: "visits",
                    categoryXField: "country"
            }));
            series5.columns.template.setAll({
            tooltipText: "{categoryX}: {valueY}",
                    tooltipY: 0,
                    strokeOpacity: 0,
                    templateField: "columnSettings"
            });
            series5.data.setAll(data5);
// Make stuff animate on load
// https://www.amcharts.com/docs/v5/concepts/animations/
            series5.appear();
            chart5.appear(1000, 100);
</script>
<%-- 
    Document   : addnew
    Created on : Feb 19, 2022, 8:19:00 AM
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
        <h1 style="text-align: center">Add new Product</h1>
        <form action="addnew" method="post" enctype="multipart/form-data">
            <table style="margin: 0 auto;">
                <tr>
                    <td>next Product ID</td>
                    <td><input type="number" name="id" readonly value="${requestScope.nextID}"/></td>
                </tr>
                <tr>
                    <td>enter Product Name</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>enter Unit Price</td>
                    <td><input type="text" name="price" value="0"/>(VNĐ)</td>
                </tr>
                <tr>
                    <td>enter Units In Stock</td>
                    <td><input type="number" name="inStock" value="0"/></td>
                </tr>
                <tr>
                    <td>enter Units On Order</td>
                    <td><input type="number" name="onOrder" value="0"/></td>
                </tr>
                <tr>
                    <td>enter Product Description</td>
                    <td><input type="text" name="description"/></td>
                </tr>
                <tr>
                    <td>enter Photo</td>
                    <td><input type="file" class="form-control" name="file" placeholder="Enter photo"></td>
                </tr>
                <tr>
                    <td>enter Category</td>
                    <td>
                        <select name="cid" >             
                            <c:forEach items="${requestScope.category}" var="d">
                                <option  value="${d.categoryID}"  >${d.categoryName}</option>    
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
        <p style="color: red">${requestScope.alert}</p>

        <c:if test="${requestScope.newP!=null}">            
            <table class="infor" border="1px">
                <tr>
                    <th>ProductID</th>
                    <th>ProductName</th>
                    <th>image</th>
                    <th>Price</th>
                    <th>Units In Stock</th>
                    <th>Units On Order</th>
                    <th>description</th>
                </tr>
                <!---->
                <!--images/Nike-Air-Max-97-MSCHF-x-INRI-Jesus-replica-800x600.jpg-->
                <tr>
                    <td>${requestScope.newP.productID}</td>
                    <td>${requestScope.newP.productName}</td>
                    <td><img style="width: 80px;height: 60px;" src="${requestScope.newP.image}"/></td>
                    <td>${requestScope.newP.unitPrice}</td>
                    <td>${requestScope.newP.unitsInStock}</td>
                    <td>${requestScope.newP.unitsOnOrder}</td>
                    <td>${requestScope.newP.description}</td>


                </tr>    

            </table>

        </c:if>



        <!--            <input type="text" name="price" id="currency-field" pattern="^\d{1,3}(,\d{3})*(\.\d+)?$" value="" data-type="currency" placeholder=""/>(VNĐ)<br/>-->
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
        <script type="text/javascript">
            // Jquery Dependency

            $("input[data-type='currency']").on({
                keyup: function () {
                    formatCurrency($(this));
                },
                blur: function () {
                    formatCurrency($(this), "blur");
                }
            });


            function formatNumber(n) {
                // format number 1000000 to 1,234,567
                return n.replace(/\D/g, "").replace(/\B(?=(\d{3})+(?!\d))/g, ",")
            }


            function formatCurrency(input, blur) {
                // appends $ to value, validates decimal side
                // and puts cursor back in right position.

                // get input value
                var input_val = input.val();

                // don't validate empty input
                if (input_val === "") {
                    return;
                }

                // original length
                var original_len = input_val.length;

                // initial caret position
                var caret_pos = input.prop("selectionStart");

                // check for decimal
                if (input_val.indexOf(".") >= 0) {

                    // get position of first decimal
                    // this prevents multiple decimals from
                    // being entered
                    var decimal_pos = input_val.indexOf(".");

                    // split number by decimal point
                    var left_side = input_val.substring(0, decimal_pos);
                    var right_side = input_val.substring(decimal_pos);

                    // add commas to left side of number
                    left_side = formatNumber(left_side);

                    // validate right side
                    right_side = formatNumber(right_side);

                    // On blur make sure 2 numbers after decimal
                    if (blur === "blur") {
//                        right_side += "00";
                    }

                    // Limit decimal to only 2 digits
                    right_side = right_side.substring(0, 2);

                    // join number by .
                    input_val = "" + left_side + "." + right_side;

                } else {
                    // no decimal entered
                    // add commas to number
                    // remove all non-digits
                    input_val = formatNumber(input_val);
                    input_val = "" + input_val;

                    // final formatting
                    if (blur === "blur") {
//                        input_val += ".00";
                    }
                }

                // send updated string to input
                input.val(input_val);

                // put caret back in the right position
                var updated_len = input_val.length;
                caret_pos = updated_len - original_len + caret_pos;
                input[0].setSelectionRange(caret_pos, caret_pos);
            }

        </script>
    </body>
</html>

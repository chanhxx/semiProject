<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.uni.cart.model.vo.Cart" %>
<%@ page import="java.util.ArrayList" %>
<%
	//ArrayList<Cart> list = //(ArrayList<Cart>)request.getAttribute("list");
	Cart cd = new Cart();
%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<link href="././resources/css/styles2.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
<style>
	
.date {
  	text-align: right;
   }
   
   * {
    margin: 0;
    padding: 0;
	}

	table {
	    border-collapse: collapse;
	    border-spacing: 0;
	}
	
	tbody {
    display: table-row-group;
    vertical-align: middle;
    border-color: inherit;
	}

  .contents-cart {
      position: relative;
    visibility: hidden;
    width: 1000px;
    border: 1px solid #e0e0e0;
    margin: 0 auto 70px;
    padding: 40px 39px;
    background: #fff;
    }
    
    .cart-title {
        clear: both;
    height: 45px;
    margin-bottom: 0;
    padding-bottom: 32px;
    font-size: 30px
    }
    
    
    .cartTable{
    width: 898px;
    border-top: 0;
    }
    
    #cartTable-sku td.cart-deal-item__image {
    padding-right: 15px;
	}
	
	#cartTable-sku td.product-box {
    padding-left: 0;
	}

    colgroup{
    display: table-column-group;
    }
    
    table {
    border-collapse: collapse;
    border-spacing: 0;
    text-indent: initial;
	}
	
	
	body, input, textarea, select, button, table {
    font-family: sans-serif;
    font-size: 100%;
	}
	
	a, blockquote, body, button, dd, div, dl, dt, fieldset, form, h1, h2, h3, h4, h5, h6, input, li, ol, p, pre, select, span, td, textarea, th, ul {
    margin: 0;
    padding: 0;
    color: #111;
    font-family: Dotum,\\B3CB\C6C0,sans-serif;
	}
	
	.cartTable .head {
    border-top: 1px solid #ddd;
    border-bottom: 1px solid #ddd;
    background: lightyellow;
	}
	
	.cartTable th {
    height: 40px;
    font-size: 13px;
	}


	
	.product-name-part {
    border-bottom: 1px solid #e2e5e7;
    padding-bottom: 5px;
    letter-spacing: -1px;
	}

	.cart-deal-item td.product-box {
	    padding: 10px 5px 10px 15px;
	    text-align: left;
	    vertical-align: top;
	    z-index: 100;
	}
	
	.cartTable td {
    border-bottom: 1px solid #ddd;
    line-height: 35px;
    text-align: center;
	}
	
	.option-price-part {
    float: right;
    font-size: 12px;
    line-height: 24px;
	}
	
	.cart-deal-item td.product-box {
    padding: 10px 5px 10px 15px;
    text-align: left;
    vertical-align: top;
    z-index: 100;
	}

    .cart-deal-item td:nth-child(2) {
    width: 300px;
    overflow: hidden;
	}
	
	.cart-deal-item td:nth-child(3) {
    width: 50px;
    overflow: hidden;
	}
	
	.cart-deal-item td:nth-child(4) {
    width: 50px;
	}
	
	.cart-deal-item .unit-total-price {
    position: relative;
    line-height: normal;
    border-left: 1px solid #ddd;
    font-size: 12px;
    color: #888;
	}
	
	.cart-deal-item td {
    padding: 10px 0;
    z-index: 1;
	}
	
	.delivery-fee {
    border-left: 1px solid #ddd;
    font-size: 12px;
    color: #888;
	}
	
	.bundle-price-total td {
    position: relative;
    padding: 20px 35px 16px 0;
    background: lightyellow;
    font-size: 12px;
    line-height: 29px;
    text-align: right;
	}
	
	
	a, blockquote, body, button, dd, div, dl, dt, fieldset, form, h1, h2, h3, h4, h5, h6, input, li, ol, p, pre, select, span, td, textarea, th, ul {
    margin: 0;
    padding: 0;
    color: #111;
    font-family: Dotum,\\B3CB\C6C0,sans-serif;
	}
	
	.bundle-price-total .global-total-price-area, .bundle-price-total .rocket-fresh-total-price-area, .bundle-price-total .rocket-install-total-price-area, .bundle-price-total .rocket-total-price-area {
    display: inline-block;
	}
	
	.sr-only {
    position: absolute;
    height: 1px;
    width: 1px;
    overflow: hidden;
    clip: rect(1px 1px 1px 1px);
    clip: rect(1px,1px,1px,1px);
	}
	
	.bundle-price-total .number {
    display: inline-block;
    font: normal 15px/15px tahoma;
    color: #111;
    vertical-align: 0;
	}
	
	.symbol-minus, .symbol-plus {
    display: inline-block;
    width: 18px;
    height: 18px;
    margin: 0 8px;
    vertical-align: -5px;
	}
	
	.symbol-plus {
    background: url(//img1a.coupangcdn.com/image/order/mathematics-symbol.png) no-repeat;
    background-position: 0 0;
	}
	
	.symbol-equal, .symbol-plus1 {
    display: inline-block;
    width: 18px;
    height: 18px;
	}
	
	.symbol-equal {
    margin: 0 8px;
    background: url(//img1a.coupangcdn.com/image/order/mathematics-symbol.png) no-repeat;
    vertical-align: -5px;
    background-position: -36px 0;
	}
	
	.bundle-price-total .total-order-price.number {
    font-weight: 700;
	}
	
	.cart-total-price {
    clear: both;
    border: 4px solid #c8c8c8;
    text-align: center;
	}
	
	.cart-total-price__inner {
    display: inline-block;
    margin: 0 auto;
    vertical-align: top;
	}
	
	.cart-total-price .price-area {
    padding: 20px 15px 18px;
    font-size: 14px;
    line-height: 17px;
    color: #555;
    text-align: center;
	}
	 
	 .sr-only {
    position: absolute;
    height: 1px;
    width: 1px;
    overflow: hidden;
    clip: rect(1px 1px 1px 1px);
    clip: rect(1px,1px,1px,1px);
	}

	.symbol-plus1 {
    margin: 0 11px 0 10px;
    vertical-align: -4px;
    background: url(//img1a.coupangcdn.com/image/www/newBuy/img_plus_2.gif) no-repeat;
	}
	 
	.symbol-equal, .symbol-plus1 {
    display: inline-block;
    width: 18px;
    height: 18px;
	}

	.cart-total-price em {
	    padding: 0 4px 0 5px;
	    font: 700 17px/17px tahoma;
	    color: #111;
	}

	.symbol-equal1 {
	    background: url(//img1a.coupangcdn.com/image/www/newBuy/img_equals_2.gif) no-repeat;
	}
	
	.symbol-equal1, .symbol-minus1 {
	    display: inline-block;
	    width: 18px;
	    height: 18px;
	    margin: 0 11px 0 10px;
	    vertical-align: -4px;
	}

	.cart-total-price .final-order-price {
	    color: #ea0000;
	    font-size: 20px;
	}
	
	.faraway-notice {
    margin-top: 20px;
    padding: 12px 0 9px;
    background: #fafafa;
    font-size: 12px;
    color: #555;
    text-align: center;
    visibility: hidden;
	}
	
	.order-buttons, .summary-area {
    margin-top: 30px;
    text-align: center;
    position: relative;
	}
	
	.goPayment, .goShopping {
    font-size: 22px;
    font-weight: 1000;
    display: inline-block;
    position: relative;
    width: 200px;
    line-height: 18px;
    border: 2px solid lightgray;
    border-radius: 4px;
    padding: 22px 0 19px;
    text-align: center;
	}
	
	.goShopping {
    background: white;
    color: skyblue;
    margin-right: 5px;
	}
	
	.goPayment {
    background: skyblue;
    color: white;
    
	}
	
	.delete-option {
    position: relative;
    display: inline-block;
    width: 18px;
    height: 18px;
    margin-top: 3px;
    background: url(//img1a.coupangcdn.com/image/cart/generalCart/cart_sprite_170201.png) -114px 0 no-repeat;
    vertical-align: top;
    z-index: 120;
	}
	
	.option-price-part {
    float: right;
    font-size: 12px;
    line-height: 24px;
	}

	.unit-cost {
	    color: #888;
	    letter-spacing: 0;
	    vertical-align: top;
	}

</style>
</head>
<body>
<jsp:include page = "../common/menu.jsp"/>
<br><br><br><br><br>
<section id="contents-cart" class="contents-cart async-content" style="visibility: visible;">    <!-- ?????? ?????? -->    
        <section class="cart-title">
        <i class="bi-cart-fill me-1"></i>   ????????????
        </section>
      
    <div id="cartContent">
    <div id="list" >
    	<%--???????????? ?????? --%>
    </div>
    <%-- ??????????????? ?????? --%>
    <script>
   	
   		$(function(){
   			
   			$.ajax({
   		   		url: "cartListData.do",
   		   		
   		   		type: "get",
   		   		
   		   		success:function(list){
   		   			
   		   			let value = "";
   		   			console.log(list)
   		   			for(var i  in list){
			 
   								value +=  
   						 
   									'<table class="cartTable">'+
   						   		   
   							     '<caption class="none"></caption>'+ <!-- ?????? ??????  -->
   							     '<colgroup><col width="50"><col width="100"><col width="30"><col width="30"></colgroup>'+ <!-- ???????????? ?????? ???????????? -->
   							     
   							     '<thead>'+
   							           '<tr class="head">'+
   							               
   							               '<th scope="colgroup" id="th-product-box" colspan="2" style="text-align:center">????????????</th>'+
   							               '<th scope="col" id="th-unit-total-price" style="text-align:center">????????????</th>'+
   							               '<th scope="col" id="th-delivery-fee" style="text-align:center">?????????</th>'+
   							               
   							           '</tr>'+
   							     '</thead>'+
   						           
   						   		'<tbody id="cartTable-sku">'+
   						   
   						           '<tr class="cart-deal-item">'+
   						               
   						           		'<td class="cart-deal-item__image" id="pImg">'+
   						                       
   						                   '<a href="<%=request.getContextPath() %>/detailProduct.do?no='+list[i].pId+'"><img class="card-img-top" src="<%=request.getContextPath() %>/resources/image/'+list[i].piName+'" width=120px height=120px alt="???????????????" /></a>'+
   						                     
   						                '</td>'+
   						                   '<td class="product-box">'+
   						                       
   						                       '<div class="product-name-part">'+
   						                           
   						                           '<a href="<%=request.getContextPath() %>/detailProduct.do?no='+list[i].pId+'" class="product-name moveProduct modify-color" style=" text-decoration: none; color: inherit"><b>'+list[i].pName+'</b></a>'+
   						                           
   						                       '</div>'+
   						                       
   						                       '<div id="80200404752" data-dawn-only="false" class="option-item modify-float" data-quantity="1" >'+
   						                       
   						                           '<div class="option-item-info" data-restock-notification-state="false">'+
   						                            
   						                                '<div class="delivery-date rocket modify-padding">'+
   						                                
   						                                     '<span class="arrive-date" style="display: inline-block; font-size:14px;"><strong>'+list[i].dDate+'</strong></span> <br>'+
   						                                  	 '<span class="arrive-date" style="display: inline-block; font-size:12px;"><strong>?????? ??????</strong></span>'+
   						                                  
   						                                '</div>'+

   						                           '</div>'+
   						                           
   						                                '<div class="option-price-part" >'+
   						                               
   						                               		'<span class="unit-cost" id="original'+i+'">'+list[i].poPrice+'</span> &nbsp'+
   						                                   
   																'<select class="quantity-select" id="amountChange" name="amountChange'+i+'" onchange="change(this.value, this.name)" >'+
   																		
   																		'<option>'+list[i].pAmount+'</option>'+
   																		
   																		'<option value="1">1</option>'+
   																	
   																		'<option value="2">2</option>'+
   																	
   																		'<option value="3">3</option>'+
   																	
   																		'<option value="4">4</option>'+
   																	
   																		'<option value="5">5</option>'+
   																	
   																		'<option value="6">6</option>'+
   																	
   																		'<option value="7">7</option>'+
   																	
   																		'<option value="8">8</option>'+
   																	
   																		'<option value="9">9</option>'+
   																	
   																		'<option value="10">10+</option>'+
   																		
   																'</select>'+
   																
   						                                   		'<a class="delete-option" onclick=deleteProduct('+list[i].pId+')></a>'+
   						                                   
   						                                '</div>'+
   						                         
   						                         '</div>'+
   						                          
   						                   '</td>'+
   						                   
   						                   '<td class="unit-total-price">'+
   							                    
   											   '<div class="unit-total-sale-price" name="twochangePrice'+i+'">'+list[i].pPrice+'</div>'+
   									
   										   '</td>'+
   						                   
   							               '<td class="delivery-fee" rowspan="1" headers="th-delivery-fee">'+
   						                           
   						                       '<span class="delivery-fee__free"  name="dPrice'+i+'">'+ dPrice(i) +'???</span>'+
   						                           
   						                   '</td>'+
   						                      
   						           '</tr>'+
   							        
   						       	   '<tr class="special-gift-area" style="display: none;"></tr>'+
   						       	   
   						       	   '<tr class="bundle-price-total">'+
   						       	   
   						           	  '<td colspan="5">'+
   						               
   						                 '<span class="rocket-total-price-area">????????????'+
   						                 
   											 '<span class="total-product-price number"  name="ChangePrice'+i+'" >'+list[i].pPrice+'</span>??? <span class="coupon-area">'+
   						                   
   							                     '<span class="symbol symbol-plus"><span class="sr-only">?????????</span></span>'+
   							                     
   												 '????????? <span id="rocket-delivery-charge" class="delivery-charge" name="dPrice'+i+'"><strong>'+ dPrice(i) +'???</strong></span>'+
   												 
   												 '<span class="symbol symbol-equal"><span class="sr-only">?????????</span></span>'+
   												 
   												 '???????????? <span class="total-order-price number"  name="changetotal'+i+'">'+(list[i].pPrice + dPrice(i))+'</span>???'+
   						                 
   										     '</span>'+
   						           		  '</span>'+
   						           	   '</td>'+
   						      	    '</tr>'+
   						   
   						   		'</tbody>'+

   						     '</table>'+
   							                  
   						   	 '<form id="listInfo'+i+'" action="<%=request.getContextPath()%>/paymentMember.do" method="post">'+
   						       	 '<input type="hidden" id="title'+i+'" name="title'+i+'" value="'+list[i].pId+'">'+	
   						       	 '<input type="hidden" id="price'+i+'" value="'+list[i].poPrice+'">'+	
   						       	 '<input type="hidden" id="total" name="total'+i+'" value="'+list[i].poPrice+'">'+	
   						     	 '<input type="hidden" id="listLe" value="'+list.length+'">'+	
   						     '</form>' <%-- ?????? ???--%>
   								
   							  function dPrice(i){
   			   		   			let c = 0;
   			   		   			if(i == 0){
   			   		   					c = 2500;
   			   		   				}else{
   			   		   					c = 0;
   			   		   				}
   			   		   				
   			   		   			return c	
   			   		   			}
   		   			} <%-- for??? ???--%>
   		   		
   		   		$('#list').html(value);
   		   
   		   		let total = null;
				let dtotal = null;
   		   		for(let j in list){
   		   			
   		   			total += Number($('[name="ChangePrice'+j+'"]').html());
   		   			
   		   			console.log(total)
   		   			
   		   		}
   		   		if(list.length != 0){
				dtotal = total + 2500
   		   		$('#totalPrice').html(dtotal); 
   		   		$('[name="total0"]').val(dtotal);
   		   		$('#total1').html(total); 
   		   		$('#dPrice2').html(2500);
   		   		
   		   		console.log($('[name="total0"]').val())
   		   				console.log("??????" + $('[name="total0"]').val())
   		   		}
 		   		
   		   				
   		   		} <%-- success --%>

   	   		,
		   	   	error:function(){
			   		console.log("ajax????????????");
			   		
				}
   		})
   	})
   	
   		function totDPrice(){
 		  			let dp = 0;
 		  			if($('#listLe') != null){
 		  				dp = 2500;
 		  			}else{
 		  			return dp;
 		  			}
   		  		}
   </script>
        <%-- ???????????? ?????? --%>
           

            
            <div class="download-coupon-area" style="display: none;"></div>


            
            <div class="cart-total-price" data-total-price="0" data-discount-price="0">
                <div class="cart-total-price__inner">
                    <div class="price-area">
                        <h2 class="sr-only" id="cart-total-price">
                            ???????????? ??? ???????????? ??????
                        </h2>

                        ??? ????????????
                        <em class="final-product-price" id="total1">0</em><b>???</b>
                        <span class="final-sale-area">
                        
                        </span>

                        <span class="symbol-plus1"><span class="sr-only">?????????</span></span>
                        ??? ?????????
                        <em class="final-delivery-charge" id="dPrice2">0</em><b>???</b>
                        <span class="symbol-equal1"><span class="sr-only">?????????</span></span>
                        ??? ????????????
                        <em class="final-order-price" id="totalPrice">
                          0
                        </em><b>???</b>
                    </div>
                </div>
            </div>
   

            
            <div class="order-buttons">
                <a id="continueShoopingBtn" class="goShopping logging" href=<%=request.getContextPath()%>>?????? ????????????</a>
                <button class="goPayment" id="btnPay"><strong>????????????</strong></button>
                <div class="item-disabled" style="display: none;"></div>
            </div>
        
       
    
    <iframe id="ab_iframe" class="ab_test"width="0" height="0"></iframe> <!-- ???????????? -->
    
</div>


    </section>
    <jsp:include page = "../common/footer.jsp"/>
    
    <script type="text/javascript">
    
    
    function change(value, name){
    	
		let String = name; // ?????? ?????? select ??????

    	let count = value; // ?????? ??????
    	let index = String.charAt(String.length-1); // ?????????????????? select?????? ????????? ??????
    	
    	let original = $('#original'+index+'').html(); // ?????? ?????? ????????? 1?????? ?????? ???
    	let totprice2 = $('[name="twochangePrice'+index+'"]').html(); // ???????????? ????????????(origianl * count) ???
    	let pid = $('[name="title'+index+'"]').val(); // ????????????????????? ???????????? ???
    	let changetotal = $('[name="changetotal'+index+'"]').html(); // ???????????? ????????????(origianl * count + 2500)	???
    	
    	let result = original * count
    	console.log(result)
    	// ??????????????? * 1?????? ?????? => DB??? ????????? ?????????
    	
    	
    	$.ajax({
			
			url: "amountChange.do",
			
			type: "get",
			
			data:{
					q:count,
					name:pid,
					p:result
	
				},
			
			success:function(){
				
				console.log("??????")
				$('[name="ChangePrice'+index+'"]').html(result);
				$('[name="twochangePrice'+index+'"]').html(result);
				$('[name="changetotal'+index+'"]').html(result+2500);
				
			},
			
			error:function(){
		   			console.log("ajax????????????");
		   			
		   		}
		
			})
			
		
	}
    </script>
   
   <script>
   	$('#btnPay').click(function(){
   		
   		$('#listInfo0').submit();
   		<%--location.href="<%=request.getContextPath()%>/orderList.do";--%>
   		
   		<%--location.href="<%=request.getContextPath()%>/paymentMember.do";--%>
   		
   		
   	})
   		
   	 
   	function deleteProduct(pId){
   		
   		location.href="<%=request.getContextPath()%>/deleteCartProduct.do?pId="+pId;
   	}
   	
   
   	
   </script>
    
</body>
</html>
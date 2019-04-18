<!--   --%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

<c:set var="productId" value="${param.productId}" />
<div class="product-detail">
	<div product-detail-img>
		<img href src="img/${product.imageName}" />
	</div>
	<div class="product-description">
		<c:choose>
     			<c:when test="${product.isTopSeller()}">
     				<span class="detail-name-topsell"><div>${product.name} </div>  <div class="detail-top-seller"> BEST SELLER!</div> </span>
     				
     			</c:when> 
     			<c:otherwise>
     				<h4>${product.name}</h4>
     			</c:otherwise>
     	</c:choose>
     		
     	<div class ="manufacturer">by ${product.manufacturer}</div>
     	<img src="img/${Math.round(product.averageRating)}-star.png" />
     	<br>
     	<br>
     	<div class="table-price">Price: $${product.price}</div>
     	<div class="weight"><b>Weight</b>: ${product.weightInLbs} lbs.</div>
     	<p class="description"><b>Description:</b> ${product.description}</p>
		
		
	</div>
</div>


<title>Insert title here</title>
</head>
<body>

</body>
</html>
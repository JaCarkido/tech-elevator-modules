<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

    <section id="main-content">
		<h3>Toy Department</h3>
		<div id="content">
		<c:forEach var="product" items="${productList}">
			<c:url value ="productDetail" var="productDetail" />
			<a class="product" href ="${productDetail}?productId=${product.productId}">
			<!--  <div class="product"> -->
				<!--  IMAGE  -->
				<img href src="img/${product.imageName}"/>
				<c:set var="isTopSeller" value="${product.isTopSeller()}"/>
     		<c:choose>
     			<c:when test="${isTopSeller}">
     				<span class="name-topsell"><div>${product.name} </div>  <div class="top-seller"> Top Seller!</div> </span>
     				
     			</c:when> 
     			<c:otherwise>
     				<div class="name-topsell">${product.name}</div>
     			</c:otherwise>
     		</c:choose>
				<div class="manufacturer">by ${product.manufacturer}</div>
				<div class="price">$ ${product.price}</div>
				<div class="weight">Weight ${product.weightInLbs} lbs</div>
				<div class="rating">
					<img src="img/${Math.round(product.averageRating)}-star.png" />
				</div>
			<!-- </div> -->
			</a>	
		</c:forEach>
        </div>

    </section>
</body>
</html>
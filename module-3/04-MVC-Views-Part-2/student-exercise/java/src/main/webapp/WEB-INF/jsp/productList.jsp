<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

<section id="main-content">
    <h3>Toy Department</h3>
		<div id="content">
		<c:forEach var="product" items="${productList}">
		<c:url value ="productDetail" var="productDetail" />
			<a class="product-list" href ="${productDetail}?productId=${product.productId}">
			
				<!--  IMAGE  -->
				<div class="list-image">
					<img href src="img/${product.imageName}"/>
				</div>
				<div class="description-block">
					<h4>${product.name}</h4>
					<p class="manufacturer">by ${product.manufacturer}</p>
					<p class="price">$ ${product.price}</p>
					<p class="weight">Weight ${product.weightInLbs} lbs</p>
					<div class="list-rating">
						<img src="img/${Math.round(product.averageRating)}-star.png" />
					</div>
				</div>
			</a>	
		</c:forEach>
        </div>

       

    </section>
</body>
</html>
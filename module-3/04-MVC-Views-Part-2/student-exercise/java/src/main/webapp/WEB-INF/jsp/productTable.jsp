<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
</c:import>

    <section id="main-content">
    <h3>Toy Department</h3>
    <div id="content-table">
    	<table class="product-table">
    
   
     	<tr>
     		<c:forEach var="product" items="${productList}">
     			<th class="table-image">
     			<c:url value ="productDetail" var="productDetail" />
     				<a class="product" href ="${productDetail}?productId=${product.productId}">	
     					<img href src="img/${product.imageName}"/>
     				</a>
     			</th>   
  	 		</c:forEach>
  	 	</tr>
  	 	<tr>
     		<c:forEach var="product" items="${productList}">
     			<c:set var="isTopSeller" value="${product.isTopSeller()}"/>
     			<c:choose>
     				<c:when test="${isTopSeller}">
     					<td class="table-top-seller">Top Seller!</td>  
     				</c:when> 
     				<c:otherwise>
     					<td> </td>
     				</c:otherwise>
     			</c:choose>
  	 		</c:forEach>
  	 	</tr>
     	<tr class="every-other">
     		<c:forEach var="product" items="${productList}">
     			<td class="table-row-name">
     				<a class="product-name" href ="${productDetail}?productId=${product.productId}">	
     					${product.name}
     				</a>
     			</td>   
  	 		</c:forEach>
  		 </tr>
  		 <tr>	
  	 		<c:forEach var="product" items="${productList}">
     			<td><div class="table-rating">
					<img src="img/${Math.round(product.averageRating)}-star.png" />
				</div></td>   
  	 		</c:forEach>
  		 </tr>
  		 <tr class="every-other">
  	 		<c:forEach var="product" items="${productList}">
     			<td>${product.manufacturer}</td>   
  	 		</c:forEach>
  		 </tr>	
  		 <tr>
  	 		<c:forEach var="product" items="${productList}">
     			<td class="table-price">$${product.price}</td>   
  	 		</c:forEach>
  		 </tr>	
  	 	 <tr class="every-other">
  	 		<c:forEach var="product" items="${productList}">
     			<td>${product.weightInLbs} lbs</td>   
  	 		</c:forEach>
  		 </tr>	
   	 	 </table>
   	</div>	
    </section>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

		
	<div id="main-content">
	<h1>Read Reviews!</h1>
		<c:forEach var="review" items="${reviews}" >
			<div class="review-card">
				<div>
					<span class="title">${review.title}</span> (${review.username})
				</div>
				<p class="submit-date">
					${review.formattedDate}
				</p>	
				<div class="rating">	
					<img src="img/${review.rating}-star.png">
				</div>
			
				<p class="review-message">
					${review.text}
				</p>
			</div>
		</c:forEach>
	</div>
	</body>
</html>
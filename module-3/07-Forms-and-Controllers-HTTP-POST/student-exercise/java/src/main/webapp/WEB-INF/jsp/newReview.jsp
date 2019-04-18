<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div id="main-content">
		<h1>Write a Review!</h1>
		
		<c:url var="formMethod" value="/newReview" />
		<form method = "POST" action = "${formMethod}">
			<div>
				<label for="username">Username</label>
				<input type="text" name="username" id="username" placeholder="Username"/>
			</div>
			<div>
			<!--  could have used a <select here instead of repeating name="rating" -->
				<label for="rating">Rating</label>
				<input type="radio" name="rating" value="1"> 1 
				<input type="radio" name="rating" value="2"> 2 
				<input type="radio" name="rating" value="3"> 3 
				<input type="radio" name="rating" value="4"> 4 
				<input type="radio" name="rating" value="5" checked> 5 <br>
			</div>
			<div>
				<label for="title">Title</label>
				<input type="text" name="title" placeholder="Title"/>
			</div>
			<div>
				<label for="review">Review</label>
			
				<textarea name="message" rows="5" cols="50"></textarea>
			</div>
			<div>
			<input class="formSubmitButton" type="submit" value="Submit" />
			</div>
		</form>
</div>		
		
	</body>
</html>
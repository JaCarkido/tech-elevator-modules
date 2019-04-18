<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<c:import url="common/header.jsp" />


<%@include file="/WEB-INF/jsp/common/header.jspf"%>
<!-- Form goes here -->
<c:url value="filmListResult" var="filmList"/>
<form method="GET" action="${formMethod}">
	<div>
		<input type="text" name="minLength" id="minLength" placeholder="Min Length" />
		<input type="text" name="maxLength" id="maxLength" placeholder="Max Length" />
		<select name="genre" id="genre">
			<option value="Adventure">Adventure</option>
			
		</select>
		<input class="formSubmitButton" type="submit" value="Search" />
	</div>
</form>


</table>
<%@include file="common/footer.jspf"%>

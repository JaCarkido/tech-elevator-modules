<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>
<c:url value="login" var="login" />
<form:form action="${login}" method="POST" modelAttribute="Login">

        <div>
            <label for="email">Email</label>
			<form:input  path="email" class="form-control"/>            
        	<form:errors path="email" cssClass="error"/>
        </div>
        <div>
            <label for="password">Password</label>
			<form:input  path="password" class="form-control" />            
        	<form:errors path="password" cssClass="error"/>
        </div>
         <div>
            <input type="submit" value="Login"/>
        </div>
</form:form>


<%@include file="common/footer.jspf" %>

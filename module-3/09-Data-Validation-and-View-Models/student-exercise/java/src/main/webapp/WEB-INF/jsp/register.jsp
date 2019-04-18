<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Registrations"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>

<c:url value="register" var="register" />
<form:form action="${register}" method="POST" modelAttribute="Registration">
		<!-- form:errors path="*" cssClass="error"/ -->
       
         <div>
            <label for="firstName">First Name</label>
            <form:input  path="firstName" class="form-control"/>
            <form:errors path="firstName" cssClass="error"/>   
        </div>
         <div>
            <label for="lastName">Last Name</label>
            <form:input  path="lastName" class="form-control" />
            <form:errors path="lastName" cssClass="error"/>   
        </div>
        <div>
            <label for="email">Email</label>
			<form:input  path="email" class="form-control" />            
        	<form:errors path="email" cssClass="error"/>
        	<form:errors path="emailMatching" cssClass="error"/>
        </div>

        <div>
            <label for="verifyEmail">Verify Email</label>
            <form:input  path="verifyEmail" class="form-control" />
            <form:errors path="verifyEmail" cssClass="error"/>
        </div>
   	    <div>
            <label for="password">Password</label>
			<form:input  path="password" class="form-control"/>            
        	<form:errors path="password" cssClass="error"/>
        	<form:errors path="passwordMatching" cssClass="error"/>
        </div>

        <div>
            <label for="verifyPassword">Verify Password</label>
            <form:input  path="verifyPassword" class="form-control" />
            <form:errors path="verifyPassword" cssClass="error"/>
        </div>


        <div>
            <label for="birthday">BirthDay (mm//dd/yyyy)</label>
            <form:input  path="birthday" class="form-control" />
            <form:errors path="birthday" cssClass="error"/>            
        </div>
        
      
        
        <div>
            <label for="numberOfTickets">Number of Tickets</label>
            <form:input  path="numberOfTickets" class="form-control" />
            <form:errors path="numberOfTickets" cssClass="error"/>    
        </div>
        
        <div>
            <input type="submit" value="Register"/>
        </div>
</form:form>

<%@include file="common/footer.jspf" %>

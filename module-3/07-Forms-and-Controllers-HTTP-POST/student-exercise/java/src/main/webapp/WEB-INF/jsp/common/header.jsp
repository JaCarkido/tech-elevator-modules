<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Squirrel Cigar Parties For Dummies</title>
    <c:url value="/css/dummies.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
    <header>
    		<c:url value="greeting" var="greeting" />
    		<c:url value="/img/forDummies.png" var="logoSrc" />
        <a href="${greeting}">
        		<img src="${logoSrc}" alt="Squirrel Cigar Parties for Dummies Cover" />
        </a>
        <h1>Squirrel Cigar Parties</h1>
		<p> Bad Squirrel Cigar Parties happen all the time.  Don't have one more bad one!  Did you know squirrels are much happier when there are more cigars than squirrels?  But becareufl you don't have too many! </p>
    </header>
    <nav>
        <h2>Explore the Dummy Guide</h2>
        <p> Use these state of the art web applications to leave us a comment and see what other people are talking about! </p>
        <ul>
        
        	<c:url var="newReview" value="newReview" />
            <li><a href="${newReview}">Write a Review</a></li>
            
            <c:url var="reviews" value="reviews" />
            <li><a href="${reviews}">Read All Reviews</a></li>       
        </ul>
    </nav>
<!-- <%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>     -->
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
        	<c:url var="productTiles" value="productTiles" />
            <li><a href="${productTiles}">Tile Layout</a></li>
            <li><a href="productList">List Layout</a></li>
            <li><a href="productTable">Table Layout</a></li>
        </ul>
        
    </nav>
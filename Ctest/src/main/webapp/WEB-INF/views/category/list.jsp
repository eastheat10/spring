<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${R}common.css" />
</head>
<body>
	<div class="container">
		<c:forEach var="category" items="${ categorys }">
			<h3>${ category.id }- ${ category.title }</h3>

			<table class="list">
				<thead>
					<tr>
						<th>id</th>
						<th>제품명</th>
						<th>카테고리</th>
						<th>가격</th>
						<th>수량</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="product" items="${ categorys.products }">
						<tr>
							<td>${ product.id }</td>
							<td>${ product.name }</td>
							<td>${ product.category.title }</td>
							<td>${ product.price }</td>
							<td>${ product.quantity }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:forEach>
	</div>
</body>
</html>

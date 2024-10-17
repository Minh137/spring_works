<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>도서 상세 정보 - 도서 관리 시스템</title>
</head>
<body>

<h2>도서 상세 정보</h2>

<ul>
    <li><strong>제목:</strong> ${book.title}</li>
    <li><strong>저자:</strong> ${book.author}</li>
    <li><strong>ISBN:</strong> ${book.isbn}</li>
    <li><strong>출판 연도:</strong> ${book.publishedYear}</li>
</ul>

<form action="delete" method="post" style="display:inline;">
    <input type="hidden" name="id" value="${book.id}"/>
    <input type="submit" value="삭제"/>
</form>

<a href="/books/edit?id=${book.id}">수정</a> |
<a href="/books">도서 목록으로 돌아가기</a>

</body>
</html>
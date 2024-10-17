<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>도서 수정</h2>
<form action="update" method="post">
    <input type="hidden" name="id" value="${book.id}"/>
    <label>제목: <input type="text" name="title" value="${book.title}" required/></label><br/><br/>
    <label>저자: <input type="text" name="author" value="${book.author}" required/></label><br/><br/>
    <label>ISBN: <input type="text" name="isbn" value="${book.isbn}" required/></label><br/><br/>
    <label>출판 연도: <input type="number" name="publishedYear" value="${book.publishedYear}" required/></label><br/><br/>
    <input type="submit" value="수정"/>
</form>

<a href="/books">도서 목록으로 돌아가기</a>

</body>
</html>
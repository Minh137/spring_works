<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>새 도서 추가 - 도서 관리 시스템</title>
</head>
<body>

<h2>새 도서 추가</h2>
<form action="add" method="post">
    <label>제목: <input type="text" name="title" required/></label><br/><br/>
    <label>저자: <input type="text" name="author" required/></label><br/><br/>
    <label>ISBN: <input type="text" name="isbn" required/></label><br/><br/>
    <label>출판 연도: <input type="number" name="publishedYear" required/></label><br/><br/>
    <input type="submit" value="추가"/>
</form>

<a href="books">도서 목록으로 돌아가기</a>

</body>
</html>
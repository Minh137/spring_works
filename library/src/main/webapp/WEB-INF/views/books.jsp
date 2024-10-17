<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="UTF-8">
    <title>도서 관리 시스템</title>
</head>
<body>

<h2>도서 목록</h2>
<table border="1">
    <thead>
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>저자</th>
        <th>ISBN</th>
        <th>출판 연도</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${bookList}">
        <tr>
            <td><a href="view?id=${book.id }">${book.id}</a></td>
            <td><a href="view?id=${book.id }">${book.title}</a></td>
            <td>${book.author}</td>
            <td>${book.isbn}</td>
            <td>${book.publishedYear}</td>
            
            <td><a href="edit?id=${book.id }">수정</a> /
               <a href="javascript:void(0)" onClick="del(${book.id});">삭제</a>
           </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="write">추가하기</a>
</body>
</html>
<script>
  function del(n) {
	 let r = confirm("정말로 삭제하시겠습니까?");
	 if(r){
		 location.href="del?id="+n;
	 }
  }
</script>

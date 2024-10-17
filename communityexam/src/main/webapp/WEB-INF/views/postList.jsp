<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Post List</title>
</head>
<body>
<h2>게시판</h2>
<a href="${pageContext.request.contextPath}/posts/new">작성하기</a>
<table border="1">
    <tr>
        <th>아이디</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성 날짜</th>
        <th>edit</th>
    </tr>
    <c:forEach var="post" items="${posts}">
        <tr>
            <td>${post.id}</td>
            <td>${post.title}</td>
            <td>${post.author}</td>
            <td>${post.createdAt}</td>
            <td>
                <a href="${pageContext.request.contextPath}/posts/${post.id}/edit">수정</a> |
                <form action="${pageContext.request.contextPath}/posts/${post.id}/delete" method="post" style="display:inline;">
                    <button type="submit" onclick="return confirm('Are you sure you want to delete this post?');">삭제</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<div class="pagination">
    <c:if test="${currentPage > 1}">
        <a href="${pageContext.request.contextPath}/posts?page=${currentPage - 1}">Previous</a>
    </c:if>

    <c:forEach begin="1" end="${totalPages}" var="i">
        <a href="${pageContext.request.contextPath}/posts?page=${i}" 
           style="${i == currentPage ? 'font-weight: bold;' : ''}">
            ${i}
        </a>
    </c:forEach>

    <c:if test="${currentPage < totalPages}">
        <a href="${pageContext.request.contextPath}/posts?page=${currentPage + 1}">Next</a>
    </c:if>
</div>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Edit Post</title>
</head>
<body>
<h2>${post.id == null ? "Create New Post" : "Edit Post"}</h2>
<form:form modelAttribute="post" action="${pageContext.request.contextPath}/posts${post.id != null ? '/' + post.id : ''}" method="post">
    <div>
        <label>제목:</label>
        <form:input path="title" />
    </div>
    <div>
        <label>내용:</label>
        <form:textarea path="content" />
    </div>
    <div>
        <label>글쓴이:</label>
        <form:input path="author" />
    </div>
    <button type="submit">전송</button>
</form:form>
<a href="${pageContext.request.contextPath}/posts">취소</a>
</body>
</html>
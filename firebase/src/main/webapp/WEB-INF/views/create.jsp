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
  <h2>글쓰기 폼</h2>
  <form method="post">
     <label>아이디</label><input type="text" name="id" ><br><br>
     <label>이름</label><input type="text" name="name" ><br><br>
     <label>제목</label><input type="text" name="title" ><br><br>
     <label>내용</label><textarea name="content" cols="60" rows="10"></textarea><br><br>
     <button type="submit"> 글 쓰 기 </button>
  </form>
</body>
</html>
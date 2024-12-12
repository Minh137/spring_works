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
  <table border=1>
     <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>제목</th>
        <th>내용</th>
     </tr>
     <c:forEach var="user" items="${users }">
        <tr>
           <td>${user.id }</td>
           <td>${user.name }</td>
           <td><a href="./view/${user.id}">${user.title }</a></td>
           <td>${user.content }</td>
        </tr>
     </c:forEach>
  </table>
</body>
</html>
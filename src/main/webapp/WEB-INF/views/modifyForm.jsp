<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>전화번호 수정</title>
</head>
<body>
    <h1>전화번호 수정</h1>
    <form action="${pageContext.request.contextPath}/pbc" method="post">
        <input type="hidden" name="action" value="modify">
        <input type="hidden" name="no" value="${pVO.personId}">

        <label>이름</label>
        <input type="text" name="name" value="${pVO.name}">
        <br>

        <label>핸드폰</label>
        <input type="text" name="hp" value="${pVO.hp}">
        <br>

        <label>회사</label>
        <input type="text" name="company" value="${pVO.company}">
        <br>

        <button type="submit">수정</button>
    </form>
</body>
</html>
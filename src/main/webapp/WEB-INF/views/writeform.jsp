<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>전화번호 등록</title>
</head>
<body>
    <h1>전화번호 등록</h1>
    <form action="${pageContext.request.contextPath}/pbc" method="post">
        <input type="hidden" name="action" value="insert">

        <label>이름</label>
        <input type="text" name="name">
        <br>

        <label>핸드폰</label>
        <input type="text" name="hp">
        <br>

        <label>회사</label>
        <input type="text" name="company">
        <br>

        <button type="submit">등록</button>
    </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head><meta charset="UTF-8"><title>주소록</title></head>
<body>
    <h1>주소록</h1>
    <h2>전화번호 리스트</h2>
    <p>전화번호 리스트 입니다</p>

    <c:forEach var="personVO" items="${personList}">
        <table border="1">
            <tr><td>이름(name)</td><td>${personVO.name}</td></tr>
            <tr><td>핸드폰(hp)</td><td>${personVO.hp}</td></tr>
            <tr><td>회사(company)</td><td>${personVO.company}</td></tr>
        </table>
        <br>
    </c:forEach>
</body>
</html>
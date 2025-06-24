<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>전화번호 목록</title>
</head>
<body>
    <h1> 전화번호부</h1>

    <c:forEach var="personVO" items="${pList}">
        <table border="1" width="400">
            <tr><td>이름</td><td>${personVO.name}</td></tr>
            <tr><td>핸드폰</td><td>${personVO.hp}</td></tr>
            <tr><td>회사</td><td>${personVO.company}</td></tr>
            <tr>
                <td colspan="2" align="center">
                    <a href="${pageContext.request.contextPath}/phonebook4/updateForm?no=${personVO.personId}">수정</a> |
                    <a href="${pageContext.request.contextPath}/phonebook4/deleteForm?no=${personVO.personId}">삭제</a>
                </td>
            </tr>
        </table>
        <br>
    </c:forEach>

    <br>
    <a href="${pageContext.request.contextPath}/phonebook4/wform"> 등록</a>
</body>
</html>
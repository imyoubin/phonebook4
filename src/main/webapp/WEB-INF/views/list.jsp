<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>주소록</title>
</head>
<body>

    <h1>주소록</h1>
    <h2>전화번호 리스트</h2>
    
    <p>전화번호 리스트입니다.</p>

    <c:forEach items="${pList}" var="personVO">
        <table border="1" width="400">
            <tr>
                <td>이름</td>
                <td>${personVO.name}</td>
            </tr>
            <tr>
                <td>핸드폰</td>
                <td>${personVO.hp}</td>
            </tr>
            <tr>
                <td>회사</td>
                <td>${personVO.company}</td>
            </tr>
            
            <td colspan="4">
						<button type="submit">등록</button>
					</td>
        </table>
        <br>
    </c:forEach>

    <br>
    <a href="${pageContext.request.contextPath}/pbc?action=wform">등록폼 이동</a>

</body>
</html>             
                
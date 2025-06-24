<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>전화번호 수정</title>
</head>
<body>
    <h1>전화번호 수정</h1>

    <form action="${pageContext.request.contextPath}/phonebook4/update" method="post">
        <input type="hidden" name="personId" value="${pVO.personId}">
        이름: <input type="text" name="name" value="${pVO.name}" required><br><br>
        핸드폰: <input type="text" name="hp" value="${pVO.hp}" required><br><br>
        회사: <input type="text" name="company" value="${pVO.company}" required><br><br>
        <button type="submit">수정</button>
    </form>

    <br>
    <a href="${pageContext.request.contextPath}/phonebook4/list">목록으로</a>
</body>
</html>

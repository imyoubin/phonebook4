<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>전화번호 등록</title>
</head>
<body>
    <h1>전화번호 등록</h1>

    <form action="${pageContext.request.contextPath}/phonebook4/insert" method="post">
        이름: <input type="text" name="name" required><br><br>
        핸드폰: <input type="text" name="hp" required><br><br>
        회사: <input type="text" name="company" required><br><br>
        <button type="submit">등록</button>
    </form>

    <br>
    <a href="${pageContext.request.contextPath}/phonebook4/list">목록으로</a>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>삭제 확인</title>
</head>
<body>
    <h1>삭제 확인</h1>
    <p>정말 삭제하시겠습니까?</p>

    <form action="${pageContext.request.contextPath}/phonebook4/delete" method="get">
        <input type="hidden" name="no" value="${no}">
        <button type="submit">삭제</button>
    </form>

    <br>
    <a href="${pageContext.request.contextPath}/phonebook4/list">취소</a>
</body>
</html>
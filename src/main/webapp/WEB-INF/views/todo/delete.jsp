<%--
  Created by IntelliJ IDEA.
  User: dlstj
  Date: 2022-10-12
  Time: 오전 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="post" action="/todo/remove">
    <input type="text" name="tno" placeholder="tno">
    <button>Delete_tno</button>
  </form>

  ${select}

  <h1>DELETE</h1>
</body>
</html>

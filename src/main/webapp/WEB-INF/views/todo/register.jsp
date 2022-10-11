<%--
  Created by IntelliJ IDEA.
  User: dlstj
  Date: 2022-10-11
  Time: 오후 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

  <form method="post" action="/todo/register">
    <input type="text" name="title" value="Sample Title"></input>
    <input type="text" name="writer" value="user00"></input>
    <input type="date" name="dueDate">
    <button>submit</button>
  </form>
</head>
<body>
  <h1>register</h1>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: keda
  Date: 2019/11/1
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>转发与重定向-获取数据</title>
</head>
<body>
    <!-- 取出数据 -->
    <%
        String username = (String)request.getAttribute("username");
        out.print(username);
    %>
</body>
</html>

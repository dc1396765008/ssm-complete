<%--
  Created by IntelliJ IDEA.
  User: 13967
  Date: 2020/11/24
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="http://localhost:8080/upload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file" width="120px">
    <input type="submit" value="上传">
</form>
<hr>
<form action="http://localhost:8080/down" method="get">
    <input type="submit" value="下载">
</form>
</body>
</html>

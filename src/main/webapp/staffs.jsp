<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 17/11/3
  Time: 上午9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" align="center">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>部门</th>
        <th>职位</th>
    </tr>
    <s:iterator value="staffs" var="staff">
        <tr>
            <td align="center">${staff.id}</td>
            <td align="center">${staff.name}</td>
            <td align="center">${staff.age}</td>
            <td align="center">${staff.gender}</td>
            <td align="center">${staff.dept.name}</td>
            <td align="center">${staff.post.name}</td>
        </tr>

    </s:iterator>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 74168
  Date: 2023/11/7
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 设置不要忽略EL表达式 --%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>品牌列表</title>
</head>
<body>
<input type="button" value="添加" onclick="location.href='addBrand.jsp'" />
<table border="1" cellspacing="0" >
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${bdList}" var="brand">
        <tr>
            <td>${brand.id}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <td>${brand.status == 1 ? '启用' : '禁用'}</td>
            <td><a href="<%=request.getContextPath()%>/selectById?brdId=${brand.id}">修改</a> <a href="<%=request.getContextPath()%>/delete?id=${brand.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
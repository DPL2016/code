<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="page-header">
        <h3>图书列表</h3>
    </div>
    <c:if test="${not empty message}">
        <div class="alert alert-success">${message}</div>
    </c:if>

    <div class="well well-sm">
        <form method="get" class="form-inline">
            <div class="form-group">
                <input type="text" placeholder="书籍名称" name="q_like_bookname" value="${bookname}" class="form-control">
            </div>
            <div class="form-group">
                <input type="text" placeholder="最低价格" name="q_ge_bookprice" class="form-control"> - <input type="text" placeholder="最高价格" name="q_le_bookprice" class="form-control">
            </div>

            <button class="btn btn-default">搜索</button>
        </form>
    </div>
    <a href="/book/new" class="btn btn-success">添加书籍</a>
    <table class="table">
        <thead>
        <tr>
            <th>名称</th>
            <th>作者</th>
            <th>价格</th>
            <th>数量</th>
            <th>出版社</th>
            <th>分类</th>
            <th>#</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${Page.items}" var="book">
            <tr>
                <td>${book.bookname}</td>
                <td>${book.bookauthor}</td>
                <td>${book.bookprice}</td>
                <td>${book.booknum}</td>
                <td>${book.publisher.pubname}</td>
                <td>${book.bookType.booktype}</td>
                <td>
                    <a href="/book/${book.id}/edit">修改</a>
                    <a href="/book/${book.id}/del" rel="${book.id}" class="deLink">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <ul class="pagination pull-right" id="page"></ul>
</div>
<script src="/static/js/jquery-2.2.3.min.js"></script>
<script src="/static/js/jquery.twbsPagination.min.js"></script>
<script>
    $(function () {

        $("#page").twbsPagination({
            totalPages:${Page.totalSize},
            visiblePages: 5,
            first: '首页',
            prev: '上一页',
            next: '下一页',
            last: '末页',
            href: '?p={{number}}'
        });

    });
</script>
</body>
</html>

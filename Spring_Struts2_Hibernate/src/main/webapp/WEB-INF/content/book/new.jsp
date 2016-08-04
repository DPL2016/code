<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/ropo/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="page-header">
        <h3>添加新图书</h3>
    </div>
    <div class="row">
        <div class="col-md-4" style="margin-left: 200px">
            <form action="" method="post">
                <div class="form-group">
                    <label>名称</label>
                    <input type="text" name="bookname" class="form-control">
                </div>
                <div class="form-group">
                    <label>作者</label>
                    <input type="text" name="bookauthor" class="form-control">
                </div>
                <div class="form-group">
                    <label>价格</label>
                    <input type="text" name="bookprice" class="form-control">
                </div>
                <div class="form-group">
                    <label>数量</label>
                    <input type="text" name="booknum" class="form-control">
                </div>
                <div class="form-group">
                    <label>出版社</label>
                    <select name="publisher.id" class="form-control">
                        <c:forEach items="${publisherList}" var="pub">
                            <option value="${pub.id}">${pub.pubname}</option>
                        </c:forEach>
                    </select>

                </div>
                <div class="form-group">
                    <label>分类</label>
                    <select name="bookType.id" class="form-control">
                        <c:forEach items="${bookTypeList}" var="type">
                            <option value="${type.id}">${type.booktype}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <button class="btn bg-primary">保存</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

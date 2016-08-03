<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/file/upload.do" method="post" enctype="multipart/form-data"><input type="text" name="name">
    <input type="file" name="photo">
    <input type="file" name="photo">
    <input type="file" name="photo">
    <button>Upload</button>
    <p>
        <a href="/file/download.do">点此下载文件</a>
    </p>
</form>
</body>
</html>

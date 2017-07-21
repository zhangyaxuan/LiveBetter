<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 21/07/2017
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h1>Welcome to Live Better</h1>
    <form id="user-registration-form" method="post">
        <label>手机号</label>
        <input type="tel" name="mobile" id="mobile" placeholder="请输入13位手机号" />
        <label>密码</label>
        <input type="password" name="password" id="password" placeholder="请输入6~20位数字或字母作为密码">
        <button id="sign-up-btn" class="" onclick="javascript:;">注册</button>
    </form>

</body>
</html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Login Page</title>
    <link href="/resources/core/css/login.css" rel="stylesheet">
</head>
<body>

<form:form method="POST" action="login" modelAttribute="user">
    <fieldset class="account-info">
        <label>Login
            <input type="text" path="login"/>
        </label>
        <label>Password
            <input type="password" path="password"/>
        </label>
    </fieldset>

    <fieldset class="account-action">
        <input class="btn-left"  type="submit" name="login" value="Login">
        <input class="btn-right" type="submit" name="register" value="Register">
    </fieldset>
</form:form>

</body>
</html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Registration Page</title>
    <link href="/resources/core/css/login.css" rel="stylesheet">
</head>
<body>

<form method="POST" action="registration" modelAttribute="user">
    <fieldset class="account-info">
        <label>Login
            <input type="text" path="login"/>
        </label>
        <label>Password
            <input type="password" path="password"/>
        </label>
        <label>Re-type password
            <input type="password" path="rePassword"/>
        </label>
    </fieldset>
    <fieldset class="account-action">
        <input class="btn-left" type="submit" name="registration" value="Register">
    </fieldset>

</form>
</body>
</html>

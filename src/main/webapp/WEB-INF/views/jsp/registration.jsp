<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Registration Page</title>
    <link href="/resources/core/css/login.css" rel="stylesheet">
    <script type="text/javascript" src="/resources/core/js/verification.js"></script>
</head>
<body>

<form method="POST" action="registration" modelAttribute="user" onsubmit="return checkPassword(this);">
    <fieldset class="account-info">
        <label>Registration
            <input type="text" path="login"/>
        </label>
        <label>Password
            <input type="password" name="pass" path="password"/>
        </label>
        <label>Re-type password
            <input type="password" name="pass2" path="rePassword"/>
        </label>
    </fieldset>
    <fieldset class="account-action">
        <input class="btn-left" type="submit" name="registration" value="Register">
    </fieldset>

</form>
</body>
</html>

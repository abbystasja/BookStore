<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head><title>Spring Sample - Login Page</title></head>
<body>
    <h3>Login Page</h3>
    <form:form method="POST" action="login" modelAttribute="user">
        <table>
            <tr>
                <td><form:label path="login">Name</form:label></td>
                <td><form:input path="login" /></td>
            </tr>
            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:input path="password" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>
    <h2>Dear Employee please enter your details</h2>
    <br>
    <br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>
    Department: <form:input path="department"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    
</head>
<body>
    <h2>Dear employee you are welcome</h2>
    <br>
    <br>
    <br>
    Your name: ${employee.name}
    <br>
    Your surname: ${employee.surname}
    <br>
    Your salary: ${employee.salary}
    <br>
    Your department: ${employee.department}
    <br>
    Your car: ${employee.carBrand}
    <br>
    Language(s):
    <ul> <%--unordered list--%>

        <c:forEach var="lang" items="${employee.languages}">

            <li>  ${lang}  </li>        <%--list item--%>

        </c:forEach>
    </ul>
    Phone number: ${employee.phoneNumber}
</body>
</html>
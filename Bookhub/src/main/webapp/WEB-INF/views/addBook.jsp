<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>Add New Book</title></head>
<body>
<h2>Add New Book</h2>
<form:form method="post" modelAttribute="book" action="add">
    <table>
        <tr>
            <td>Title:</td>
            <td><form:input path="title" /></td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><form:input path="author" /></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Book"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>

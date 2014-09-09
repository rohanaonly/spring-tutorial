<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Movies by ${by}</h1>

<c:forEach items="${movies}" var="movie">
    ${movie.name}
    <br />
</c:forEach>

</body>
</html>
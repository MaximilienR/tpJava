<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 08/12/2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Afficher liste des patient</title>
</head>
<body>
<h2>Liste de nos patient </h2>
  <div>
    <c:forEach items="${patients}" var ="partient">
      <div>
        ${partient.getId}
      </div>
    </c:forEach>
  </div>
</body>
</html>

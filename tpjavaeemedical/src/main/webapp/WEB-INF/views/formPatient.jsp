<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 08/12/2022
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un patient</title>
</head>
<body>
  <form action="formPatient.jsp" method="post" enctype="multipart/form-data">
    <div>
      <input type="text" name="name" placeholder="veuillez saisir votre nom">
      <input type="text"name="prenom"  placeholder="veuillez saisir votre prenom">
      <input type="text"name="nss" placeholder="veuillez saisir votre numero de sécurité social">
      <input type="date"name="dateNaissance" placeholder="veuillez saisir votre date de naissance">
      <input type="sexe"name="sexe" placeholder="veuillez indique si tu vous etes une homme ou une femme ">
      <input type="text" name="addresse" placeholder="veuillez saisir votre addresse">
      <input type="submit"/>

    </div>
    </div>
  </form>

</body>
</html>

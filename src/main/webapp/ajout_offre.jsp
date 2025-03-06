<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="OffreServlet" method="post">
    <label>Titre:</label>
    <input type="text" name="titre" required>

    <label>Description:</label>
    <textarea name="description" required></textarea>

    <label>Category:</label>
    <input type="text" name="category" required>

   

    <button type="submit">Créer Offre</button>
</form>

</body>
</html>
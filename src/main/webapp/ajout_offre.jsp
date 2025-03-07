<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.tailwindcss.com"></script>
 <style>
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            max-width: 500px;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
        }
        .btn-custom {
            background-color: #007bff;
            color: white;
            transition: 0.3s;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<!-- Navbar -->
    <nav class="bg-white shadow-md p-4">
        <div class="container mx-auto flex justify-between items-center">
            <a href="#" class="text-2xl font-bold text-blue-600">TalentSphere</a>
            <div class="space-x-4">
                <a href="#" class="text-blue-600 hover:text-blue-800">Sign In</a>
                <a href="displayOffreEmploi" class="bg-blue-600 text-white px-4 py-2 rounded-lg hover:bg-blue-700">Log Out</a>
            </div>
        </div>
    </nav>

   <div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="form-container">
        <h2 class="text-center mb-4">Créer une Offre</h2>
        <form action="OffreServlet" method="post">
            <div class="mb-3">
                <label class="form-label">Titre</label>
                <input type="text" name="titre" class="form-control" placeholder="Entrez le titre" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Description</label>
                <textarea name="description" class="form-control" rows="3" placeholder="Décrivez l'offre" required></textarea>
            </div>

            <div class="mb-3">
                <label class="form-label">Catégorie</label>
                <input type="text" name="category" class="form-control" placeholder="Ex: Informatique" required>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-custom">Créer Offre</button>
            </div>
        </form>
    </div>
</body>
</html>
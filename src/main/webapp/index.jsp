
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - MediCare</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
    
    <!-- Navbar -->
    <nav class="bg-white shadow-md p-4">
        <div class="container mx-auto flex justify-between items-center">
            <a href="#" class="text-2xl font-bold text-blue-600">TalentSphere</a>
            <div class="hidden md:flex space-x-4">
                <a href="login.jsp" class="text-blue-600 hover:text-blue-800">Sign In</a>
                <a href="DisplayCandidatureByCompanyName" class="bg-blue-600 text-white px-4 py-2 rounded-lg hover:bg-blue-700">Sign Up</a>
            </div>
            <button class="md:hidden text-blue-600 focus:outline-none" id="menu-toggle">
                ☰
            </button>
        </div>
        <div class="hidden md:hidden flex-col items-center space-y-2 mt-2" id="mobile-menu">
            <a href="login.jsp" class="text-blue-600">Sign In</a>
            <a href="DisplayCandidatureByCompanyName" class="bg-blue-600 text-white px-4 py-2 rounded-lg">Sign Up</a>
        </div>
    </nav>
    
    <!-- Search Bar -->
    <div class="flex flex-col items-center justify-center h-[60vh] text-center">
        <h1 class="text-3xl font-bold mb-4">Trouvez votre emploi</h1>
        <div class="flex space-x-2 w-full max-w-lg">
            <input type="text" placeholder="Rechercher un emploi..." class="w-full p-3 border rounded-lg shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-600">
            <button class="bg-blue-600 text-white px-4 py-3 rounded-lg hover:bg-blue-700">Rechercher</button>
        </div>
    </div>
    
    <!-- Footer -->
    <footer class="bg-white text-center py-4 shadow-md">
        <p class="text-gray-600">&copy; 2025 MediCare. Tous droits reserves.</p>
    </footer>
    
    <script>
        document.getElementById('menu-toggle').addEventListener('click', function() {
            document.getElementById('mobile-menu').classList.toggle('hidden');
        });
    </script>
</body>
</html>

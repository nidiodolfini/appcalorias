<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Lipidio</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" href="/">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="/carboidrato/lista">Carboidrato</a></li>
            <li class="nav-item"><a class="nav-link" href="/lipidio/lista">Lipidio</a></li>
            <li class="nav-item"><a class="nav-link" href="/proteina/lista">Proteina</a></li>
            <li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a></li>
            <li class="nav-item"><a class="nav-link" href="/refeicao/lista">Refeição</a></li>
        </ul>
    </div>
</nav>
<div class="container mt-3">
    <h2>AppCalorias</h2>
    <p>Projeto de Gestão de Alimentação Saudavel</p>
    <h3>Classe: Lipidio</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>nome</th>
            <th>calorias</th>
            <th>grama</th>
            <th>proteina</th>
            <th>carboidrato</th>
            <th>gordura</th>
            <th>gorduraBoa</th>
            <th>acidosGraxos</th>
            <th>tipoGordura</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="lip" items="${listagem}">
        <tr>
            <td>${lip.id}</td>
            <td>${lip.nome}</td>
            <td>${lip.calorias}</td>
            <td>${lip.grama}</td>
            <td>${lip.proteina}</td>
            <td>${lip.carboidrato}</td>
            <td>${lip.gordura}</td>
            <td>${lip.gorduraBoa}</td>
            <td>${lip.acidosGraxos}</td>
            <td>${lip.tipoGordura}</td>
            <td><a href="/lipidio/${lip.id}/excluir">Excluir</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>
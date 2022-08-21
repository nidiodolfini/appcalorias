<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Refeição</title>
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
    <h3>Classe: Refeição</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>descricao</th>
            <th>calorias</th>
            <th>horario</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="ref" items="${listagem}">
            <tr>
                <td>${ref.id}</td>
                <td>${ref.descricao}</td>
                <td>${ref.calorias}</td>
                <td>${ref.horario}</td>
                <td><a href="/refeicao/${ref.id}/excluir">Excluir</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>

</div>
</body>
</html>
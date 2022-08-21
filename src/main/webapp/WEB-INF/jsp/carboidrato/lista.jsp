<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Carboidrato</title>
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
    <h3>Classe: Carboidrato</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>nome</th>
            <th>calorias</th>
            <th>grama</th>
            <th>proteina</th>
            <th>carboidrato</th>
            <th>gordura</th>
            <th>complexo</th>
            <th>indiceGlicemico</th>
            <th>fibra</th>
            <th> </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="carb" items="${listagem}">
        <tr>
            <td>${carb.id}</td>
            <td>${carb.nome}</td>
            <td>${carb.calorias}</td>
            <td>${carb.grama}</td>
            <td>${carb.proteina}</td>
            <td>${carb.carboidrato}</td>
            <td>${carb.gordura}</td>
            <td>${carb.complexo}</td>
            <td>${carb.indiceGlicemico}</td>
            <td>${carb.fibra}</td>
            <td><a href="/carboidrato/${carb.id}/excluir">Excluir</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>
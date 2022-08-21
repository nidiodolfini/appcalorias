<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Cliente</title>
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
    <h3>Classe: Cliente</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>nome</th>
            <th>peso</th>
            <th>altura</th>
            <th>consumoBasal</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="clie" items="${listagem}">
        <tr>
            <td>${clie.id}</td>
            <td>${clie.nome}</td>
            <td>${clie.peso}</td>
            <td>${clie.altura}</td>
            <td>${clie.consumoBasal}</td>
            <td><a href="/cliente/${clie.id}/excluir">Excluir</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>
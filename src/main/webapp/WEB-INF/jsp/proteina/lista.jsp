<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Proteina</title>
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
    <h3>Classe: Proteina</h3>
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
            <th>vegetal</th>
            <th>valorBiologico</th>
            <th>incompleta</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="prot" items="${listagem}">
        <tr>
            <td>${prot.id}</td>
            <td>${prot.nome}</td>
            <td>${prot.calorias}</td>
            <td>${prot.grama}</td>
            <td>${prot.proteina}</td>
            <td>${prot.carboidrato}</td>
            <td>${prot.gordura}</td>
            <td>${prot.vegetal}</td>
            <td>${prot.valorBiologico}</td>
            <td>${prot.incompleta}</td>
            <td><a href="/proteina/${prot.id}/excluir">Excluir</a></td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
</body>
</html>
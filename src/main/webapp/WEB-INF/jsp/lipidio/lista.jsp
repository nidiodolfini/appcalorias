<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        <tr>
            <td>Abacate</td>
            <td>84</td>
            <td>90</td>
            <td>6</td>
            <td>8</td>
            <td>2</td>
            <td>true</td>
            <td>10</td>
            <td>Poli</td>
        </tr>
        <tr>
            <td>Ovo</td>
            <td>108</td>
            <td>13</td>
            <td>6</td>
            <td>8</td>
            <td>2</td>
            <td>true</td>
            <td>10</td>
            <td>Mono</td>
        </tr>
        <tr>
            <td>Manteiga</td>
            <td>206</td>
            <td>13</td>
            <td>6</td>
            <td>8</td>
            <td>29</td>
            <td>true</td>
            <td>18</td>
            <td>Saturada</td>
        </tr>
        </tbody>
    </table>

</div>
</body>
</html>
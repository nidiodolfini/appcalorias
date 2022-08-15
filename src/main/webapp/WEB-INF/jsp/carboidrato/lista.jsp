<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
            <th>nome</th>
            <th>calorias</th>
            <th>grama</th>
            <th>proteina</th>
            <th>carboidrato</th>
            <th>gordura</th>
            <th>complexo</th>
            <th>indiceGlicemico</th>
            <th>fibra</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Banana</td>
            <td>84</td>
            <td>90</td>
            <td>6</td>
            <td>8</td>
            <td>2</td>
            <td>true</td>
            <td>10</td>
            <td>38</td>
        </tr>
        <tr>
            <td>Morango</td>
            <td>25</td>
            <td>300</td>
            <td>0</td>
            <td>23</td>
            <td>0</td>
            <td>true</td>
            <td>5</td>
            <td>42</td>
        </tr>
        <tr>
            <td>Pão francês</td>
            <td>125</td>
            <td>50</td>
            <td>0</td>
            <td>38</td>
            <td>38</td>
            <td>false</td>
            <td>98</td>
            <td>8</td>
        </tr>
        </tbody>
    </table>

</div>
</body>
</html>
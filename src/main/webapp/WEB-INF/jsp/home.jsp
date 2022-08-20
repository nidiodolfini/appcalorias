<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>Calorias</title>
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
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do cliente</td>
        </tr>
        <tr>
            <td>peso</td>
            <td>float</td>
            <td>Peso do cliente</td>
        </tr>
        <tr>
            <td>altura</td>
            <td>float</td>
            <td>Altura do cliente</td>
        </tr>
        <tr>
            <td>consumoBasal</td>
            <td>float</td>
            <td>Consumo Basal do cliente</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Alimento</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>nome</td>
            <td>String</td>
            <td>Nome do Alimento</td>
        </tr>
        <tr>
            <td>calorias</td>
            <td>float</td>
            <td>Calorias do alimento</td>
        </tr>
        <tr>
            <td>grama</td>
            <td>float</td>
            <td>Peso do alimento em gramas</td>
        </tr>
        <tr>
            <td>proteina</td>
            <td>float</td>
            <td>Proteina do alimento</td>
        </tr>
        <tr>
            <td>carboidrato</td>
            <td>float</td>
            <td>Carboidrato do alimento</td>
        </tr>
        <tr>
            <td>gordura</td>
            <td>float</td>
            <td>Gordura do alimento</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Carboidrato</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>complexo</td>
            <td>boolean</td>
            <td>Verifica se o carboidrato é complexo</td>
        </tr>
        <tr>
            <td>indiceGlicemico</td>
            <td>int</td>
            <td>Valor de carga glicemica do alimento</td>
        </tr>
        <tr>
            <td>fibra</td>
            <td>float</td>
            <td>volume de fibras do alimento/td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Lipidio</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>gorduraBoa</td>
            <td>boolean</td>
            <td>Verifica se a gordura é boa</td>
        </tr>
        <tr>
            <td>acidosGraxos</td>
            <td>float</td>
            <td>valor de acidos graxos do alimento</td>
        </tr>
        <tr>
            <td>tipoGordura</td>
            <td>String</td>
            <td>Tipo de Gordura do alimento</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Proteina</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>vegetal</td>
            <td>boolean</td>
            <td>Verifica se a proteina é vegetal</td>
        </tr>
        <tr>
            <td>valorBiologico</td>
            <td>float</td>
            <td>Valor biologico da proteina</td>
        </tr>
        <tr>
            <td>incompletas</td>
            <td>boolean</td>
            <td>Verifica se a proteina é incompleta</td>
        </tr>
        </tbody>
    </table>

    <h3>Classe: Refeicao</h3>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Atributo</th>
            <th>Tipo</th>
            <th>Descrição</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>horario</td>
            <td>LocalDateTime</td>
            <td>Horario que a refeição foi ingerida</td>
        </tr>
        <tr>
            <td>descricao</td>
            <td>String</td>
            <td>Descrição da refeição</td>
        </tr>
        <tr>
            <td>calorias</td>
            <td>float</td>
            <td>Total de calorias da refeição</td>
        </tr>
        </tbody>
    </table>

</div>
</body>
</html>
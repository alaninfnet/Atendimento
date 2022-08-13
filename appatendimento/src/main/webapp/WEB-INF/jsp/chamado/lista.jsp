<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppPedido</title>
</head>
<body>

	<nav class="navbar navbar-expand-sm bg-light">
	
	  <div class="container-fluid">
	    <!-- Links -->
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link" href="/">Home</a>
	      </li>	    
	      <li class="nav-item">
	        <a class="nav-link" href="/chamado/lista">Chamado</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/clientes/lista">Clientes</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/comercial/lista">Comercial</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/programador/lista">Programador</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/suporte/lista">Suporte</a>
	      </li>      	      	      
	    </ul>
	  </div>
	  
	</nav>

	<div class="container mt-3">
	  <h2>Atendimento</h2>
	  <p>Projeto de Gestão de Atendimentos</p>
	  
	  <h3>Classe: Chamado</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Código</th>
	        <th>DataIni</th>
	        <th>DataFim</th>
	        <th>Problema</th>
	        <th>Solução</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>1</td>
	        <td>13/08/2022</td>
	        <td>13/08/2022</td>
	        <td>PROBLEMA NA NOTA FISCAL</td>
	        <td>A RECEITA ESTAVA FORA</td>
	      </tr>	      
	      <tr>
	        <td>2</td>
	        <td>13/08/2022</td>
	        <td>13/08/2022</td>
	        <td>ESTOQUE DANDO DIFERENÇA NO INVENTARIO</td>
	        <td>NFE LANÇADA ERRADA</td>
	      </tr>	
	      <tr>
	        <td>3</td>
	        <td>13/08/2022</td>
	        <td>13/08/2022</td>
	        <td>CONTAS RECEBER DIFERENTE DO EXTRATO</td>
	        <td>LANÇAMENTO ERRADO NO CONTAS RECEBER</td>
	      </tr>		      	      
	    </tbody>
	  </table>
	  
	</div>	
</body>
</html>
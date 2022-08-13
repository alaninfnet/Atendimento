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
	  
	  <h3>Classe: Clientes</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>CPF</th>
	        <th>Idade</th>
	        <th>Nome</th>
	        <th>Residencial</th>
	        <th>Sexo</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>1234567890</td>
	        <td>50</td>
	        <td>LUIZINHO</td>
	        <td>SAO VICENTE DE MINAS</td>
	        <td>M</td>
	      </tr>	      
	      <tr>
	        <td>514264738</td>
	        <td>27</td>
	        <td>CAMILA</td>
	        <td>LAVRAS</td>
	        <td>F</td>
	      </tr>	
	      <tr>
	        <td>647382736</td>
	        <td>35</td>
	        <td>ERICK</td>
	        <td>PASSOS</td>
	        <td>M</td>
	      </tr>		      	      
	    </tbody>
	  </table>
	  
	</div>	
</body>
</html>
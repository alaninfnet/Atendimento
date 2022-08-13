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
	  
	  <h3>Classe: Programador</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>CPF</th>
	        <th>Idade</th>
	        <th>Nome</th>
	        <th>Residencial</th>
	        <th>Sexo</th>
	        <th>Bebe Café</th>
	        <th>Linguagem</th>
	        <th>Sabe OO</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>1234567890</td>
	        <td>23</td>
	        <td>ALAN</td>
	        <td>BOA ESPERANCA</td>
	        <td>M</td>
	        <td>S</td>
	        <td>JAVA</td>
	        <td>S</td>
	      </tr>	      
	      <tr>
	        <td>5365265236</td>
	        <td>23</td>
	        <td>GABRIEL</td>
	        <td>BOA ESPERANCA</td>
	        <td>M</td>
	        <td>S</td>
	        <td>DELPHI</td>
	        <td>N</td>
	      </tr>	
	      <tr>
	        <td>74832536372</td>
	        <td>23</td>
	        <td>SANDRA</td>
	        <td>BOA ESPERANCA</td>
	        <td>F</td>
	        <td>S</td>
	        <td>COBOL</td>
	        <td>N</td>
	      </tr>		      	      
	    </tbody>
	  </table>
	  
	</div>	
</body>
</html>
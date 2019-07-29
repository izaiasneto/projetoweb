<!DOCTYPE html>
<%@page import="br.com.izl.model.Usuario"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciamento de Usuarios</title>
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="css/petshop.css">


</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Gerenciamento de Usuarios</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Início</a></li>
					<li><a href="#">Opções</a></li>
					<li><a href="#">Perfil</a></li>
					<li><a href="#">Ajuda</a></li>
				</ul>
			</div>
		</div>
	</nav>


				<a onClick="clique()" class="btn btn-primary">Cadastrar Usuário!</a>
				<a onClick="clique()" class="btn btn-primary">Todos Usuários</a>

		<!-- /#top -->
	

	<script src="lib/bootstrap/jquery/jquery.min.js"></script>
	<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
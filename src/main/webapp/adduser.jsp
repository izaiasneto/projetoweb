<!DOCTYPE html>
<%@page import="br.com.izl.model.Usuario"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Gerenciamento de Usuários</title>
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.quicksearch/2.3.1/jquery.quicksearch.js"></script>

<script>
	function confirma(pi) {

		if (window.confirm("Tem certeza que quer excluir?")) {
			location.href = "usuario?i=" + pi;
		}

	}
</script>


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
				<a class="navbar-brand" href="#">Gerenciamento de Usuários </a>
			</div>
		</div>
	</nav>
	<div>
		<div class="col-md-2">
			<div class="tamanho">
				<div id="main">


					<h4 class="page-header">Adicionar Cadastro</h4>
				</div>

				<form method="post" action="usuario">


					<div class="row">

						<label for="campo1">Nome</label> <input type="text" width="1"
							class="form-control" name="nome" id="nome">

					</div>
					<div class="row">

						<label for="campo2">Login</label> <input type="text"
							class="form-control" name="login" id="login">

					</div>
					<div class="row">

						<label for="campo2">Senha</label> <input type="password"
							class="form-control" name="senha" id="senha">

					</div>
					<div class="row">

						<label for="campo3">Status</label> <br> <input type="radio"
							name="status" value="ativo"> Ativo<br> <input
							type="radio" name="status" value="inativo">Inativo <br>

					</div>
					<hr />
					<div id="actions" class="row">

						<button type="submit" class="btn btn-primary">Salvar</button>
						<a href="usuario" class="btn btn-default">Cancelar</a>

					</div>
			</div>


			</form>
		</div>
	</div>
	<div class="col-md-10">
		<div>
			<div id="main" class="container-fluid">

				<div id="top" class="row">

					<h2>Todos usuários</h2>
					<div class="form-group input-group">
						 <span class="input-group-addon"><i
							class="glyphicon glyphicon-search"></i></span>  <input name="consulta"
							id="txt_consulta" placeholder="Consultar" type="text"
							class="form-control"> 
					</div>


				</div>
				<!-- /#top -->

				<hr />
				<div id="list" class="row">


					<table  class="table table-striped" cellspacing="0" cellpadding="0">
					
						<thead>
							<tr>
								<th>Status</th>
								<th>Nome</th>
								<th>Login</th>
								<th class="actions">Ações</th>
							</tr>
						</thead>
						<tbody>

							<tr>



								<%
									List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
									int i = 0;

									for (Usuario c : usuarios) {
								%>
								<td>
									<%
										out.print(c.getStatus());
									%>
								</td>
								<td>
									<%
										out.print(c.getNome());
									%>
								</td>
								<td>
									<%
										out.print(c.getLogin());
									%>
								</td>
								<td class="actions">
									<%
										//out.print(" <a href='usuario?i=" + i +"'> Excluir </a>");
											out.println("<a class='btn btn-danger' href='javascript:confirma(" + i + ")'> Excluir</a>");
									%>

								</td>



							</tr>

							<%
								i++;
								}
							%>

							</tr>



						</tbody>
					</table>


				</div>
				<!-- /#list -->

				<div id="bottom" class="row"></div>
				<!-- /#bottom -->
			</div>
			<!-- /#main -->

		</div>

		<script src="lib/bootstrap/jquery/jquery.min.js"></script>
		<script src="lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
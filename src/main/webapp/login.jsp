<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="lib/jquery/jquery.min.css">
<link rel="stylesheet" href="css/style.css">

<style type="text/css">
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>
</head>
<body>
<div class="login-form">
    <form action="login" method="post">
        <h2 class="text-center">Log in</h2>       
        <div class="form-group">
            <input type="text" class="form-control" name = "username" placeholder="Username" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name = "password" placeholder="Password" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Entrar!</button>
        </div>
        <div class="clearfix">
            <a href="#" class="text-center">Esqueci minha senha</a>
        </div>        
    </form>
    <p class="text-center"><a href="#">Criar uma conta</a></p>
</div>
</body>
</html>
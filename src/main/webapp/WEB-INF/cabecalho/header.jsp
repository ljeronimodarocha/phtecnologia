<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="description" content="Abertura de Chamados -- PH Tecnologia">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>PH Tecnologia</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/estilo.css"/>" />
<script src="../script/jquery.js"></script>



</head>

<body>
	<header class="cabecalho">
		<!-- <img class="logo" alt="[logo]" src="img/logo.png" title="Ph - Informatica"/> -->
		<ul class="menu" id="fixMenu">
			<li><a href="<c:url value='/' />" title="Inicio">Home</a></li>
			<li><a href="<c:url value='/formulario' />"
				title="Clique para gerar um novo chamado">Abertura de Chamado</a></li>
			<li><a href="<c:url value='/chamado/formularioBusca'/>" title="Status de chamados gerados no sistema">Acompanhamento
					do Chamado</a></li>
			<li><a href='<c:url value='/login/formulario' />'
				title="Login no sistema">Login</a></li>
		</ul>
	</header>
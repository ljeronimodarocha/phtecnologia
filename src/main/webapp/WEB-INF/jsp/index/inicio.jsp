<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Abertura de Chamados -- PH Tecnologia">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<title>PH Tecnologia</title>
	<link rel="stylesheet" type="text/css" href="css/estilo.css">
	<script src="script/jquery.js"></script>



</head>
	
<body>
	<header class="cabecalho">
		<!-- <img class="logo" alt="[logo]" src="img/logo.png" title="Ph - Informatica"/> -->
		<ul class="menu" id="fixMenu">
			<li><a href="<c:url value='/' />" title="Inicio">Home</a></li>
			<li><a href="<c:url value='/formulario' />"  title="Clique para gerar um novo chamado">Abertura de Chamado</a></li>
			<li><a href="#"  title="Status de chamados gerados no sistema">Acompanhamento do Chamado</a></li>
			<li><a href='<c:url value='/login/formulario' />'  title="Login no sistema">Login</a></li>
		</ul>
	</header>
	<div class="content">
	 	<div class="box">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
	 	tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
	 	quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
	 	consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
	 	cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
	 	proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
		</div>
	</div>
	<footer class="rodape">
		<img class="img-footer" alt="[PH - Soluções em Informatica]" title="PH - Soluções em Informatica" src="img/rodape.jpg"/>
	</footer>
</body>
<script>
	var offset = $('#fixMenu').offset().top;
	var $fixMenu = $('#fixMenu');
	$(document).on('scroll', function () {
		if (offset <= $(window).scrollTop()) {
			$fixMenu.addClass('fixar');
		} else {
			$fixMenu.removeClass('fixar');
		}
	})
</script>
</html>




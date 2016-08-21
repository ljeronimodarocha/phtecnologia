<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="description" content="Abertura de Chamados -- PH Tecnologia">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>PH Tecnologia</title>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>

<body>
	<header class="cabecalho">
		<ul class="menu">
			<li><a href="<c:url value='/'/>"> Home </a></li>
			<li><a href="<c:url value='/formulario'/>"> Abertura de Chamado
			</a></li>
			<li><a href="<c:url value='/chamado/formulario'/>"> Acompanhamento do
					chamado </a></li>
			<li><a href="<c:url value='/login/formulario' />"> Login </a></li>
		</ul>
	</header>
	<div class="content">
	<div class="box">
		<form action="<c:url value='/chamado/cadastra'/>" method="post">
			<label for="nome">Nome: <input class="form-control" id="nome" type="text" name="chamado.nome" value="${chamado.nome}" /></label><br> 
			<label for="setor">Setor: <input class="form-control" id="setor" type="text" name="chamado.setor" value="${chamado.setor}"/></label><br> 
			<label for="tipo">Tipo do Chamado: <input class="form-control" id="tipo" type="text" name="chamado.tipo" value="${chamado.tipo}"/></label><br> 
			<label for="problema">Relatar Problema: <input class="form-control" id="problema" type="text" name="chamado.problema" value="${chamado.problema}"/></label><br> 
			<label for="necessidade">Necessidade: <select class="form-control" id="necessidade" class="necessidade"
				name="chamado.necessidade" size="1">
				<option value="baixa">Baixa</option>
				<option value="media">M�dia</option>
				<option value="alta">Alta</option>
			</select></label><br>
			<input type="submit" class="btn btn-primary" name="cadastra" value="Efetuar Cadastro">
		</form>
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




<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
<div class="content">
	<div class="box">
		<h2>Seja bem vindo ${usuarioLogado.user.nome}</h2>
		<br>
		<form action="<c:url value='/chamado/cadastra'/>" method="post">
			<label for="nome">Nome: <input class="form-control" id="nome"
				type="text" name="chamado.nome" value="${chamado.nome}" /></label><br>
			<label for="setor">Setor: <input class="form-control"
				id="setor" type="text" name="chamado.setor" value="${chamado.setor}" /></label><br>
			<label for="tipo">Tipo do Chamado: <input
				class="form-control" id="tipo" type="text" name="chamado.tipo"
				value="${chamado.tipo}" /></label><br> <label for="problema">Relatar
				Problema: <input class="form-control" id="problema" type="text"
				name="chamado.problema" value="${chamado.problema}" />
			</label><br> <label for="necessidade">Necessidade: <select
				class="form-control" id="necessidade" class="necessidade"
				name="chamado.necessidade" size="1">
					<option value="baixa">Baixa</option>
					<option value="media">Média</option>
					<option value="alta">Alta</option>
			</select></label><br> <input type="submit" class="btn btn-primary"
				name="cadastra" value="Efetuar Cadastro">
		</form>
			<div class="erro">
				<c:if test="${not empty errors}">
					<c:forEach var="error" items="${errors}">
                    	${error.category} - ${error.message}<br>
					</c:forEach>
				</c:if>
			</div>
		</div>
</div>

<c:import url="/WEB-INF/cabecalho/footer.jsp" />
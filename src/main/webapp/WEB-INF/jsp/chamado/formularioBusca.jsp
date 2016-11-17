<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
<div class="content">
	<div class="box">
		<div class="erro">
			<c:if test="${not empty errors}">
				<c:forEach var="error" items="${errors}">
                    	${error.category} - ${error.message}<br>
				</c:forEach>
			</c:if>
		</div>
		<form action="<c:url value='/chamado/busca'/>" method="post">
			Número do Chamado: <input id="id" type="text" name="chamado.id"
				value="${chamado.id}" /> <input type="submit" name="Buscar"
				value="Efetuar Busca">
		</form>
		<table>
			<tr>
				<th>Nome</th>

				<th>Setor</th>

				<th>Tipo</th>

				<th>Problema</th>

				<th>Necessidade</th>

				<th>Estado do chamado</th>

				<th>Observação</th>

				<th>Encerrar chamado</th>
			</tr>
			<c:forEach items="${chamadoLista}" var="chamado">
				<c:if test="${not empty chamado}">
					<tr>
						<td>${chamado.nome}</td>
						<td>${chamado.setor}</td>
						<td>${chamado.tipo}</td>
						<td>${chamado.problema}</td>
						<td>${chamado.necessidade}</td>
						<td>${chamado.estado}</td>
						<td><c:if test="${chamado.estado != 'Fechado'}">
								<form action='<c:url value="/observacao/formularioObs"/>' method="post">
									<button type="submit" value="${chamado.id}" name="observacao.chamado.id">Observação</button>
								</form>
							</c:if><c:if test="${chamado.estado == 'Fechado'}">
									<form action='<c:url value="/observacao/visualiza"/>' method="post">
											<button type="submit" value="${chamado.id}" name="observacao.chamado.id">Visualizar</button>
									</form>
							</c:if></td>
						<td><c:if test="${chamado.estado != 'Fechado'}">
								<form action='<c:url value="/chamado/encerra"/>' method="post">
									<button type="submit" value="${chamado.id}" name="chamado.id">Fechar
										o Chamado</button>
								</form>
							</c:if></td>
					</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
</div>
<c:import url="/WEB-INF/cabecalho/footer.jsp" />
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
		<form <c:if test="${empty chamado.id}">${chamado.id = 9999} action="<c:url value='/chamado/busca'/>"</c:if> method="post">
			Número do Chamado: <input id="id" type="text" name="chamado.id"
				value="${chamado.id}" /> 
				<input type="submit" name="Buscar"
				value="Efetuar Busca">
		</form>
		<table>
			<tr>Nome ------ |
			</tr>
			<tr>------ Setor ------ |
			</tr>
			<tr>------ Tipo ------ |
			</tr>
			<tr>------ Problema ------ |
			</tr>
			<tr>------ Necessidade ------ |
			</tr>
			<c:forEach items="${chamadoLista}" var="chamado">
				<c:if test="${not empty chamado}">
					<tr>
						<td>${chamado.nome}|</td>
						<td>${chamado.setor}|</td>
						<td>${chamado.tipo}|</td>
						<td>${chamado.problema}|</td>
						<td>${chamado.necessidade}|</td>
					</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
</div>

<c:import url="/WEB-INF/cabecalho/footer.jsp" />
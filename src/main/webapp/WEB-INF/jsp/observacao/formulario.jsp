<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
<c:if test="${not empty obs.chamado.id}">
<form action='<c:url value="/observacao/adiciona"/>' method="post">
	<h3>Adicione uma observa��o para o chamado</h3>
	<input readonly="true" type="text" name="observacao.chamado.id" value="${obs.chamado.id}">
	<input type="text" name="observacao.observacao" /> 
	<input type="submit" value="Adicionar Observa��o"/>
</form>
<table>
<th>ID da Observa��o</th>
<th>Observa��o</th>
<th>Usu�rio</th>
<c:forEach items="${teste}" var="observacao">
<tr>
<td>${observacao.id}</td>
<td>${observacao.observacao}</td>
<td>${observacao.usuario.nome}</td>
</tr>
</c:forEach>
</table>
<c:forEach var="error" items="${errors}">
                    	${error.category} - ${error.message}<br>
					</c:forEach>
</c:if>
<c:import url="/WEB-INF/cabecalho/footer.jsp" />
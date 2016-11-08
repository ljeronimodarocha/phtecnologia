<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
<c:if test="${not empty obs.chamado.id}">
<form action='<c:url value="/observacao/adiciona"/>' method="post">
	<h3>Adicione uma observação para o chamado</h3>
	<input type="text" name="observacao.chamado.id" value="${obs.chamado.id}">
	<input type="text" name="observacao.observacao" /> 
	<input type="submit" value="Adicionar Observação"/>
</form>
</c:if>
<c:import url="/WEB-INF/cabecalho/footer.jsp" />
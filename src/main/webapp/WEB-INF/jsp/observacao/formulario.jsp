<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />

<form action='<c:url value="/observacao/adiciona"/>' method="post">
	<h3>Adicione uma observa��o para o chamado</h3>
	<input type="text" name="observacao.observacao" /> <input
		type="submit" />

</form>
<c:if test="${not empty obs.chamado.id}">
	<c:forEach var="observacao" items="${obs}">
		${obsercavao.chamado.id};
	</c:forEach>
			deu certo
</c:if>
<c:import url="/WEB-INF/cabecalho/footer.jsp" />
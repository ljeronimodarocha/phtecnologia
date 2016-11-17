<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
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
<c:import url="/WEB-INF/cabecalho/footer.jsp" />
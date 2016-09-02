<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
<div class="content">
	<div class="box">
		<form action='<c:url value='/login/autentica' />' method="post">
			Nome <input type="text" name="usuario.nome" value="${usuario.nome}" /><br>
			Senha <input type="password" name="usuario.senha"
				value="${usuario.senha}"><br> <input type="submit" value="logar"
				name="loga">
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
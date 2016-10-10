<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="/WEB-INF/cabecalho/header.jsp" />
<script>
var id = sessionStorage.getItem('id');
alert(id)
var x = document.createElement("INPUT");
    x.setAttribute("type", "text");
    x.setAttribute("disabled", "disabled")
    x.setAttribute("value", id);
    x.setAttribute("name", "chamado.id")
    document.body.appendChild(x);
</script>


<form>
<h3>Adicione uma observação para o chamado </h3>
</form>
<c:import url="/WEB-INF/cabecalho/footer.jsp" />
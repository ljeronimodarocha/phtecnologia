<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PH Tecnologia</title>
<link rel="stylesheet" type="text/css" href="css/estilo.css">
</head>
<body>

<li><a href="<c:url value='/'/>"> Home </a></li>
			<li><a href="<c:url value='/formulario'/>"> Abertura de Chamado
			</a></li>
			<li><a href="<c:url value='/chamado/formulario'/>"> Acompanhamento do
					chamado </a></li>
			<li><a href="<c:url value='/login/formulario' />"> Login </a></li>
		</ul>
		
		
		<form action='<c:url value='/login/autentica' />'method="post" >
			Nome <input type="text" name="login.nome" value="${login.nome}"/>
			Senha <input type="text" name="login.senha" value="${login.senha}">
			<input type="button" value="login">
		</form>
</body>
</html>
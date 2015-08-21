<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : produtos_lista
    Created on : 14/08/2015, 18:55:51
    Author     : alexandre.chaves
--%>

<%@page import="br.pucpr.prog4.Loja.models.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Lista de Produtos </h1>
        
        <c:forEach var="produto"
                   items="${produtos}">
            <div>
                <p> ${produto.nome} </p>
                <a href = "produto-detalhe?id =${produto.id}">
                <img src="../Imagens/${produto.nome}.jpg" 
                     alt ="/WEB-INF/jsp/detalhe.jsp" />
                </a>
                <p>R$ ${produto.preco} </p>
            </div>
        </c:forEach>    
       
      
    </body>
</html>

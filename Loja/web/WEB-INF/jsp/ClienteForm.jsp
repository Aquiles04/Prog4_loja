<%-- 
    Document   : ClienteForm
    Created on : 28/08/2015, 18:17:12
    Author     : silveiraalexand  JSP = VIEW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Meu Cadastro</h1>
        <form action="cadastro" method="POST">
            <!--ADICIONAR COM JQUERY OBRIGATORIEDADE E MASCARA PARA CPF-->
            <label for="PF">Pessoa Fisica:</label>
            <input type="radio" name="Pessoa" id="PF" value="PF">
            
            <label for="PJ">Nome:</label>
            <input type="radio" name="Pessoa" id="PJ" value="PJ">Pessoa Juridica
            
            <label for="Nome">Nome:</label> 
            <input type="text" name="Nome" id="Nome"> 
            
            <label for="CPF">CPF:</label> 
            <input type="text" name="CPF" id="CPF"> 
            
            <label for="DataNascimento">Data Nascimento:</label> 
            <input type="date" name="DataNascimento" id="DataNascimento"> 
            
            <label for="Genero">Genero</label>
            <select name="Genero" id="Genero">
                <option> Selecione </option>
                 <option> Masculino </option>
                  <option> Feminino </option>
                   <option> Genderless </option>
            </select>
            
            <label for="Cometario">Comentario</label>
            <textarea name="Comentario" id="Comentario"></textarea>
            
            <input type="Submit" value="Salvar">
        </form>
    </body>
</html>

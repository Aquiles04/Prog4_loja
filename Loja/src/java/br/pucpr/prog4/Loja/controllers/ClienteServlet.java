/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.Loja.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

/**
 *
 * @author silveiraalexand
 */
//@WebServlet(name = "ClienteServlet", urlPatterns = {"/Cliente/cadastro"})
import br.pucpr.prog4.Loja.models.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ClienteServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/ClienteForm.jsp");
        rd.forward(request,response);
    }
    
    //Usar quando clicar no botao enviar 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cliente cliente = new Cliente();
        cliente.setTipo(request.getParameter("Pessoa"));
        cliente.setNome(request.getParameter("Nome"));
        String cpfAux = request.getParameter("CPF");
        cliente.setGenero("Genero");
        cliente.setTipo("Tipo");
        
        int cpf = Integer.parseInt(cpfAux);
        cliente.setCpf(cpf);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            String dataAux = request.getParameter("DataNascimento");
            Date data;
            data = sdf.parse(request.getParameter("DataNascimento"));

        }
        catch(ParseException ex){
            //Logger.getLogger(ClienteServlet.class.getName().log())
        }
        
        
    }
}
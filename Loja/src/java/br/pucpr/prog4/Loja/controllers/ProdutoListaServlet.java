package br.pucpr.prog4.Loja.controllers;

import br.pucpr.prog4.Loja.models.IProdutoManager;
import br.pucpr.prog4.Loja.models.Produto;
import br.pucpr.prog4.Loja.models.ProdutoManager;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdutoListaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        IProdutoManager manager = new ProdutoManager();
        List<Produto> produtos;
        produtos = manager.getProdutos();
        
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produtos_lista.jsp");
        rd.forward(request, response);
    }
}
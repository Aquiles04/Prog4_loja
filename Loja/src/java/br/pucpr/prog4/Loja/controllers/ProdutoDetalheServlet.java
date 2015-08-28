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

public class ProdutoDetalheServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id;
        String idParam;
        idParam = request.getParameter("id");
        id = Integer.parseInt(idParam);
        
        IProdutoManager manager = new ProdutoManager();
        Produto produto;
        produto = manager.obterPorId(id);
        
        request.setAttribute("produtos", produto);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/jsp/produto_detalhe.jsp");

        rd.forward(request, response);
    }
}
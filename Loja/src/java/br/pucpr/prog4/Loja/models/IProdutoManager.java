package br.pucpr.prog4.Loja.models;

import java.util.List;

//Interface apenas coloca metodo os outros devem implementar

public interface IProdutoManager {
    
    List<Produto> getProdutos();
    //List <Produto> obterTodos();
    
    Produto obterPorId(int id);
    
}

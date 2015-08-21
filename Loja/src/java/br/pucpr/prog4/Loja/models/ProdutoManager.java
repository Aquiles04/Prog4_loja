/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.Loja.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexandre.chaves
 */
public class ProdutoManager implements IProdutoManager {
    
    //private Produto produto;
    private static List <Produto> produtos;
    
//    public ProdutoManager(Produto produto){
//        this.produto = produto;
//    }
    
    public ProdutoManager(){
        
        this.produtos = new ArrayList <> ();
        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("ffagito");
        p1.setPreco(50.0);
        //p1.setPreco(new BigDecimal(500.0f));
        Produto p2 = new Produto(2,"iambread", 52.90);
        
        Produto p3 = new Produto (3, "capsule_616x353", 50.00);
        
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        
    }
            
    public List <Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List produtos) {
        this.produtos = produtos;
    }
    
    @Override
     public Produto obterPorId(int id){
       for(Produto produto : produtos){
           if(produto.getId() == id)
               return produto;
       }
       return null;
       
   }
    
    
}

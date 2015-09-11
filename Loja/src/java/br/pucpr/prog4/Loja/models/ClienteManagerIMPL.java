/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.Loja.models;

import br.pucpr.prog4.Loja.dao.IDaoManager;
import br.pucpr.prog4.Loja.dao.JdbcDaoManager;



public class ClienteManagerIMPL implements ClienteManager {

    Cliente cliente;
    

    @Override
    public Cliente cadastrar() {
        
        IDaoManager manager;
        manager = new JdbcDaoManager();
        //validar campos
        try{
            manager.iniciar();
            ClienteDAO dao = manager.getClienteDAO();
            Cliente c;
            c = dao.Inserir(cliente);
            manager.confirmarTransação();
            manager.encerrar();
            return c;
        } catch (Exception ex){
            manager.abortarTransação();
            throw ex;
        
        }
    }
}

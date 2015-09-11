package br.pucpr.prog4.Loja.dao;

import br.pucpr.prog4.Loja.models.ClienteDAO;

public interface IDaoManager 
{
    void iniciar();
    void encerrar();
    void confirmarTransação();
    void abortarTransação();
    //IClienteDao getClienteDao();
    
    ClienteDAO getClienteDAO();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pucpr.prog4.Loja.models;

import br.pucpr.prog4.Loja.dao.DaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class JdbcClienteDao implements ClienteDAO {
    
    private Connection conexão;
    
    public JdbcClienteDao (Connection conexão){
        this.conexão = conexão;
    }
    
    @Override
    public Cliente Inserir(Cliente cliente){
        String sql;
        sql = "INSERT INTO Cliente("
                + "nomeCliente,"
                + "dataNascimento,"
                + "tipoCliente,"
                + "sexo)"
                + " VALUES(?, ? , ? , ?)";
        
        PreparedStatement ps;
        try{
            ps = conexão.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setDate(2, (java.sql.Date)new java.util.Date(cliente.getDate().getTime()));
            //ps.setDate(2, cliente.getDate());
            ps.setString(3, cliente.getTipo());
            ps.setString(4, cliente.getGenero());
            
            ps.executeUpdate();
            return cliente;
        }catch(Exception ex){
            throw new DaoException("Erro ao inserir cliente no banco de dados");
            
        }
    }
    
    
    
    
}

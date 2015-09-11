package br.pucpr.prog4.Loja.dao;

import br.pucpr.prog4.Loja.models.ClienteDAO;
import br.pucpr.prog4.Loja.models.JdbcClienteDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDaoManager implements IDaoManager {
    
    Connection conexão;
    private JdbcClienteDao clienteDAO;
    
    
    
    
    public JdbcDaoManager()
    {
    }
    
    
    @Override
    public void iniciar() throws DaoException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url;
            url = "jdbc:mysql://localhost:3306/prog4dao";
            conexão = DriverManager.getConnection(url, "root", "root");
            
            conexão.setAutoCommit(false);
            
            clienteDAO = new JdbcClienteDao(conexão);

        }
        catch( Exception ex )
        {
            throw new DaoException("Ocorreu um erro ao conectar ao banco de dados:" + 
                    ex.getMessage());
        }
    }

    @Override
    public void encerrar() 
    {
        try {
            if(!conexão.isClosed())
                conexão.close();
        } catch (SQLException ex) {
            
        }
    }

    @Override
    public void confirmarTransação() {
        try{
            conexão.commit();
        } catch(SQLException ex){
        throw new UnsupportedOperationException("Not supported yet." + ex.getMessage()); //To change body of generated methods, choose Tools | Templates.
        }
    }
        
    @Override
    public void abortarTransação() {
        try{
            conexão.rollback();
        }catch(SQLException ex){
        throw new DaoException("Not supported yet." + ex.getMessage() + ex.getMessage()); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public ClienteDAO getClienteDAO() {
       return clienteDAO;
    }
   
  
}

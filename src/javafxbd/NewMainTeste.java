/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import DAO.PessoaDaoJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;

/**
 *
 * @author lukas
 */
public class NewMainTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Connection con = conexao.portaConexao.getConnection();

      /*  PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = con.prepareStatement("SELECT * From Pessoa");
            rs = st.executeQuery();
            while(rs.next()){
                System.out.println(rs);
            
            }
        } 
        
        catch (SQLException ex) {
            
        }
        */
      
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lucas");
        pessoa.setEmail("Lukas-001");
        pessoa.setSenha("112233");
        PessoaDaoJDBC pessoaDaoJdbc = new PessoaDaoJDBC();
        pessoaDaoJdbc.adicionar(pessoa);
       
        
        
    }

}

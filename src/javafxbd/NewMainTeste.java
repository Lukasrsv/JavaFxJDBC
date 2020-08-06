/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import DAO.EmpresaDaoJDBC;
import DAO.PessoaDaoJDBC;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Application.launch;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.Empresa;
import model.Pessoa;

/**
 *
 * @author lukas
 */
public class NewMainTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
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
      
       /*
        Pessoa pessoa = new Pessoa();
        pessoa.setId("02433631092");
        pessoa.setNome("Lukas");
        pessoa.setEmail("Lukas_001pf@hotmail.com");
        pessoa.setSenha("112233");
        PessoaDaoJDBC pessoaDaoJdbc = new PessoaDaoJDBC();
        pessoaDaoJdbc.adicionar(pessoa);
      
      
        // pessoaDaoJdbc.Atualizar(pessoa);
      //  pessoaDaoJdbc.Delete(pessoa);
      
       */
      
       PessoaDaoJDBC pessoaDaoJdbc1 = new PessoaDaoJDBC();
       List <Pessoa> lista = new ArrayList();
       lista = pessoaDaoJdbc1.Buscar();
       System.out.println(lista.toString());
      
       
       
        /*
       int teste = 0;
        EmpresaDaoJDBC busca = new EmpresaDaoJDBC();
        List<Empresa> lista = new ArrayList<>();
        lista = busca.Buscar();
        Empresa empresa = new Empresa();
        empresa.setCnpj("2");
        empresa.setEmail("empresa@");
        empresa.setNome("Stericycle");
        empresa.setSenha("112233");
        
        for (Empresa a : lista) {
            
           if (a.getCnpj().equals(empresa.getCnpj()) ) {
                System.out.println("usuário já existe");
                teste++;
               
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setTitle("Alerta");
                alert.setContentText("Usuário já existe");
                alert.show();
                
             }
           
             if(teste == 0){
               EmpresaDaoJDBC p = new EmpresaDaoJDBC();
               p.adicionar(empresa);
               CadastrarEmpresa.getCadastrarEmpresa().close();
             }
             
        }
            */
        
            
        
        
        
    }
}
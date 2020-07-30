/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import model.Pessoa;

/**
 *
 * @author lukas
 */
public class PessoaDaoJDBC {

    Connection con;
    

    public PessoaDaoJDBC() {
        this.con = conexao.portaConexao.getConnection();

    }

    public void adicionar(Pessoa pessoa) {
        PreparedStatement st;
        
        try {
            st = con.prepareStatement("INSERT INTO pessoa( nome,email,senha)VALUES(?,?,?)");
            st.setString(1, pessoa.getNome());
            st.setString(2, pessoa.getEmail());
            st.setString(3, pessoa.getSenha());
            st.execute();
            System.out.println("Adicionado!");
        } catch (SQLException e) {
            e.getMessage();
           // Alert alert = new Alert (Alert.AlertType.ERROR);
          //  alert.setContentText("Erro na instrução, pessoa não adicionada!");
           // alert.setTitle("ERRO");
        }
    }

}

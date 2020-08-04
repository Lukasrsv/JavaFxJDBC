/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.portaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        PreparedStatement st = null;

        try {
            st = con.prepareStatement("INSERT INTO pessoa(id,nome,email,senha)VALUES(?,?,?,?)");
            st.setString(1, pessoa.getId());
            st.setString(2, pessoa.getNome());
            st.setString(3, pessoa.getEmail());
            st.setString(4, pessoa.getSenha());
            st.execute();
            System.out.println("Adicionado!");
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            // Alert alert = new Alert (Alert.AlertType.ERROR);
            //  alert.setContentText("Erro na instrução, pessoa não adicionada!");
            // alert.setTitle("ERRO");
        } finally {
            try {
                portaConexao.closeConnection(con, st);

            } catch (SQLException ex) {

            }

        }
    }

    public void Atualizar(Pessoa pessoa) {
        PreparedStatement st = null;

        try {
            st = con.prepareStatement("UPDATE pessoa SET nome=? WHERE id=?");
            st.setString(1, pessoa.getNome());
            st.setString(2, pessoa.getId());
            st.execute();
            System.out.println("Atualizado!");
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("CPF não encontrado");
            // Alert alert = new Alert (Alert.AlertType.ERROR);
            //  alert.setContentText("Erro na instrução, pessoa não adicionada!");
            // alert.setTitle("ERRO");
        } finally {
            try {
                portaConexao.closeConnection(con, st);
            } catch (SQLException ex) {

            }
        }
    }

    public void Delete(Pessoa pessoa) {
        PreparedStatement st = null;

        try {
            st = con.prepareStatement("DELETE  FROM pessoa WHERE id= ?");
            st.setString(1, pessoa.getId());
            st.execute();
            System.out.println("Deletado!");
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("CPF não encontrado");
            // Alert alert = new Alert (Alert.AlertType.ERROR);
            //  alert.setContentText("Erro na instrução, pessoa não adicionada!");
            // alert.setTitle("ERRO");
        } finally {
            try {
                portaConexao.closeConnection(con, st);
            } catch (SQLException ex) {

            }

        }
    }

    public List<Pessoa> Buscar() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List <Pessoa> lista = new ArrayList<>();
        
        try {
            st = con.prepareStatement("SELECT * FROM pessoa ");
            rs = st.executeQuery();
            while(rs.next()){
            
            Pessoa pessoa1 = new Pessoa();
            pessoa1.setId(rs.getString("id"));
            pessoa1.setNome(rs.getString("nome"));
            pessoa1.setEmail(rs.getString("email"));
            pessoa1.setSenha(rs.getString("senha"));
            lista.add(pessoa1);
            }
            return lista;
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("Não encontrado");
            // Alert alert = new Alert (Alert.AlertType.ERROR);
            //  alert.setContentText("Erro na instrução, pessoa não adicionada!");
            // alert.setTitle("ERRO");
        } finally {
            try {
                portaConexao.closeConnection(con, st);
            } catch (SQLException ex) {

            }

        }
        return null;

    }
}

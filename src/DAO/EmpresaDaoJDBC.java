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
import model.Empresa;


/**
 *
 * @author lukas
 */
public class EmpresaDaoJDBC {

    Connection con;

    public EmpresaDaoJDBC() {
        this.con = conexao.portaConexao.getConnection();

    }

    public void adicionar(Empresa empresa) {
        PreparedStatement st = null;

        try {
            st = con.prepareStatement("INSERT INTO empresa (id,nome,email,senha)VALUES(?,?,?,?)");
            st.setString(1, empresa.getCnpj());
            st.setString(2, empresa.getNome());
            st.setString(3, empresa.getEmail());
            st.setString(4, empresa.getSenha());
            st.execute();
            System.out.println("Adicionado!");
            
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("Não adicionado tente novamente");
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

    public void Atualizar(Empresa empresa) {
        PreparedStatement st = null;

        try {
            st = con.prepareStatement("UPDATE empresa SET nome=? WHERE id=?");
            st.setString(1, empresa.getNome());
            st.setString(2, empresa.getCnpj());
            st.execute();
            System.out.println("Atualizado!");
        } catch (SQLException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("CNPJ não encontrado");
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

    public void Delete(Empresa empresa) {
        PreparedStatement st = null;

        try {
            st = con.prepareStatement("DELETE  FROM empresa WHERE id= ?");
            st.setString(1, empresa.getCnpj());
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

    public List<Empresa> Buscar() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List <Empresa> lista = new ArrayList<>();
        
        try {
            st = con.prepareStatement("SELECT * FROM empresa ");
            rs = st.executeQuery();
            while(rs.next()){
            
            Empresa pessoa1 = new Empresa();
            pessoa1.setCnpj(rs.getString("id"));
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

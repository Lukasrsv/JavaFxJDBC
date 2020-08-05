/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.EmpresaDaoJDBC;
import conexao.portaConexao;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafxbd.CadastrarEmpresa;

import model.Empresa;
import util.Alerts;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class CadastrarEmpresaController implements Initializable {

    @FXML
    private TextField txNome;

    @FXML
    private TextField txCnpj;

    @FXML
    private TextField txEmail;

    @FXML
    private PasswordField txSenha;

    @FXML
    private Button btCadastrar;

    @FXML
    private Button btCancelar;

    public void btCancelarAction(ActionEvent event) {

        CadastrarEmpresa.getCadastrarEmpresa().close();

    }

    @FXML
    public void btCadastrarEmpresaAction(ActionEvent event) {
        try {
            int teste = 0;
            EmpresaDaoJDBC busca = new EmpresaDaoJDBC();
            List<Empresa> lista = new ArrayList<>();
            lista = busca.Buscar();
            Empresa empresa = new Empresa();

            empresa.setCnpj(txCnpj.getText());
            empresa.setEmail(txEmail.getText());
            empresa.setNome(txNome.getText());
            empresa.setSenha(txSenha.getText());
            for (Empresa a : lista) {

                if (a.getCnpj().equals(empresa.getCnpj())) {
                    Alerts.showAlerts("ERRO", null,"Usuário já existe", Alert.AlertType.ERROR);
                    teste++;
                    break;
                }
            }

            if (teste == 0) {
                EmpresaDaoJDBC p = new EmpresaDaoJDBC();
                p.adicionar(empresa);
                CadastrarEmpresa.fecharTelaCadastrarEmpresa();
            }
            
            
        } catch (RuntimeException ex) {
            Alerts.showAlerts("ERRO", null,"Erro Tente Novamente", Alert.AlertType.ERROR);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DAO.EmpresaDaoJDBC;
import DAO.PessoaDaoJDBC;
import java.net.URL;
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
import javafxbd.CadastrarPessoa;
import model.Empresa;
import model.Pessoa;
import util.Alerts;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class CadastrarPessoaController implements Initializable {
     @FXML
    private TextField txNome;

    @FXML
    private TextField txCpf;

    @FXML
    private TextField txEmail;

    @FXML
    private PasswordField txSenha;

    @FXML
    private Button btCadastrar;

    @FXML
    private Button btCancelar;

    
     @FXML
    public void btCadastrarPessoaAction(ActionEvent event) {
        try {
            int teste = 0;
            PessoaDaoJDBC busca = new PessoaDaoJDBC();
            List<Pessoa> lista = new ArrayList<>();
            lista = busca.Buscar();
            Pessoa pessoa = new Pessoa();

            pessoa.setId(txCpf.getText());
            pessoa.setEmail(txEmail.getText());
            pessoa.setNome(txNome.getText());
            pessoa.setSenha(txSenha.getText());
            for (Pessoa a : lista) {

                if (a.getId().equals(pessoa.getId())) {
                    Alerts.showAlerts("ERRO", null,"Usuário já existe", Alert.AlertType.ERROR);
                    teste++;
                    break;
                }
            }

            if (teste == 0) {
                PessoaDaoJDBC p = new PessoaDaoJDBC();
                p.adicionar(pessoa);
                CadastrarPessoa.fecharTelaCadastrarPessoa();
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

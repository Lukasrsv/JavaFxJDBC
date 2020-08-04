/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class CadastrarEmpresaController implements Initializable {

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
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

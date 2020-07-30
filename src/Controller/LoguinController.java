/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author lukas
 */
public class LoguinController implements Initializable{

    @FXML
    private TextField txEmail;

    @FXML
    private PasswordField txSenha;

    @FXML
    private Button btEntrar;

    @FXML
    private Button btSair;

    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btEntrar.setOnMouseClicked((MouseEvent e) -> {
            
        
        });
       
        
        btSair.setOnMouseClicked((MouseEvent e) -> {
            
        
        });
        
    

    }
}

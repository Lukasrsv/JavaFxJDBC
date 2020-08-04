/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.PessoaDaoJDBC;
import java.io.IOException;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafxbd.Loguin;
import javafxbd.Principal;
import model.Pessoa;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class LoguinController implements Initializable {

    @FXML
    private TextField txEmail;

    @FXML
    private PasswordField txSenha;

    @FXML
    private Button btEntrar;

    @FXML
    private Button btSair;

    /*
    @FXML
    public void btSairAction(MouseEvent event,KeyEvent event1) {
        
        if(event1.getCode() == KeyCode.ENTER){
            Loguin.getLoguin().close();
            
        }else {
            if(event.isConsumed()){
            Loguin.getLoguin().close();
            
            }
            
        }
        
    }
     */
    @FXML
    public void btSairAction(ActionEvent event) {

        Loguin.getLoguin().close();

    }

    @FXML
    public void btEntrarAction(ActionEvent event) {
        PessoaDaoJDBC p = new PessoaDaoJDBC();
        List<Pessoa> lista = p.Buscar();
        for (Pessoa a : lista) {
            
           if(a.getEmail().equals(txEmail.getText()) && a.getSenha().equals(txSenha.getText())){
               System.out.println(a);
               Principal principal = new Principal();
               try {
                   principal.start(new Stage());
                   Loguin.getLoguin().close();
               } catch (Exception ex) {
                  ex.printStackTrace();
               }
               
               
              }
           } 
            
        }

    



/**
 * Initializes the controller class.
 */
@Override
        public void initialize(URL location, ResourceBundle resources) {
       //TODO
       /*
        btEntrar.setOnMouseClicked((MouseEvent e) -> {
            
        
        });
       
        
        btSair.setOnMouseClicked((MouseEvent e) -> {
            
        
        });
        */
   

    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafxbd.CadastrarEmpresa;
import javafxbd.CadastrarPessoa;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class PrincipalController implements Initializable {
     @FXML
    private MenuBar menuBarraPrincipal;

    @FXML
    private Menu menuCadastrarPessoa;

    @FXML
    private MenuItem menuItenCadastrarPessoa;

    @FXML
    private MenuItem menuItenListarPessoa;

    @FXML
    private Menu menuCadastrarEmpresa;

    @FXML
    private MenuItem menuItenCadastrarEmpresa;
    
    @FXML
    private MenuItem menuItenListarEmpresa;
    CadastrarPessoa cadastrarPessoa = new CadastrarPessoa();
    CadastrarEmpresa cadastrarEmpresa = new CadastrarEmpresa();
   
    public void menuCadastrarPessoaAction(){
        
         try {
             cadastrarPessoa.start(new Stage());
         } 
         catch (Exception ex) {
             
         }
    
    }
    
    public void menuCadastrarEmpresaAction(){
        
         try {
             cadastrarEmpresa.start(new Stage());
         } 
         catch (Exception ex) {
             
         }
         
         
    
    }
    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

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

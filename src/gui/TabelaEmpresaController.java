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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Empresa;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class TabelaEmpresaController implements Initializable {

     @FXML
    private Button btEmpresaAtualizar;

    @FXML
    private Button btEmpresaDeletar;

    @FXML
    private TableView<Empresa> TabelaEmpresa;

    @FXML
    private TableColumn<Empresa, String> colunaTabelaId;

    @FXML
    private TableColumn<Empresa, String> colunaTabelaNome;

    @FXML
    private TableColumn<Empresa, String> colunaTabelaEmail;

    
    
    
    
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

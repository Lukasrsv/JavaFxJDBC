/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.EmpresaDaoJDBC;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Empresa;


/**
 * FXML Controller class
 *
 * @author lukas
 */
public class TabelaEmpresaController implements Initializable {
    public TabelaEmpresaController(){
    
    }
     @FXML
    private Button btEmpresaAtualizar;

    @FXML
    private Button btEmpresaDeletar;

    @FXML
    private TableView<Empresa> tabelaEmpresa;

    @FXML
    private TableColumn<Empresa, String> colunaTabelaId;

    @FXML
    private TableColumn<Empresa, String> colunaTabelaNome;

    @FXML
    private TableColumn<Empresa, String> colunaTabelaEmail;

    
     public  void inicializarTabelaEmpresa(){
        
        colunaTabelaId.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
        colunaTabelaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaTabelaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tabelaEmpresa.setItems(carregarListaEmpresa());
    }
    
   
   
    public ObservableList<Empresa> carregarListaEmpresa(){
        EmpresaDaoJDBC empresa = new EmpresaDaoJDBC();
        List <Empresa> lista = new ArrayList<>();
        ObservableList <Empresa> obsList;
        lista = empresa.Buscar();
        return  obsList = FXCollections.observableArrayList(lista);
        
    
    }
    
    public void carregarListaEmpresa1(){
        EmpresaDaoJDBC empresa = new EmpresaDaoJDBC ();
        List <Empresa> lista = new ArrayList<>();
        ObservableList <Empresa> obsList;
        lista = empresa.Buscar();
        obsList = FXCollections.observableArrayList(lista);
        tabelaEmpresa.setItems(obsList);
    
    }
    
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializarTabelaEmpresa();
    }    
    
}

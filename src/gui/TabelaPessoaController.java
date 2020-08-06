/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import DAO.PessoaDaoJDBC;
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
import javafxbd.TabelaPessoa;
import model.Pessoa;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class TabelaPessoaController implements Initializable {
    public TabelaPessoaController(){
    
    }
    
    @FXML
    private Button btPessoaAtualizar;

    @FXML
    private Button btPessoaDeletar;

    @FXML
    private TableView<Pessoa> tablePessoa;

    @FXML
    private TableColumn<Pessoa, String> colunaTabelaPessoaId;

    @FXML
    private TableColumn<Pessoa, String> colunaTabelaPessoaNome;

    @FXML
    private TableColumn<Pessoa, String> colunaTabelaPessoaEmail;

    
    
    public  void inicializarTabelaPessoa(){
        
        colunaTabelaPessoaId.setCellValueFactory(new PropertyValueFactory("id"));
        colunaTabelaPessoaNome.setCellValueFactory(new PropertyValueFactory("nome"));
        colunaTabelaPessoaEmail.setCellValueFactory(new PropertyValueFactory("email"));
        tablePessoa.setItems(carregarListaPessoa());
        
    }
    
    // esse método carrega a tabela através do loader na classe TabelaPessoa
    public void carregarListaPessoa1(){
        PessoaDaoJDBC pessoa = new PessoaDaoJDBC();
        List <Pessoa> lista = new ArrayList<>();
        ObservableList <Pessoa> obsList;
        lista = pessoa.Buscar();
        obsList = FXCollections.observableArrayList(lista);
        tablePessoa.setItems(obsList);
    
    }
   
    public ObservableList<Pessoa> carregarListaPessoa(){
        PessoaDaoJDBC pessoa = new PessoaDaoJDBC();
        List <Pessoa> lista = new ArrayList<>();
        ObservableList <Pessoa> obsList;
        lista = pessoa.Buscar();
       return  obsList = FXCollections.observableArrayList(lista);
        
    
    }
    
    
    
   
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       inicializarTabelaPessoa();
    }    
    
}

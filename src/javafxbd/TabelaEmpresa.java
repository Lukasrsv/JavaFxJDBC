/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import gui.TabelaEmpresaController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lukas
 */
public class TabelaEmpresa extends Application {
    public static Stage tabelaEmpresa;
    @Override
    public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/TabelaEmpresa.fxml"));//carrega fxml
            Parent parent = loader.load();
            Scene scene = new Scene(parent);//insere fxml em uma cena
            stage.setScene(scene);//insere a cena em uma janela
            stage.setTitle("TabelaEmpresa");
            stage.show();//mostra a janela
            //TabelaEmpresaController controler = loader.getController();
          //  controler.carregarListaEmpresa1();
            setTabelaEmpresa(stage);
    }

    public static Stage getTabelaEmpresa() {
        return tabelaEmpresa;
    }

    public static void setTabelaEmpresa(Stage tabelaEmpresa) {
        TabelaEmpresa.tabelaEmpresa = tabelaEmpresa;
    }
    
    public static void fecharTelaTabelaEmpresa(){
        TabelaEmpresa.getTabelaEmpresa().close();
    
    }
   public static void abrirTelaTabelaEmpresa(){
    TabelaEmpresa empresa = new TabelaEmpresa();
        try {
            empresa.start(new Stage());
        } 
        catch (Exception ex) {
            
        }
        
       
    }
    
     public static void main(String[] args) {
        launch(args);
        
        
    }
    
    
    
}

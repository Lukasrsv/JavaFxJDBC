/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import gui.TabelaPessoaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lukas
 */
public class TabelaPessoa extends Application {
    public static Stage tabelaPessoa;
    @Override
    public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/TabelaPessoa.fxml"));//carrega fxml
            Parent parent = loader.load();
            Scene scene = new Scene(parent);//insere fxml em uma cena
            stage.setScene(scene);//insere a cena em uma janela
            stage.setTitle("TabelaPessoa");
            stage.show();//mostra a janela
           // TabelaPessoaController controller = loader.getController();
            //controller.carregarListaPessoa();
            setTabelaPessoa(stage);
            
    }

    public static Stage getTabelaPessoa() {
        return tabelaPessoa;
    }

    public static void setTabelaPessoa(Stage tabelaPessoa) {
        TabelaPessoa.tabelaPessoa = tabelaPessoa;
    }
    
    public static void fecharTelaTabelaPessoa(){
        TabelaPessoa.getTabelaPessoa().close();
    
    }
   public static void abrirTelaTabelaPessoa(){
     TabelaPessoa tabelaPessoa = new TabelaPessoa();
     

        try {
            tabelaPessoa.start(new Stage());
            
        } 
        catch (Exception ex) {
            
        }
    }
    
     public static void main(String[] args) {
        launch(args);
        
        
    }
    
    
    
}

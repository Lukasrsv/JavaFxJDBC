/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lukas
 */
public class CadastrarPessoa extends Application{
    public static Stage CadastrarPessoa;
    
    @Override
    public void start(Stage stage) throws Exception {
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/CadastrarPessoa.fxml"));//carrega fxml
            Scene scene = new Scene(parent);//insere fxml em uma cena
            stage.setScene(scene);//insere a cena em uma janela
            stage.setTitle("CadastrarPessoa");
            stage.show();//mostra a janela
            setCadastrarPessoa(stage);
    }

    public static Stage getCadastrarPessoa() {
        return CadastrarPessoa;
    }

    public  void setCadastrarPessoa(Stage CadastrarPessoa) {
       this.CadastrarPessoa = CadastrarPessoa;
    }
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }
}

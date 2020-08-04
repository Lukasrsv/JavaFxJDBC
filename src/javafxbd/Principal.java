/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import java.io.IOException;
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
public  class Principal extends Application{
    public static Stage principal;
   
    
    @Override
    public void start(Stage stage) throws Exception {
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/Principal.fxml"));//carrega fxml
            Scene scene = new Scene(parent);//insere fxml em uma cena
            stage.setScene(scene);//insere a cena em uma janela
            stage.setTitle("Principal");
            stage.show();//mostra a janela
            setPrincipal(stage);
    }

    public static Stage getPrincipal() {
        return principal;
    }

    public void setPrincipal(Stage principal) {
        this.principal = principal;
    }
    
    
   
    
     public static void main(String[] args) {
        launch(args);
        
        
    }
    
}

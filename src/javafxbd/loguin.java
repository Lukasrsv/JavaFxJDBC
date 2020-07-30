/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbd;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author lukas
 */
public class loguin extends Application {
   private static Stage stage;
    
    @Override
    public void start(Stage stage) throws IOException{
            Parent parent = FXMLLoader.load(getClass().getResource("/view/Loguin.fxml"));//carrega fxml
            Scene scene = new Scene(parent);//insere fxml em uma cena
            stage.setScene(scene);//insere a cena em uma janela
            stage.setTitle("Loguin");
            stage.show();//mostra a janela
            setStage(stage);
    }

    public static void setStage(Stage stage) {
        loguin.stage = stage;
    }

    public static Stage getStage() {
        return stage;
    }
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }

   
    
}

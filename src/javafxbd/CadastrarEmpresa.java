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
public class CadastrarEmpresa extends Application {

   public static Stage CadastrarEmpresa;
    
    @Override
    public void start(Stage stage) throws Exception {
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/CadastrarEmpresa.fxml"));//carrega fxml
            Scene scene = new Scene(parent);//insere fxml em uma cena
            stage.setScene(scene);//insere a cena em uma janela
            stage.setTitle("Loguin");
            stage.show();//mostra a janela
            setCadastrarEmpresa(stage);
    }

    public static Stage getCadastrarEmpresa() {
        return CadastrarEmpresa;
    }

    public void setCadastrarEmpresa(Stage CadastrarEmpresa) {
        this.CadastrarEmpresa = CadastrarEmpresa;
    }

    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}

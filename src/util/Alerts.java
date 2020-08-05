/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javafx.scene.control.Alert;

/**
 *
 * @author lukas
 */
public  class Alerts {
    
    public static void showAlerts(String title, String header,String content, Alert.AlertType type){
    
    Alert alert = new Alert(type);
    alert.setHeaderText(header);
    alert.setTitle(title);
    alert.setContentText(content);
    alert.show();
    
    }
    
}

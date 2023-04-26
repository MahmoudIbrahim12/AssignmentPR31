/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javafx.application.Application;
import javafx.stage.Stage;
import view.ViewManager;

/**
 *
 * @author M.IB.MH
 */
public class NewFXMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        ViewManager.openLoginPage();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

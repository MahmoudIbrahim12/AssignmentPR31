/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author M.IB.MH
 */
public class LoginPage extends Stage{
    
     private TextField textFieldname ;
        private PasswordField password;
        private Label name , pass ;
        private Button login ;
        private Scene scene;
        private Label message ;
 
          ImageView imageView;
         Image image ;
    public LoginPage() {
         image = new Image("file:C:\\Users\\Public\\image\\images.jpg");
       imageView = new ImageView(image);
imageView.setFitWidth(150);
imageView.setFitHeight(150);

       textFieldname = new TextField();
       textFieldname.setStyle("-fx-border-color:blue");
       
       password = new PasswordField();
       password.setStyle("-fx-border-color:blue");
       name = new Label("User Name");
       name.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
       pass = new Label("Password");
       pass.setStyle("-fx-font-size:20px; -fx-font-weight:bold;");
       login = new Button("Login");
       login.setPadding(new Insets(15));
       login.setStyle("-fx-background-color:blue;-fx-text-fill:white;");
       login.setOnAction(e->{
             if(textFieldname.getText().equals("user") && password.getText().equals("userpass")){
                ViewManager.closeLoginPage();
                ViewManager.openCurrencyConverstionPage();
             }else {
                  name.setText("User Name \n  data is invalid ");
                 // pass.setText("password \n data is invald");
                  name.setStyle("-fx-text-fill:red;"
                          + "-fx-font-weight:bold;");
             }
       });
       VBox vx = new VBox(10,imageView,name , textFieldname , pass , password , login );
       vx.setAlignment(Pos.CENTER);
       vx.setPadding(new Insets(70));
       vx.getStylesheets().add("style.css");

         scene = new Scene(vx, 340, 540);
        this.setScene(scene);
        this.setTitle("Login Page");
        this.setResizable(false);
        this.show();
  
    }
    
}

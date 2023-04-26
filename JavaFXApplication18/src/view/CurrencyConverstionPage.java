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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author M.IB.MH
 */
public class CurrencyConverstionPage extends Stage{
    
    private Label currency , USD , NIS , To;
      private TextField Dollar , shekel ; 
      private Button logout , convert ;
      
    public CurrencyConverstionPage()  {
        
        currency = new Label("Currency Conversion System");
        currency.setStyle("-fx-font-weight:bold;"
                + "-fx-text-fill:#43378E");
        logout = new Button(" Log out ");
        logout.setStyle("-fx-background-color:orange;-fx-font-size-15px;-fx-text-fill:white;");
        HBox hx1 = new HBox(100,currency,logout);
        hx1.setAlignment(Pos.CENTER);
        hx1.setPadding(new Insets(20));
        USD = new Label("USD");
        NIS = new Label("NIS");
        USD.setStyle("-fx-font-weight:bold;-fx-text-fill:#43378E;");
        
        NIS.setStyle("-fx-font-weight:bold; -fx-text-fill:#43378E");
        HBox hx2 = new HBox(130,USD,NIS);  
        hx2.setAlignment(Pos.CENTER);
        hx2.setPadding(new Insets(20));
        Dollar = new TextField();
        shekel = new TextField();
        To = new Label("TO");
        To.setStyle("-fx-font-weight:bold");
        Dollar.setPrefWidth(90);
        shekel.setPrefWidth(90);
        HBox hx3 = new HBox(30,Dollar ,To, shekel);
        hx3.setAlignment(Pos.CENTER);
        VBox vx1 = new VBox(hx2 , hx3);
        convert = new Button("Convert");
        convert.setStyle("-fx-background-color:#43378E;"
                + "-fx-font-size-15px;"
                + "-fx-text-fill:white;");
         convert.setPadding(new Insets(12));
         convert.setOnAction(e->{
           if(!Dollar.getText().isEmpty()){
               String x = Dollar.getText() ;
               double y = Integer.parseInt(x) * 3.67 ;
               String d = "";
               String z = d+y;
               shekel.setText(z);
           }else if(!shekel.getText().isEmpty()) {
               String x = shekel.getText() ;
               double y = Integer.parseInt(x) / 3.67 ;
               String d = "";
               String z = d+y;
               Dollar.setText(z);
               
           }else if(Dollar.getText().isEmpty() && shekel.getText().isEmpty()){
               To.setText("The fields are Empty");
               To.setStyle("-fx-text-fill:red;-fx-font-weight:bold");
           }else  {
               Dollar.setText(" ");
               shekel.setText(" ");
           }
         });
         
        logout.setOnAction(e->{
         ViewManager.closeCurrencyConverstionPage();
         ViewManager.openLoginPage();
        });
        
        VBox vx2 = new VBox(20 ,hx1 ,vx1 );
        VBox vx3 = new VBox(30,vx2,convert);
        vx2.setAlignment(Pos.CENTER);
        vx1.setAlignment(Pos.CENTER);
        vx3.setAlignment(Pos.CENTER);
       
        VBox vx4 = new VBox(50);
        VBox vx5 = new VBox(60,vx3,vx4);
        vx5.setAlignment(Pos.CENTER);
        vx1.setPadding(new Insets(20));
        Scene scene = new Scene(vx5,450,340);
        this.setScene(scene);
        this.setTitle("CurrencyConverstionPage");
        this.show();
               
    }
    
}

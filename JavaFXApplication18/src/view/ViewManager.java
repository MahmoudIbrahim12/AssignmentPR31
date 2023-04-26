/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author M.IB.MH
 */
public class ViewManager {
    
     public static LoginPage loginpage;
    public static CurrencyConverstionPage currencyConverstionPage;
    
    
    private ViewManager(){   
    }
    
    public static void openLoginPage(){
        if (loginpage == null) {
            loginpage = new LoginPage();
            loginpage.show();
        } else {
            loginpage.show();
        }
        
    }
    public static void closeLoginPage(){
        if(loginpage != null)
            loginpage.close();
    }
    
    public static void openCurrencyConverstionPage() {
        if (currencyConverstionPage == null) {
            currencyConverstionPage = new CurrencyConverstionPage();
            currencyConverstionPage.show();
        } else {
            currencyConverstionPage.show();
        }
        
    }
    public static void closeCurrencyConverstionPage(){
        if(currencyConverstionPage != null)
            currencyConverstionPage.close();
    }
}

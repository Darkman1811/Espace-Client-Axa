/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

//import com.processmaker.NewCaseResponse;
import dao.Contrat;
import dao.Devis;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import metier.devisMetier;
import metier.contratMetier;
import spi.processmaker.test;

/**
 *
 * @author darkman
 */
@ManagedBean
@SessionScoped
public class testMB {
    @EJB
    test metier;
 
    
//    NewCaseResponse response;
    String pin;
    
    public String login() {
        // this.response= metier.newcase();
         this.pin=metier.getPin();
     //   return response.getMessage();
     return "bobo";
    }

   

    
    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

   
    
    
}

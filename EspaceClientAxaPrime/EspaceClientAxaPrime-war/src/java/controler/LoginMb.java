/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import metier.clientMetier;

/**
 *
 * @author darkman
 */
@ManagedBean
public class LoginMb {
                        @EJB
                        clientMetier cm;
    private String login;
    private String pass;
    public boolean login(){
    //  Boolean result= cm.login(login, pass);
   //   if (result=true)   
   return false;
    }
}

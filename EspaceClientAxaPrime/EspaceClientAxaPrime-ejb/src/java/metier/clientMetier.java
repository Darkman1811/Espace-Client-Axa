/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import dao.Client;
import javax.jws.WebService;
import javax.persistence.Query;

/**
 *
 * @author darkman
 */
@Stateless
@LocalBean
@WebService
public class clientMetier {
@PersistenceContext
EntityManager em; 

  
    public Client login(String login,String password){
        Client orig=new Client();
        orig.setLogin(login);
        orig.setPassword(password);
        Query query=em.createNamedQuery("Client.FindLogin").setParameter("plogin", login).setParameter("ppass", password);
        try{
        Client result=(Client)query.getSingleResult();
        
         return result;
           
        }
        catch (javax.persistence.NoResultException ex){
            return null;
        }
      
           
       
       
    }

    
}

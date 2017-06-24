/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.Produit;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author darkman
 */
@Stateless
@LocalBean
@WebService
public class produitMetier {
@PersistenceContext
EntityManager em;
           
   
   public Produit read(long id){
        
       Produit produit =em.find(Produit.class, id);
       return produit;
   }
   
   public List<Produit> liste(){
       return em.createNamedQuery("Produit.FindAll",Produit.class).getResultList();
   }
    
}

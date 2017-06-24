/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.Voiture;
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
public class voitureMetier {
@PersistenceContext
EntityManager em;
           
   public void create(Voiture voiture){
       em.persist(voiture);
   }
   
   public Voiture read(long id){
        
       Voiture voiture =em.find(Voiture.class, id);
       return voiture;
   }
   
   public List<Voiture> liste(){
       return em.createNamedQuery("Voiture.FindAll").getResultList();
   }
    
}

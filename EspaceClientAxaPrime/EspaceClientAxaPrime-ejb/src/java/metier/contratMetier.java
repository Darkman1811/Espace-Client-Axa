/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.Contrat;
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
public class contratMetier {
@PersistenceContext
EntityManager em;
   public void create(Contrat contrat){
       em.persist(contrat);
   }    

    public Contrat read(Contrat contrat){
        return em.find(Contrat.class,contrat.getId());
    }
    
    public List<Contrat> liste(){
        System.out.println(em.createNamedQuery("Contrat.FindAll",Contrat.class).getResultList().size());
        return em.createNamedQuery("Contrat.FindAll",Contrat.class).getResultList();
    }
}

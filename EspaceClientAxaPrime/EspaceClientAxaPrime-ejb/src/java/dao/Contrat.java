/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author darkman
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Contrat.FindAll", query="Select C from Contrat C"),
})
public class Contrat extends Service implements Serializable {

   private Long durée;
   @Temporal(TemporalType.DATE)
   private java.util.Date dateFin;
}

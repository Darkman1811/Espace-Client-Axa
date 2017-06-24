/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlerTests;

import controler.devisMB;
import dao.Contrat;
import dao.Devis;
import java.util.ArrayList;
import metier.contratMetier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/**
 *
 * @author darkman
 */
public class DevisMBTests {
     devisMB devismb=new devisMB();
    public DevisMBTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}7
    @Rule
    public MockitoRule mockitorule= MockitoJUnit.rule();
    @Mock
    contratMetier contratmetier;
    @Mock
    Devis selDevis;
    
    
    @Test
    public void testValiderContrat(){
        devisMB devismb=new devisMB();
       
        devismb.setSelectedDevis(selDevis);       
        devismb.setContratmetier(contratmetier);
        
        devismb.validerDevis();
        
        assertNotNull(devismb.getContratmetier());
        Mockito.verify(contratmetier,Mockito.atLeast(1)).create(Matchers.isNotNull(Contrat.class));
        
        Mockito.when(contratmetier.liste()).thenReturn(new ArrayList<Contrat>());
    }
}

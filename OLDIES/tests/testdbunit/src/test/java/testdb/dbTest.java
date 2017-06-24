/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import junit.framework.TestCase;
import org.dbunit.DataSourceDatabaseTester;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.junit.Test;

/**
 *
 * @author darkman
 */
public class dbTest extends TestCase {
    @PersistenceContext
EntityManager em; 
    public dbTest(String testName) {
        super(testName);
    }
    
  @Test
  public void tester1(){
     /* PropertiesBasedJdbcDatabaseTester.
      DataSourceDatabaseTester dbTester= new DataSourceDatabaseTester()*/
      assertTrue(true);
  }
    
}

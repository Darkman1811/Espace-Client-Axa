/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spi;


import com.processmaker.GetVariablesRequest;
import com.processmaker.GetVariablesResponse;
import com.processmaker.NewCaseRequest;
import com.processmaker.NewCaseResponse;
import com.processmaker.ProcessMakerService;
import com.processmaker.ProcessMakerServiceSoap;
import com.processmaker.VariableListStruct;
import com.processmaker.VariableStruct;
import java.math.BigInteger;
import java.net.URI;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.ws.Holder;

/**
 *
 * @author darkman
 */
@WebService
@Stateless
@LocalBean
public class test {
 private String secret;
 private NewCaseResponse newCaseResponse;
 private String pin;
 private ProcessMakerServiceSoap port;
 
   public String login(String user,String pass){
       ProcessMakerService service=new ProcessMakerService();
        port=service.getProcessMakerServiceSoap();
       Holder<BigInteger> statusCode=new Holder<BigInteger>();
         Holder<String> message=new Holder<String>();
         Holder<String> version=new Holder<String>();
         Holder<String> timestamp=new Holder<String>();
        
          port.login(user, pass, statusCode, message, version, timestamp);
          this.secret=message.value;
          return secret;
   }
   
   public NewCaseResponse newcase(){
          this.login("admin","scorpio");
          NewCaseRequest req=new NewCaseRequest();
          req.setProcessId("450098214587b65f65eac42031125287");
          req.setSessionId(secret);
          req.setTaskId("482096035587b664ad4a5a9007394728");
          
          
          VariableListStruct nom= new VariableListStruct();
          nom.setName("Nom");
          nom.setValue("Diaw");
          VariableListStruct prenom= new VariableListStruct();
          prenom.setName("Prenom");          
          prenom.setValue("Abdoulaye");
          req.getVariables().add(nom);
          req.getVariables().add(prenom);
          
          NewCaseResponse resp=port.newCase(req);
          
        /*
          ExecuteTriggerRequest executeTriggerRequest = new ExecuteTriggerRequest();
          executeTriggerRequest.setCaseId(resp.getCaseId());
          executeTriggerRequest.setSessionId(sessionId);
          //Triger to change the draft status of the case to toDo status
          executeTriggerRequest.setTriggerIndex("734944459589d939e79bca3065811198"); 
          executeTriggerRequest.setDelIndex(resp.getCaseNumber());
          
        port.executeTrigger(executeTriggerRequest);*/
        this.newCaseResponse=resp;
       return resp;  
   }
   
   public String getPin(){
       GetVariablesRequest  getVariablesRequest= new GetVariablesRequest();
       getVariablesRequest.setCaseId(newCaseResponse.getCaseId());
       getVariablesRequest.setSessionId(secret);
       VariableStruct pin=new VariableStruct();
       pin.setName("PIN");
       getVariablesRequest.getVariables().add(pin);
       GetVariablesResponse resp= port.getVariables(getVariablesRequest);
       
       return resp.getVariables().get(0).getValue();       
   }
   
   public String getCaseTrackerContent() throws Exception{
  
          Client client= ClientBuilder.newClient();
      URI uri=UriBuilder.fromUri("http://172.17.0.3/sysworkflow/en/neoclassic/tracker/authentication3.php").build();
    
       Form form= new Form();
       
       form.param("CASE", "12");
       form.param("PIN", "OBU3");
       Response resp=client.target(uri).request(MediaType.MULTIPART_FORM_DATA).post(Entity.form(form));  
          
     String resultat=resp.readEntity(String.class);
     System.out.println(resultat);
       return resultat;
   }
   
   public String testRest(){
       
          Client client= ClientBuilder.newClient();
      URI uri=UriBuilder.fromUri("http://172.17.0.3/workflow/oauth2/token").build();
    
      ProcessmakerConnection procon=new ProcessmakerConnection();
      procon.setGrant_type("password");
      procon.setScope("*");
      procon.setClient_id("IYKPVRFJJMLMHCEZTILDSOGURIBAXDZG");
      procon.setClient_secret("384171839588cfad3dd8d11012605315");
      procon.setUsername("admin");
      procon.setPassword("scorpio");
      
      Response resp=client.target(uri).request(MediaType.APPLICATION_JSON)
              .property("grant_type", "password")
              .property("scope","*")
              .property("client_id","IYKPVRFJJMLMHCEZTILDSOGURIBAXDZG")
              .property("client_secret","384171839588cfad3dd8d11012605315")
              .property("username","admin")
              .property("password","scorpio")
              .post(Entity.json(procon));     
      
      
     String resultat=resp.readEntity(String.class);
     System.out.println(resultat);
       return resultat;
   }

}

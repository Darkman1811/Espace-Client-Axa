/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.guestu.testprocessmaker;

import com.processmaker.ExecuteTriggerRequest;
import com.processmaker.GetVariablesRequest;
import com.processmaker.GetVariablesResponse;
import com.processmaker.NewCaseRequest;
import com.processmaker.NewCaseResponse;
import com.processmaker.ProcessMakerService;
import com.processmaker.ProcessMakerServiceSoap;
import com.processmaker.VariableListStruct;
import com.processmaker.VariableStruct;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
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
 
   private String login(String user,String pass){
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
      URI uri=UriBuilder.fromUri("http://192.168.99.100:8081/sysworkflow/en/neoclassic/tracker/authentication3.php").build();
    
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
      //URI uri=UriBuilder.fromUri("http://192.168.99.100:8081/workflow/oauth2/token").build();
        URI uri=UriBuilder.fromUri("http://192.168.99.100:8081").build();
      Form form= new Form();
      
      form.param("grant_type", "password");
      form.param("scope","*");
      form.param("scope","*");
      form.param("client_id", "NTKKHMFIIWDWWJQOLMQNLENJWJRQKAHX");
      form.param("client_secret","78942250858a078bdac1723032872793");
      form.param("username","admin");
      form.param("password","scorpio");   
              
      Response resp=client.target(uri).path("workflow").path("oauth2").path("token").request(MediaType.APPLICATION_JSON).post(Entity.form(form));
       
     String resultat=resp.readEntity(String.class);
     JsonReader reader=Json.createReader(new StringReader(resultat));
     JsonObject json= reader.readObject();
     String token=json.getString("access_token");
     Double expires=json.getJsonNumber("expires_in").doubleValue();
     String token_type=json.getString("token_type");
     String scope=json.getString("scope");
     String refresh_token=json.getString("refresh_token");
     
       Response resp1=client.target(uri).path("api/1.0").path("workflow").path("cases").path("/draft").request(MediaType.APPLICATION_JSON)
               .header("Authorization", "Bearer "+token)
               .get();
     String resultat2=resp1.readEntity(String.class);
   //  System.out.println(resultat);
     System.out.println(resultat2);
       return resultat2;
   }

}

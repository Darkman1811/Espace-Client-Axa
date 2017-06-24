/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfacebookapi;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;
import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

/**
 *
 * @author darkman
 */
public class TestFaceBookApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String accessToken="EAAaA2dc25FEBAMuLFLZA16gXCZCOZBayQMYcZBt7ZAGmmfFc76rExZCEhKgWHniaqAfUOx4AGp9ttTBWoL83IiGKaML7h9ldMhZAu7w1NPLh7ixp7vBrXKcweDUZAVa9fO6g2XD8UeQ3PHcsL3gJ6b7D2j6FxHfBOfTZCLPPJSZCLy6vyZCy6LyKaOL5ZBAGLCCdc08ZD";
          String accessToken="EAACEdEose0cBAKsuTxVZBeVRM1fmSTY7jNLRzmyBZB3xrPEhCDO0dXYqgN6BPuDZBZB5HLI9aYC9YUA6LjNvp6WkbyChLZBMExAyI6nHIrlQntXzLwGODlbwY8RR8w3moFPlkmlXIWGRYUcEaSIA46iWr7oLZB1r5EHH2ZB63ZBsNIxiiDrjlZCxX8Qa3SjqdsjUZD";
       /* FacebookClient fbClient= new  DefaultFacebookClient(accessToken);
        User me=fbClient.fetchObject("me", User.class);
        */
         Client client= ClientBuilder.newClient();
      URI uri=UriBuilder.fromUri("https://graph.facebook.com").path("me").build();
    
      Form form=new Form();
      form.param("access_token", accessToken);
      form.param("fields","id,name,birthday");
      Response resp=client.target(uri)
                    .queryParam("access_token", accessToken)
              .queryParam("fields", "id,name,birthday")
              .request(MediaType.APPLICATION_JSON)              
              .get();     
      
      
     String resultat=resp.readEntity(String.class);
     new TestFaceBookApi().SaveToElasticSearch(resultat);
     System.out.println(resultat);
      /* return resultat;  
        
        System.out.println("me: "+me.getId());
        System.out.println("nom: "+me.getName());
        System.out.println("date naisse: "+me.getBirthday());*/
        /*System.out.println("nom: "+me.getFirstName());
        System.out.println("prenom: "+me.getLastName());
        System.out.println("email: "+me.getEmail());
        
        System.out.println("Religion: "+me.getReligion());
        System.out.println("langue: "+me.getLocale());
        System.out.println("Ville de naissance: "+me.getHometownName());

        System.out.println("genre: "+me.getGender());
        System.out.println("genre: "+me.getGender());*/
        
                
        
        
        
        
        
        
    }
    
    private void SaveToElasticSearch(String data){
          Client client= ClientBuilder.newClient();
         
        URI uri=UriBuilder.fromUri("http://172.17.0.2:9200")
                        .path("guestu")
                        .path("facebook")
                        .path("feeds")
                        .build();
     Response resp=client.target(uri)
                         .request(MediaType.APPLICATION_JSON)              
                         .post(Entity.json(data));   
     String resultat=resp.readEntity(String.class);
     System.out.println(resultat);
    }
}

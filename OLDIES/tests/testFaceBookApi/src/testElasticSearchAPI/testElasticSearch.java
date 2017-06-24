/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testElasticSearchAPI;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

/**
 *
 * @author darkman
 */
public class testElasticSearch {
     public static void main(String[] args) {
          Client client= ClientBuilder.newClient();
    /*
          URI uri=UriBuilder.fromUri("http://172.17.0.2:9200")
                        .path("grafikart")
                        .path("tutoriels")
                        .path("_search")
                        .build();
     Response resp=client.target(uri)
                         .queryParam("q", "php")
                         .request(MediaType.APPLICATION_JSON)              
                         .get();   
     */
    
    String postdata="{\n" +
" \"title\":\"AngularJs\",\n" +
" \"category\":\"Javascript\",\n" +
" \"tags\":[\"Javascript\",\"dev\",\"AngularJS\"],\n" +
" \"duration\":200\n" +
"} ";
        URI uri=UriBuilder.fromUri("http://172.17.0.2:9200")
                        .path("grafikart")
                        .path("tutoriels")
                        .build();
     Response resp=client.target(uri)
                         .request(MediaType.APPLICATION_JSON)              
                         .post(Entity.json(postdata));   
     String resultat=resp.readEntity(String.class);
     System.out.println(resultat);
     }
}

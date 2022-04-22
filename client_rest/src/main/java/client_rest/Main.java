package client_rest;
import java.net.URI;

import com.mysql.cj.xdevapi.ClientFactory;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
public class Main {

	public static void main(String[] args) {
		  String url = "http://localhost:8080/immobile_reset/immobile/find/2";
		 
		     Client restClient = Client.create();
		        WebResource webResource = restClient.resource(url);
		        ClientResponse resp = webResource.accept("application/json")
		                                                    .get(ClientResponse.class);
		        if(resp.getStatus() != 200){
		            System.err.println("Unable to connect to the server");
		        }
		        String output = resp.getEntity(String.class);
		        System.out.println("response: "+output);
	

	}

}

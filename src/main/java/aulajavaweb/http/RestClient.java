package aulajavaweb.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestClient {

	public static void main(String...args) throws IOException {
		String url0 = "http://localhost:8080/aulajavaweb/model/all";

		URL url = new URL(url0); 
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		
		int code = conn.getResponseCode();
		
		conn.getInputStream();
		
//		try {
//			Client client = Client.create();
//			WebResource webResource = client.resource(url);
//			ClientResponse response = webResource.get(ClientResponse.class);
//
//			if (response.getStatus() != 200) {
//			   throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//			}
//			
//			System.out.println("Output from Server .... \n" + response.getEntity(String.class));
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}

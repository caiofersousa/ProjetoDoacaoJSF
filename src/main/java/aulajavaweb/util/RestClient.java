package aulajavaweb.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;

public final class RestClient {
	
	public enum RequestType {
		
		GET((byte) 1, "GET"),
		PUT((byte) 2, "PUT"),
		POST((byte) 3, "POST"),
		DELETE((byte) 4, "DELETE");
		
		private Byte code;
		private String description;
		
		private RequestType(byte c, String d) {
			code = c;
			description = d;
		}
		
		public Byte getCode() {
			return code;
		}
		
		public String getDescription() {
			return description;
		}
		
		public RequestType getByCode(int code) {
			return getByCode((byte) code);
		}
		
		public RequestType getByCode(byte code) {
			for(RequestType rt : values()) {
				if(rt.code == code) return rt; 
			}
			return null;
		}
		
		public RequestType getByDescription(String desc) {
			for(RequestType rt : values()) {
				if(rt.description.equalsIgnoreCase(desc)) return rt; 
			}
			return null;
		}
		
	}
	
	public Builder create(String path) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://mocky.io");		
		return target.path(path).request();
	}
	
	public <T> T get(Builder request, Class<T> clazz) {
		return request.get(clazz);
	}
	
	public <T> T put(Builder request, Class<T> clazz, Entity<T> entity) {
		return request.put(entity, clazz);
	}
	
	public <T> T post(Builder request, Class<T> clazz, Entity<T> entity) {
		return request.post(entity, clazz);
	}
	
	public <T> T delete(Builder request, Class<T> clazz, Entity<T> entity) {
		return request.delete(clazz);
	}
	
}

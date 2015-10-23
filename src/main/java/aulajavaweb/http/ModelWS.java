package aulajavaweb.http;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import aulajavaweb.model.Produto;

@Path("model")
public class ModelWS {

	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> model() {
		return Arrays.asList(Produto.builder().id(1).name("coca-cola").build());
	}
	
	@POST
	@Path("insert")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void insert(Produto produto) {
		
	} 
	
}

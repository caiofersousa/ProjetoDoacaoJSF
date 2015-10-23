package aulajavaweb.http;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("model")
public class ModelWS {

	@GET
	@Path("all")
	@Produces({MediaType.APPLICATION_JSON})
	public List<String> model() {
		return Arrays.asList("dasdsa", "dasds");
	}
	
}

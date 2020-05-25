package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/conversor")
public class Conversor {

	@GET
	@Produces("text/plain")
	public String tempC (@QueryParam("celsius")float valor) {
		return "Seja bem-vindo ao conversor de temperaturas\nO valor em Fahrenheit eh: " + ((valor*1.8)+32);
	}

}



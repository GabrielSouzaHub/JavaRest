package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("conversorF")
public class ConversorF {
	
	@GET
	@Produces("text/plain")
		public String tempF (@QueryParam("fahrenheit")float valor2) {
			return "Seja bem-vindo ao conversor de temperaturas\nO valor em Celsius eh: " + ((valor2-32)/1.8);
		
	}

}

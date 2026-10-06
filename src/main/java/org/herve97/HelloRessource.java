package org.herve97;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloRessource {

    @Inject
    private GreetingService greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String doGreeting(@PathParam("name") String someValue, @QueryParam("language") String lang){
        return String.format(this.greetingService.getGreetingTemplate(lang), someValue);
        //return "Hello "+someValue+" with language "+lang;
    }
}

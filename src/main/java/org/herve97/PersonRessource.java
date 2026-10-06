package org.herve97;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/person")
public class PersonRessource {

    @Inject
    private PersonCache personCache;

    @Inject
    private Event<AddPersonEvent> addPersonEvent;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPerson() {
        //return new Person("Diams", 29);
        return personCache.getPersons();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public void postPerson(Person person) {
        //return person.toString();
        addPersonEvent.fire(new AddPersonEvent(person));
    }
}

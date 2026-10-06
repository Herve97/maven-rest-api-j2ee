package org.herve97;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PersonCache {
    private List<Person> persons =  new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(@Observes AddPersonEvent event) {
        persons.add(event.getPerson());
    }
}

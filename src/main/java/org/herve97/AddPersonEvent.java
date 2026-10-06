package org.herve97;

public class AddPersonEvent {

    private Person person;
    public AddPersonEvent(Person person) {
        this.person = person;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
}

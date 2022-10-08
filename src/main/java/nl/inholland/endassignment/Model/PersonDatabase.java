package nl.inholland.endassignment.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDatabase {
    public List<Person> users;

    public PersonDatabase(){
        this.users = CreateUsers();
    }

    public List<Person> CreateUsers(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith", LocalDate.of(1999,12,20)));
        people.add(new Person("Jane", "Johnson", LocalDate.of(1998,7,29)));
        people.add(new Person("Thomas", "Jefferson", LocalDate.of(1899,11,13)));
        return users;
    }
}

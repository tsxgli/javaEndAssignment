package nl.inholland.endassignment.Model;

import java.util.ArrayList;
import java.util.List;

public class Database {

   public List<User> users;

    public Database(){
        this.users = CreateUsers();
    }

    public List<User> CreateUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("philip","1234"));
        return users;
    }
}

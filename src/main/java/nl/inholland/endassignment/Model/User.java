package nl.inholland.endassignment.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final AtomicInteger count = new AtomicInteger(0);
    final int id;
   public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        id=count.incrementAndGet();

    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(){
        id=count.incrementAndGet();
    }
}

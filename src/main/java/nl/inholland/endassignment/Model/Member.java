package nl.inholland.endassignment.Model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Member {
    private static final AtomicInteger count = new AtomicInteger(0);
    final int id;
   public String username;
    public String password;
   public LocalDate birthdate;

    public Member(String username, String password,LocalDate birthdate) {
        this.username = username;
        this.password = password;
        this.birthdate = birthdate;
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

    public Member(){
        id=count.incrementAndGet();
    }
}

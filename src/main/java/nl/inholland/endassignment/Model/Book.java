package nl.inholland.endassignment.Model;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

    private static final AtomicInteger count = new AtomicInteger(0);
    final int id;
    public String title;
    public String author;
    public boolean available;

    public Book( String title, String author, boolean available) {
        this.id = count.incrementAndGet();
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

package nl.inholland.endassignment.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {

   private List<Member> members= new ArrayList<>();

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private List<Book> books= new ArrayList<>();


    public Database(){
        // add users to database
        members.add(new Member("philip","1234", LocalDate.of(1999,12,20)));
        members.add(new Member("john","1234",LocalDate.of(1999,12,20)));


        // add books to database
        books.add(new Book("Java for dummies","Vries E. de",true));
        books.add(new Book("ITSM","Innocent G",true));
        books.add(new Book("NoSQL for dummies","Marya F",true));
    }






}

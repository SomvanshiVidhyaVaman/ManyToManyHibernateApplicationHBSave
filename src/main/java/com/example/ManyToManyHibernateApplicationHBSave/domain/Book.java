package com.example.ManyToManyHibernateApplicationHBSave.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String book_Name;
    private String book_Publisher;
     private String book_Edition;
     @ManyToMany(mappedBy = "book",cascade = CascadeType.ALL)
    Set<Authors> authors=new HashSet<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBook_Name() {
        return book_Name;
    }

    public void setBook_Name(String book_Name) {
        this.book_Name = book_Name;
    }

    public String getBook_Publisher() {
        return book_Publisher;
    }

    public void setBook_Publisher(String book_Publisher) {
        this.book_Publisher = book_Publisher;
    }

    public String getBook_Edition() {
        return book_Edition;
    }

    public void setBook_Edition(String book_Edition) {
        this.book_Edition = book_Edition;
    }

    public Set<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Authors> authors) {
        this.authors = authors;
    }
}


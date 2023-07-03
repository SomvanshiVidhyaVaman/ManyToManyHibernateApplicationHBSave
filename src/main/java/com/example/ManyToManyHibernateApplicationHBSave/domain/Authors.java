package com.example.ManyToManyHibernateApplicationHBSave.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authors_Id;
    private String authors_Name;
    private String authors_Email;
    private String authors_Education;
    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(name = "book_authors",joinColumns= {@JoinColumn(name = "authors_Id")},
                    inverseJoinColumns = {@JoinColumn(name = "id")})


    Set<Book> book=new HashSet<>();

    public int getAuthors_Id() {
        return authors_Id;
    }

    public void setAuthors_Id(int authors_Id) {
        this.authors_Id = authors_Id;
    }

    public String getAuthors_Name() {
        return authors_Name;
    }

    public void setAuthors_Name(String authors_Name) {
        this.authors_Name = authors_Name;
    }

    public String getAuthors_Email() {
        return authors_Email;
    }

    public void setAuthors_Email(String authors_Email) {
        this.authors_Email = authors_Email;
    }

    public String getAuthors_Education() {
        return authors_Education;
    }

    public void setAuthors_Education(String authors_Education) {
        this.authors_Education = authors_Education;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}



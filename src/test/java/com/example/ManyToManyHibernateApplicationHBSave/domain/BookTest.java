package com.example.ManyToManyHibernateApplicationHBSave.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class BookTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Book}
     *   <li>{@link Book#setAuthors(Set)}
     *   <li>{@link Book#setBook_Edition(String)}
     *   <li>{@link Book#setBook_Name(String)}
     *   <li>{@link Book#setBook_Publisher(String)}
     *   <li>{@link Book#setId(int)}
     *   <li>{@link Book#getAuthors()}
     *   <li>{@link Book#getBook_Edition()}
     *   <li>{@link Book#getBook_Name()}
     *   <li>{@link Book#getBook_Publisher()}
     *   <li>{@link Book#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Book actualBook = new Book();
        HashSet<Authors> authors = new HashSet<>();
        actualBook.setAuthors(authors);
        actualBook.setBook_Edition("Book Edition");
        actualBook.setBook_Name("Book Name");
        actualBook.setBook_Publisher("Book Publisher");
        actualBook.setId(1);
        assertSame(authors, actualBook.getAuthors());
        assertEquals("Book Edition", actualBook.getBook_Edition());
        assertEquals("Book Name", actualBook.getBook_Name());
        assertEquals("Book Publisher", actualBook.getBook_Publisher());
        assertEquals(1, actualBook.getId());
    }
}


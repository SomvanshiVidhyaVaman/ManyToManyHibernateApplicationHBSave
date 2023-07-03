package com.example.ManyToManyHibernateApplicationHBSave.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AuthorsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Authors}
     *   <li>{@link Authors#setAuthors_Education(String)}
     *   <li>{@link Authors#setAuthors_Email(String)}
     *   <li>{@link Authors#setAuthors_Id(int)}
     *   <li>{@link Authors#setAuthors_Name(String)}
     *   <li>{@link Authors#setBook(Set)}
     *   <li>{@link Authors#getAuthors_Education()}
     *   <li>{@link Authors#getAuthors_Email()}
     *   <li>{@link Authors#getAuthors_Id()}
     *   <li>{@link Authors#getAuthors_Name()}
     *   <li>{@link Authors#getBook()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Authors actualAuthors = new Authors();
        actualAuthors.setAuthors_Education("JaneDoe");
        actualAuthors.setAuthors_Email("jane.doe@example.org");
        actualAuthors.setAuthors_Id(1);
        actualAuthors.setAuthors_Name("JaneDoe");
        HashSet<Book> book = new HashSet<>();
        actualAuthors.setBook(book);
        assertEquals("JaneDoe", actualAuthors.getAuthors_Education());
        assertEquals("jane.doe@example.org", actualAuthors.getAuthors_Email());
        assertEquals(1, actualAuthors.getAuthors_Id());
        assertEquals("JaneDoe", actualAuthors.getAuthors_Name());
        assertSame(book, actualAuthors.getBook());
    }
}


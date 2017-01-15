package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by adaymesa on 15/01/2017.
 */
public class testBook {
    private final Book book = new Book("Think like a programmer", "V.Anton Spraul", "2012");

    @Test
    public void testgetTitle(){
        assertEquals(book.getTitle(), "Think like a programmer");
    }

    @Test
    public void testgetAuthor(){
        assertEquals(book.getAuthor(), "V.Anton Spraul");
    }

    @Test
    public void testGetYear(){
        assertEquals(book.getYear(), "2012");
    }
}

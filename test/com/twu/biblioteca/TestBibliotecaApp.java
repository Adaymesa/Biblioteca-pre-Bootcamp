package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by adaymesa on 13/01/2017.
 */
    public class TestBibliotecaApp {

        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        private final BibliotecaApp biblioteca = new BibliotecaApp();

        @Before
        public void setUpStream() {
            System.setOut(new PrintStream(outContent));
        }

        @Test
        public void testGreetings() {
            biblioteca.greetings();
            assertEquals("Welcome to Biblioteca!!", outContent.toString());
        }

        @Test
        public void testBookList() {
            biblioteca.bookList();
            assertTrue(outContent.toString().contains("The books that are available are:"));
            assertTrue(outContent.toString().contains("Think like a programmer"));
            assertTrue(outContent.toString().contains("V.Anton Spraul"));
            assertTrue(outContent.toString().contains("2012"));

        }
        @Test
        public void testMenu() {
            biblioteca.menu();
            assertTrue(outContent.toString().contains("\n\nYou are in the menu, write a number to choose sections:\n"));

        }


}

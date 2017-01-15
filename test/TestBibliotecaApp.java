package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

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
        public void greetings() {
            biblioteca.greetings();
            assertEquals("Welcome to Biblioteca!!\n", outContent.toString());
        }

}

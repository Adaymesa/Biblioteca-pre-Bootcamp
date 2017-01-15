package com.twu.biblioteca;

public class BibliotecaApp {

    private String[] books = {"Head First Java", "Extreme Programming", "Think like a programmer"};

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.greetings();
        biblioteca.bookList();
    }

    public static void greetings(){
        System.out.print("Welcome to Biblioteca!!");
    }

    public void bookList() {
        System.out.println("\n\nThe books that are available are:");
        System.out.println(getBooks());

    }

    public String getBooks() {
        return String.join("\n", books);
    }
}

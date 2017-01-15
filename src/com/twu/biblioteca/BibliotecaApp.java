package com.twu.biblioteca;

public class BibliotecaApp {

    private String[] books = {"Head First Java", "Extreme Programming", "Think like a programmer"};

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.greetings();
        biblioteca.menu();
    }

    public static void greetings(){
        System.out.print("Welcome to Biblioteca!!");
    }

    public static void menu() {
        System.out.println("\n\nYou are in the menu, choose one of the following sections:");


    }

    public void bookList() {
        System.out.println("The books that are available are:");
        System.out.println(getBooks());

    }

    public String getBooks() {
        return String.join("\n", books);
    }
}

package com.twu.biblioteca;
import java.util.List;
import java.util.Scanner;
import static java.util.Arrays.asList;

public class BibliotecaApp {

    private static List<Book> books = asList(
            new Book("Think like a programmer", "V.Anton Spraul", "2012"),
            new Book("Head First Java", "Bert Bates", "2003"),
            new Book("Object-Oriented Principles", "Nicholas C. Zakas", "2014")
    );

    private static String[] menuPaths = {"Book List"};

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.greetings();
        biblioteca.menu();
    }

    public void greetings() {
        System.out.print("Welcome to Biblioteca!!");
    }

    public void menu() {
        System.out.println("\n\nYou are in the menu, write a number to choose sections:");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < menuPaths.length; i++) {
            System.out.println(Integer.toString(i) + " - " + menuPaths[i]);
        }
        int option = input.nextInt();
        switch (option) {
            case 0: {
                bookList();
            break;
            }
            default: {
                System.out.println("Type a number!");
                menu();
            }
        }
    }

    public void bookList() {
        System.out.println("The books that are available are:");
        Helpers.printInColumns("TITLE", "AUTHOR", "YEAR");
        for (Book i : books) {
            Helpers.printInColumns(i.getTitle(), i.getAuthor(), i.getYear());
        }
    }
}

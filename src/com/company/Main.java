package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        List<Character> characterList = new ArrayList<>();

        dataPreparation(bookList, characterList);
        boolean loopWorks = true;
        while (loopWorks) {
            displayMenu();

            Scanner scanner = new Scanner(System.in);
            String options = scanner.nextLine();

            switch (options) {
                case "1":
                    searchByTittle(bookList);
                    break;
                case "2":
                    searchByType(bookList);
                    break;
                case "3":
                    System.out.println("What book would you like you to give");//to do
                    break;
                case "4":
                    System.out.println("exit");
                    loopWorks = false;
                    break;
                default:
                    System.out.println("option unavailable, please choose again");

            }
        }


    }

    private static void searchByTittle(List<Book> bookList) {
        System.out.println("Write the tittle of book that you're looking for");
        Scanner scanner1 = new Scanner(System.in);
        String tittle = scanner1.nextLine();
        for (Book book : bookList) {
            if (book.getTittle().equals(tittle)) {
                System.out.println(book.toString());
            }
        }
    }

    private static void searchByType(List<Book> bookList) {
        System.out.println("What type of books are you looking for?");
        Scanner scanner2 = new Scanner(System.in);
        String type = scanner2.nextLine();
        for (Book book : bookList) {
            if (String.valueOf(book.getTypeEnum()).equals(type)) {
                System.out.println(book.getTittle());
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Welcome to our library! How can I help you?\n" +
                "1.Search a book by tittle\n" +
                "2.Search books by type\n" +
                "3.I want to give my own book to the library\n" +
                "4.Exit");
    }

    private static void dataPreparation(List<Book> bookList, List<Character> characterList) {
        Character frodo = new Character("Frodo", "Baggins");
        characterList.add(frodo);
        Character gandalf = new Character("Gandalf", "TheGrey");
        characterList.add(gandalf);
        Character jasonB = new Character("Jason", "Bourne");
        characterList.add(jasonB);
        Book lordOfTheRings = new Book("Lord of the rings", typeEnum.fantasy, "Tolkien", List.of(gandalf));
        bookList.add(lordOfTheRings);
        Book bourne = new Book("Bourne's Ultimatum", typeEnum.action, "Robert Ludlum", List.of(jasonB));
        bookList.add(bourne);
    }
}

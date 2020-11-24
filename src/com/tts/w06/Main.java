package com.tts.w06;

public class Main {

    public static void main(String[] args) {
        smallTestOfTheBookClass();
        smallTestOfTheLibraryClass();
    }

    // Small test of the Book class
    public static void smallTestOfTheBookClass() {
        Book book = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + book.getTitle());
        System.out.println("Borrowed? (should be false): " + book.isBorrowed());
        book.borrowed();
        System.out.println("Borrowed? (should be true): " + book.isBorrowed());
        book.returned();
        System.out.println("Borrowed? (should be false): " + book.isBorrowed());
        System.out.println();
    }

    // Small test of the Library class
    public static void smallTestOfTheLibraryClass() {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        Library.printOpeningHours();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}

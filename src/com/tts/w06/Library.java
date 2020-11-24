package com.tts.w06;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final String address;
    private List<Book> books;

    public Library(String address) {
        this.address = address;
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void borrowBook(String bookTitle) {
        boolean existBook = false;
        for (Book book : this.books) {
            if (book.getTitle().equals(bookTitle)) {
                if (book.isBorrowed()) {
                    System.out.println("\tSorry, this book is already borrowed.");
                } else {
                    book.borrowed();
                    System.out.println("\tYou successfully borrowed " + bookTitle);
                }
                existBook = true;
                break;
            }
        }
        if (!existBook) {
            System.out.println("\tSorry, this book is not in our catalog.");
        }
    }

    public void returnBook(String bookTitle) {
        boolean existBook = false;
        for (Book book : this.books) {
            if (book.getTitle().equals(bookTitle)) {
                if (book.isBorrowed()) {
                    book.returned();
                    System.out.println("\tYou successfully returned " + bookTitle);
                } else {
                    System.out.println("\tSorry, this book is already returned.");
                }
                existBook = true;
                break;
            }
        }
        if (!existBook) {
            System.out.println("\tSorry, this book is not in our catalog.");
        }
    }

    public static void printOpeningHours() {
        System.out.println("\tLibraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println("\t" + this.address);
    }

    public void printAvailableBooks() {
        boolean existAvailableBooks = false;
        for (Book book : this.books) {
            if (!book.isBorrowed()) {
                existAvailableBooks = true;
                System.out.println("\t" + book.getTitle());
            }
        }
        if (!existAvailableBooks) {
            System.out.println("\tNo book in catalog.");
        }
    }
}

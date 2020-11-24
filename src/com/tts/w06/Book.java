package com.tts.w06;

public class Book {
    private final String title;
    private boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        this.title = bookTitle;
        this.borrowed = false;
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return this.borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method
        return this.title;
    }
}

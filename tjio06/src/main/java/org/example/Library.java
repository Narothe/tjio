package org.example;

import java.util.List;

class Library {

    private final BookManagement bookManagement;

    public Library(BookManagement bookManagement) {
        this.bookManagement = bookManagement;
    }

    public boolean borrowBook(String title) {
        System.out.println("Borrowing book: " + title);

        return bookManagement.removeBook(title);
    }

    public void returnBook(String title, String author, int year) {
        System.out.println("\nReturning book: " + title + " by " + author + " published in " + year);
        bookManagement.addBook(title, author, year);
    }

    public List<Book> books() {
        return bookManagement.allBooks();
    }
}
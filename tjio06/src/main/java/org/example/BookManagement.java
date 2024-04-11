package org.example;

import java.util.List;

interface BookManagement {

    void addBook(String title, String author, int year);

    boolean removeBook(String title);

    List<Book> allBooks();
}
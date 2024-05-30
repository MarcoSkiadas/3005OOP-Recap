package org.example;

import java.util.Arrays;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
    public void add(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
    }
    public void remove(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i] = books[books.length - 1];
                books[books.length - 1] = null;
                books = Arrays.copyOf(books, books.length - 1);
            }
        }
    }
}

package org.example.bookstore;

import java.util.List;

public class Basket {
    private Buyer buyer;
    private List<Book> selectedBooks;

    // Add new book to basket
    public void add(Book book) {
        // TODO :: add book to basket
        selectedBooks.add(book);
    }
}

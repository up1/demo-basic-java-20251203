package org.example.bookstore;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private Buyer buyer;
    private List<Book> selectedBooks;

    public Basket(){
        this.selectedBooks = new ArrayList<>();
    }

    // Add new book to basket
    public void add(Book book) {
        // TODO :: add book to basket
        selectedBooks.add(book);
    }

    public int getSize(){
        return this.selectedBooks.size();
    }
}

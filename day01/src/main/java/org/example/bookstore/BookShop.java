package org.example.bookstore;

public class BookShop {
    Basket basket = new Basket();

    public void addBookToBasket(Buyer buyer, Book book) {
        basket.add(book);
    }
}

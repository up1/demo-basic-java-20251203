package org.example.bookstore;

public class BookShop {
    private Basket basket = new Basket();

    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        Book b1 = new Book(1, "Porter 1", 8);
        Buyer somkiat = new Buyer();
        bookShop.addBookToBasket(somkiat, b1);
        // Check number of book in basket
        int size = bookShop.basket.getSize();
        System.out.println(size);
    }

    private void addBookToBasket(Buyer buyer, Book book) {
        basket.add(book);
    }
}

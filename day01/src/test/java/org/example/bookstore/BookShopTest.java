package org.example.bookstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookShopTest {

    @Test
    public void addOneBookToBasket(){
        BookShop bookShop = new BookShop();
        Book b1 = new Book(1, "Porter 1", 8);
        Buyer somkiat = new Buyer();
        bookShop.addBookToBasket(somkiat, b1);
        // Check number of book in basket
        int size = bookShop.basket.getSize();
        assertEquals(1, size);
    }

    @Test
    public void addTwoSameBookToBasket(){
        BookShop bookShop = new BookShop();
        Book b1 = new Book(1, "Porter 1", 8);
        Book b2 = new Book(1, "Porter 1", 8);
        Buyer somkiat = new Buyer();
        bookShop.addBookToBasket(somkiat, b1);
        bookShop.addBookToBasket(somkiat, b2);
        // Check number of book in basket
        int size = bookShop.basket.getSize();
        assertEquals(1, size);
    }

    @Test
    public void calculateMaxDiscount(){
        BookShop bookShop = new BookShop();
        Book b11 = new Book(1, "Porter 1", 8);
        Book b12 = new Book(1, "Porter 1", 8);
        Book b21 = new Book(2, "Porter 2", 8);
        Book b22 = new Book(2, "Porter 2", 8);
        Book b31 = new Book(3, "Porter 3", 8);
        Book b32 = new Book(3, "Porter 3", 8);
        Book b4 = new Book(4, "Porter 4", 8);
        Book b5 = new Book(5, "Porter 5", 8);
        Buyer somkiat = new Buyer();
        bookShop.addBookToBasket(somkiat, b11);
        bookShop.addBookToBasket(somkiat, b12);
        bookShop.addBookToBasket(somkiat, b12);

        Discount discount = new Discount();
        double maxDiscount = discount.calculateMaxDiscount(bookShop.basket);
        assertEquals(51.20, maxDiscount);
    }

}
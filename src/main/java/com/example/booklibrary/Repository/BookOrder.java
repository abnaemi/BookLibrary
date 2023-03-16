package com.example.booklibrary.Repository;


import com.example.booklibrary.Models.Book;
import com.example.booklibrary.Models.BookType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookOrder {



    List<Book> bookOrder;


    public BookOrder(List<Book> bookOrder) {

        Book bookOne = new Book("111", "The Book", "Max Mustermann", BookType.HARD_COVER);
        Book bookTwo = new Book("112", "The Book2", "Max Mustermann", BookType.HARD_COVER);
        Book bookThree = new Book("113", "The Book3", "Max Mustermann", BookType.HARD_COVER);

        bookOrder.add(bookOne);
        bookOrder.add(bookTwo);
        bookOrder.add(bookThree);


        this.bookOrder = bookOrder;
    }


    public List<Book> getBookOrder() {
        return bookOrder;
    }

    public Book getBook(String isbn) {
        for (Book book : bookOrder) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Book addBook(Book book){
        bookOrder.add(book);
        return  book;
    }

    public Book updateBook(Book book) {
        bookOrder.remove(book);
        bookOrder.add(book);
        return book;
    }

    public void removeProduct(String isbn) {
        for (Book book : bookOrder) {
            if (book.getISBN().equals(isbn)) {
                bookOrder.remove(book);
                return;
            }
        }

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookOrder bookOrder1)) return false;

        return getBookOrder() != null ? getBookOrder().equals(bookOrder1.getBookOrder()) : bookOrder1.getBookOrder() == null;
    }

    @Override
    public int hashCode() {
        return getBookOrder() != null ? getBookOrder().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "BookOrder{" +
                "bookOrder=" + bookOrder +
                '}';
    }
}
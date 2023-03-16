package src.main.java.com.example.booklibrary.Repository;

import src.main.java.com.example.booklibrary.Models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookOrder {



    List<Book> bookOrder;


    public BookOrder(List<Book> bookOrder) {
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

}}
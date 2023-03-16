package com.example.booklibrary;

import com.example.booklibrary.Models.Book;
import com.example.booklibrary.Models.BookType;
import com.example.booklibrary.Repository.BookOrder;
import com.example.booklibrary.Service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book bookOne = new Book("111", "The Book", "Max Mustermann", BookType.HARD_COVER);
        Book bookTwo = new Book("112", "The Book2", "Max Mustermann", BookType.HARD_COVER);
        Book bookThree = new Book("113", "The Book3", "Max Mustermann", BookType.HARD_COVER);
        List<Book> bookList = new ArrayList<>();
        bookList.add(bookOne);
        bookList.add(bookTwo);
        bookList.add(bookThree);

        BookOrder bookOrder = new BookOrder(bookList);
        LibraryService libraryService = new LibraryService(bookOrder);

        libraryService.addBookOrder(bookOrder);

        System.out.println(libraryService.addBookOrder(bookOrder));


    }

}

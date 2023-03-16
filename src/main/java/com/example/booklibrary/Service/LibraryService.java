package com.example.booklibrary.Service;

import com.example.booklibrary.Models.Book;
import com.example.booklibrary.Models.BookType;
import com.example.booklibrary.Repository.BookOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LibraryService {

    BookOrder bookOrder;


    public LibraryService(BookOrder bookOrder) {

        this.bookOrder = bookOrder;
    }

    public BookOrder getBookOrder() {
        return bookOrder;
    }

    public BookOrder addBookOrder(BookOrder bookOrder) {
        return this.bookOrder = bookOrder;
    }






}
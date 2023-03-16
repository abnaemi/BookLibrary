package com.example.booklibrary.Controller;

import com.example.booklibrary.Models.Book;
import com.example.booklibrary.Repository.BookOrder;
import com.example.booklibrary.Service.LibraryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public final class LibraryController {

    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/books")
    public BookOrder getAllBooks() {
        return libraryService.getBookOrder();
    }

    @GetMapping("/books/{id}")
    public Book getBookfromISBN(@PathVariable String id) {
        return libraryService.getBookOrder().getBook(id);
    }

}
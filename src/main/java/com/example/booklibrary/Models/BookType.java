package com.example.booklibrary.Models;


import org.springframework.stereotype.Service;

public enum BookType {
    SOFT_COVER("SC"),
    E_BOOK("EB"),
    HARD_COVER("HC"),
    AUDIO_BOOK("AB");

    private String bTyp;

    BookType ( String bTyp){
        this.bTyp = bTyp;
    }
    public String getbTyp(){
        return this.bTyp;
    }


}
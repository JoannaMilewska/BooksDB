package com.company;

import java.util.List;

public class Book {
    String tittle;


    typeEnum typeEnum;
    String author;
    List<Character> characterList;

    public Book(String tittle, typeEnum typeEnum, String author, List<Character> characterList) {
        this.tittle = tittle;
        this.typeEnum = typeEnum;
        this.author = author;
        this.characterList = characterList;
    }

    public String getTittle() {
        return tittle;
    }
    public typeEnum getTypeEnum() {
        return typeEnum;
    }


    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", typeEnum=" + typeEnum +
                ", author='" + author + '\'' +
                ", characterList=" + characterList +
                '}';
    }
}

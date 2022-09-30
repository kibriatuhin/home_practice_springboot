package com.example.home_practice_springboot.model;

import org.springframework.stereotype.Component;



public class Courses {
    private String bookName;
    private int bookId;

    public Courses() {
    }

    public Courses(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}

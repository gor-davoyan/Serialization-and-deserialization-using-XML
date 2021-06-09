package model;

import java.util.List;

public class User {
    private String name;
    private int year;
    private List<Book> books;

    public User(String name, int year, List<Book> books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", books=" + books +
                '}';
    }
}
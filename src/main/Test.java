package main;

import Service.UserService;
import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("Ad", "asd");
        Book b2 = new Book("qwwrq", "Java");
        Book b3 = new Book("ergwe", "C++");
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(b1, b2, b3));

        User user = new User("a1", 2000, books);
        String s = UserService.serializeXml(user);
        System.out.println(s);

        System.out.println(UserService.deSerializeXml(s));
    }
}

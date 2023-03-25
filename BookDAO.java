package com.lambda.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 500));
        books.add(new Book(201, "Hibernate", 199));
        books.add(new Book(301, "Spring", 899));
        books.add(new Book(401, "WebService", 999));
        books.add(new Book(501, "ChatGPT", 599));
        return books;
    }
}

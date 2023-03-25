package com.lambda.book;

import java.util.*;

public class BookService {
    public List<Book> getBooksinSortbyName(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new MyComparatorbyName());
        return books;
    }

    public List<Book> getBooksinSortbyID(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new MyComparatorbyID());
        return books;
    }

    public List<Book> getBooksinSortbyPages(){
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, new MyComparatorByPages());
        return books;
    }
}

class MyComparatorbyName implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2){
        return o1.getName().compareTo(o2.getName());
    }
}
class MyComparatorbyID implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2){
        return o1.getId() - o2.getId();
    }
}
class MyComparatorByPages implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2){
        return o1.getPages() - o2.getPages();
    }
}

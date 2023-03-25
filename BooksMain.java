package com.lambda.book;

public class BooksMain {
    public static void main(String[] args) {

        BookDAO bd = new BookDAO();
        BookService bs = new BookService();

        bd.getBooks();
        System.out.println(bd.getBooks().get(0).toString());
    }
}

package com.ferdi.demo.user.service;

import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;

import java.util.List;


public interface BookService {


    List<Book> getBooks();

    Book kaydet(Book book);

    Book getBook(Long id);
}

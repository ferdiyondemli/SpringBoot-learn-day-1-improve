package com.ferdi.demo.user.service;

import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import com.ferdi.demo.user.repo.BookRepo;
import com.ferdi.demo.user.repo.KullaniciRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;
    @Override
    public List<Book> getBooks(){

        return bookRepo.findAll();
    }

    @Override
    public Book kaydet(Book book) {
         return bookRepo.save(book);
    }

    @Override
    public Book getBook(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
}

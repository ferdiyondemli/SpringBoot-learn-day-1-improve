package com.ferdi.demo.user.controller;

import com.ferdi.demo.user.controller.dto.BookResponseDto;
import com.ferdi.demo.user.controller.mapper.BookTekMapper;
import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import com.ferdi.demo.user.service.BookService;
import com.ferdi.demo.user.service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {


private final BookService bookService;
@GetMapping
public List<Book> getBooks(){

    return bookService.getBooks();
}

@PostMapping()
public  Book kaydetBook(@RequestBody Book book){

    return  bookService.kaydet(book);
}


    @GetMapping("/{id}")
    public BookResponseDto getBook(@PathVariable Long id){

        return BookTekMapper.map(bookService.getBook(id)) ;
    }
    @GetMapping("3/{id}")
    public Book getBook3(@PathVariable Long id){

        return  bookService.getBook(id) ;
    }

}

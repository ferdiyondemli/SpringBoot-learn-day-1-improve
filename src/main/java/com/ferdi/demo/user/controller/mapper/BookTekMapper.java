package com.ferdi.demo.user.controller.mapper;

import com.ferdi.demo.user.controller.dto.BookResponseDto;
import com.ferdi.demo.user.controller.dto.KullaniciResponseDto;
import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;

public class BookTekMapper {

    public static BookResponseDto map(Book book){

        return  new BookResponseDto(book.getId(), book.getName(), book.getAuthor(), book.getKullanici());
    }

}

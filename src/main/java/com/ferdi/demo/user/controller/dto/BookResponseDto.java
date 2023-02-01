package com.ferdi.demo.user.controller.dto;

import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDto {

    Long id;
    String name;
    String author;

    Kullanici kullanici;
}

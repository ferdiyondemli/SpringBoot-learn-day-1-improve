package com.ferdi.demo.user.controller.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ferdi.demo.user.entity.Address;
import com.ferdi.demo.user.entity.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KullaniciResponseDto {

    Long id;
    String name;
    String surname;

    List<Book> books;
}

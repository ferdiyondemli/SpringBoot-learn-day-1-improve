package com.ferdi.demo.user.controller.mapper;

import com.ferdi.demo.user.controller.dto.KullaniciResponseDto;
import com.ferdi.demo.user.entity.Kullanici;

public class KullaniciTekMapper {

    public static  KullaniciResponseDto map(Kullanici kullanici){

        return  new KullaniciResponseDto(kullanici.getId(),kullanici.getName(),kullanici.getSurname(),kullanici.getBooks());
    }

}

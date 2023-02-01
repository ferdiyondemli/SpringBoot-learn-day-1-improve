package com.ferdi.demo.user.service;

import com.ferdi.demo.user.entity.Kullanici;

import java.util.List;


public interface KullaniciService {


    List<Kullanici> getKullanicilar();

    Kullanici kaydet(Kullanici kullanici);

    Kullanici getKullanici(Long id);
}

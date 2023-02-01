package com.ferdi.demo.user.service;

import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import com.ferdi.demo.user.repo.KullaniciRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class KullaniciServiceImpl implements KullaniciService {

    private final KullaniciRepo kullaniciRepo;
    @Override
    public List<Kullanici> getKullanicilar(){

        return kullaniciRepo.findAll();
    }

    @Override
    public Kullanici kaydet(Kullanici kullanici) {

         Kullanici k=new Kullanici();
        Book b=new Book();
        k.setName(kullanici.getName());
        k.setSurname(k.getSurname());
        k.setAddress(kullanici.getAddress());
        k.setBooks(kullanici.getBooks());

        b.setName(kullanici.getBooks().get(0).getName());
        b.setAuthor(kullanici.getBooks().get(0).getAuthor());
        b.setKullanici(kullanici.getBooks().get(0).getKullanici());

         return kullaniciRepo.save(kullanici);
    }

    @Override
    public Kullanici getKullanici(Long id) {
        return kullaniciRepo.findById(id).orElse(null);
    }
}

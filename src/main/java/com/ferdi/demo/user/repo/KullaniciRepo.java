package com.ferdi.demo.user.repo;

import com.ferdi.demo.user.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface KullaniciRepo extends JpaRepository<Kullanici, Long> {
}

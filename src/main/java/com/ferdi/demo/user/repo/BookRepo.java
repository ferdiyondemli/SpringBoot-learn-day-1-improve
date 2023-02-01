package com.ferdi.demo.user.repo;

import com.ferdi.demo.user.entity.Book;
import com.ferdi.demo.user.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Book, Long> {
}

package com.itauge.springbootvuetest.repository;

import com.itauge.springbootvuetest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}

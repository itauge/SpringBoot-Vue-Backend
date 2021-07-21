package com.itauge.springbootvuetest.repository;

import com.itauge.springbootvuetest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll(){
        System.out.println(bookRepository.findAll());
    }

    @Test
    void save(){
        Book book = new Book();
        book.setAuthor("您哈");
        book.setName("你好");
        Book save = bookRepository.save(book);
        System.out.println(save);
    }

    @Test
    void findById(){
        System.out.println(bookRepository.findById(1).get());
    }

}
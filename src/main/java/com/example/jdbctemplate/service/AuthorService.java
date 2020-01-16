package com.example.jdbctemplate.service;

import com.example.jdbctemplate.model.Author;

import java.util.List;

public interface AuthorService {
    int add(Author author);
    int update(Author author);
    void delete(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}

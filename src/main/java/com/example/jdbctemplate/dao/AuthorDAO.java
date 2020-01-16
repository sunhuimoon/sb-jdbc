package com.example.jdbctemplate.dao;

import com.example.jdbctemplate.model.Author;

import java.util.List;

/**
 * author数据持久化接口
 */
public interface AuthorDAO {
    int add(Author author);
    int update(Author author);
    void delete(Long id);
    Author findAuthor(long id);
    List<Author> findAuthorList();
}

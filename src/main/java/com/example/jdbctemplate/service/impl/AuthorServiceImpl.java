package com.example.jdbctemplate.service.impl;

import com.example.jdbctemplate.dao.AuthorDAO;
import com.example.jdbctemplate.model.Author;
import com.example.jdbctemplate.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
    private final AuthorDAO authorDAO;

    @Autowired
    public AuthorServiceImpl(AuthorDAO authorDAO){
        this.authorDAO = authorDAO;
    }


    @Override
    public int add(Author author) {
        return this.authorDAO.add(author);
    }

    @Override
    public int update(Author author) {
        return this.authorDAO.update(author);
    }

    @Override
    public void delete(Long id) {
        this.authorDAO.delete(id);
    }

    @Override
    public Author findAuthor(Long id) {
        return this.authorDAO.findAuthor(id);
    }

    @Override
    public List<Author> findAuthorList() {
        return this.authorDAO.findAuthorList();
    }
}

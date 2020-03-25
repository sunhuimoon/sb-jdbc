package com.example.jdbctemplate.service.impl;

import com.example.jdbctemplate.dao.AuthorDAO;
import com.example.jdbctemplate.model.Author;
import com.example.jdbctemplate.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//比如在一个Student实现类上加@Service(“student”)，
// 括号里面就是给实例化后的Student对象取个名字。
// 这是在一个接口有多个实现类的情况下区分实现类的方式。
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

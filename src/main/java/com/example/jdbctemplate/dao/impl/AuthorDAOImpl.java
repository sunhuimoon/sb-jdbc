package com.example.jdbctemplate.dao.impl;

import com.example.jdbctemplate.dao.AuthorDAO;

import com.example.jdbctemplate.model.Author;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class AuthorDAOImpl implements AuthorDAO {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Author author) {
        return jdbcTemplate.update(
                "insert into t_author(real_name,nick_name)values (?,?)",
                author.getRealName(),
                author.getNickName()
        );

    }

    @Override
    public int update(Author author) {
        return jdbcTemplate.update(
                "update  t_author set real_name = ?,nick_name=? where id =?",
                author.getRealName(),
                author.getNickName(),
                author.getId()
        );
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update(
                "delete  from t_author where id =?",
                id
        );
    }

    @Override
    public Author findAuthor(long id) {
        List<Author> list = jdbcTemplate.query(
                "select * from t_author where id = ?",
                new Object[]{id},
                new BeanPropertyRowMapper<>(Author.class)
        );
        if (!list.isEmpty()){
            return list.get(0);
        }else {
            return null;
        }
    }

    @Override
    public List<Author> findAuthorList() {
        List<Author> list = jdbcTemplate.query(
                "select * from t_author",
                new Object[]{},
                new BeanPropertyRowMapper<>(Author.class)
        );
        return list;
    }
}

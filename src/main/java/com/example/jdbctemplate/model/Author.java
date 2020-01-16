package com.example.jdbctemplate.model;

/**
 * 作者实体类
 */
public class Author {
    private Long id;
    private String realName;
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String toString(){
        return "Author{"+
                "id="+ id +
                ", realName' " + realName +'\''+
                ", nickName='" + nickName +'\''+
                '}';
    }
}

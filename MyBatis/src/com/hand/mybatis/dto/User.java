package com.hand.mybatis.dto;

import java.io.Serializable;

/**
 * Created by XIAOHAI on 2017/8/9.
 */
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String password;
    private Double count;

    public User() {
        super();
    }

    public User(String name, String password, Double count) {
        super();
        this.name = name;
        this.password = password;
        this.count = count;
    }

    public User(Integer id, String name, String password, Double count) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }
}
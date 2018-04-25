package com.hand.mybatis.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by XIAOHAI on 2017/8/10.
 */
public class FilmInfo implements Serializable {
private Integer id;
private String actor;
private String filmName;
private String length;
private String description;
private String lastName;
private Date updateTime;
private Date releaYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id; }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getReleaYear() {
        return releaYear;
    }

    public void setReleaYear(Date releaYear) {
        this.releaYear = releaYear;
    }
}

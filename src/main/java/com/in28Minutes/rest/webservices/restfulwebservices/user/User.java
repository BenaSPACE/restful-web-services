package com.in28Minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {

    private Integer id;
    private String name;

    /**
     * In the tutorial, it is written as birthDate, with a capital B, but here it is all lower case.
     */
    private Date birthdate;

    public User(Integer id, String name, Date birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("User [id=%s, name=%s, birthdate=%s]", id, name, birthdate);
    }
}

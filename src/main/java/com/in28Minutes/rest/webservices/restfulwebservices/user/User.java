package com.in28Minutes.rest.webservices.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class User {

    private Integer id;

    @JsonProperty("user_name")
    @Size(min=2, message = "Name requires at least 2 characters")
    private String name;

    /**
     * In the tutorial, it is written as birthDate, with a capital B, but here it is all lower case.
     */
    @JsonProperty("birth_date")
    @Past(message = "birthdate must be in the past")
    private LocalDate birthdate;

    public User(Integer id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
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

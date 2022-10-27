package com.in28Minutes.rest.webservices.restfulwebservices.versioning;

public class UserV2 {
    private Name name;

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public UserV2(Name name) {
        this.name = name;
    }
}

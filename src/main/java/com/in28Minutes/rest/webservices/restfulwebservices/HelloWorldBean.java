package com.in28Minutes.rest.webservices.restfulwebservices;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String toString(){
        return String.format("HelloWorldBean [message=%s]", message);
    }
}

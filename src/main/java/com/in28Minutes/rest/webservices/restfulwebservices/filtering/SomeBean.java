package com.in28Minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.*;

//@JsonIgnoreProperties("field1")
@JsonFilter("SomeBeanFilter")
public class SomeBean {
    private String field1;

    //@JsonIgnore
    private String field2;
    private String field3;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SomeBean{");
        sb.append("field1='").append(field1).append('\'');
        sb.append(", field2='").append(field2).append('\'');
        sb.append(", field3='").append(field3).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}

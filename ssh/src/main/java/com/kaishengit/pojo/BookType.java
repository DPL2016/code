package com.kaishengit.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_booktype")
public class BookType implements Serializable {
    private static final long serialVersionUID = -2697493222533915545L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String booktype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
}

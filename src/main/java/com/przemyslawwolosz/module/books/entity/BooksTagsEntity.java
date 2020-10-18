package com.przemyslawwolosz.module.books.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.przemyslawwolosz.module.books.entity.BooksEntity;

import javax.persistence.*;

@Entity
@Table(name = "books_tags")
@JsonIgnoreProperties("book")

public class BooksTagsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BooksEntity book;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BooksEntity getBook() {
        return book;
    }

    public void setBook(BooksEntity book) {
        this.book = book;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

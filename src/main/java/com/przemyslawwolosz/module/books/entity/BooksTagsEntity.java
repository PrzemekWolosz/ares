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

    public BooksTagsEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public BooksEntity getBook() {
        return book;
    }

    public BooksTagsEntity setBook(BooksEntity book) {
        this.book = book;
        return this;
    }

    public String getValue() {
        return value;
    }

    public BooksTagsEntity setValue(String value) {
        this.value = value;
        return this;
    }
}

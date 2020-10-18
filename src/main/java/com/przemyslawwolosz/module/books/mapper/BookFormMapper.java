package com.przemyslawwolosz.module.books.mapper;

import com.przemyslawwolosz.module.books.dto.BookForm;
import com.przemyslawwolosz.module.books.entity.BooksEntity;

public class BookFormMapper {

    public static BooksEntity map(BookForm form) {
        return new BooksEntity()
                .setAuthor(form.getAuthor())
                .setTitle(form.getTitle());

    }
}

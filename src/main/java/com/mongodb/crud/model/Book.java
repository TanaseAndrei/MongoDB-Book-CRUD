package com.mongodb.crud.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Book")
public class Book {

    @Id
    private long id;
    private String bookName;
    private String authorName;
}

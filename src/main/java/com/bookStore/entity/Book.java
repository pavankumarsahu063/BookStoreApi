package com.bookStore.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("title")
    @Column(nullable = false)
    private String title;

    @JsonProperty("author")
    @Column(nullable = false)
    private String author;

    @JsonProperty("price")
    @Column(nullable = false)
    private double price;

    @JsonProperty("category")
    @Column(nullable = false)
    private String category;
}

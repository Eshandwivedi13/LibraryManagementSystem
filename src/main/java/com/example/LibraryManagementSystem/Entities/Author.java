package com.example.LibraryManagementSystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//read the details from book / student / card
    private Integer authorId;

    private String authorName;

    private Integer age;

    @Column(unique = true)
    private String email;

    private Date publishedDate;


}

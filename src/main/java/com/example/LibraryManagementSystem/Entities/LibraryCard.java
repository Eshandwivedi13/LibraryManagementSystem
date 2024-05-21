package com.example.LibraryManagementSystem.Entities;

import Enums.CardStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//A foregin key is in the child class only
@Entity
@Table(name = "library card")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {
    @Id
    private Integer cardId;

    private CardStatus cardStatus;//its Enum - special datatype is case sensitive and it can have predefined values only

    private int noOfBooksIssued;


}

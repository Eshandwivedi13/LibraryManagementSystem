package com.example.LibraryManagementSystem.Entities;

import Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//A foregin key is in the child class only
@Entity//Entities are representation of a tables, changes made in it gets reflected in table also
@Table(name = "library_card")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {
    @Id//this @Id is compulsory, its for unique key
    //@GeneratedValue annotation means => this is system driven value(auto generated) where strategy = generateType.Identity (4 diff types of strategies are there)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity means (natural numbers keeps on auto incrementing i.e 1 2 3 4)
    private Integer cardId;

    //InOrder to make mySQl understand that its a custom datatype, there's an annotation @Enumrated tells this is enum... aur hum isko bolte hai value rakhlo = EnumType.STring
    @Enumerated(value = EnumType.STRING)//NOTE => This annotation is for mySQL to understand customDatatype and store is as String format inside the db
    private CardStatus cardStatus;//its Enum - special datatype is case sensitive and it can have predefined values only

    private int noOfBooksIssued;


    //Library card should have the foreign key column cuz this is the child class
    //fkey column comes in the child table using this annotation - @JOINCOLUMN
    @JoinColumn //i want to have a new col in child table librarycard,  so join the col....
    @OneToOne //with one to one mapping
    private Student student;//from student entity
    //Basically primary key of student table gets stored as fkey in libraryCard table(Entitiy ka 1 col add ho jata hai pkey wala)




}

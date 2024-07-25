package com.example.LibraryManagementSystem.Entities;

import Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "book")
public class Book {
    /*pkey is the part of table, user should not enter the value of bookId(i.e. pkey) => Maybe user enter wrong value so clien se nhi lena chahiye.... System se generate karna chahiye
    pkey => should be System Driven value/Auto Generated value(Auto increment hoti rehti hai)  ==> Its very important for us, secure rehna chahiye*/

    @Id//this @Id is compulsory, its for unique key
    //@GeneratedValue annotation means => this is system driven value(auto generated) where strategy = generateType.Identity (4 diff types of strategies are there)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity means (natural numbers keeps on auto incrementing i.e 1 2 3 4)
    private Integer bookId;

    @Column(unique = true)//this makes sure that bookName must be unique(if duplicates value store kari so DB throws exception that(db is not accepting this value)
    private String bookName;

    @Enumerated(value = EnumType.STRING)//whats enum - check in libraryCard entity
    private Genre bookGenre;

    private Integer noOfPages;

    private Integer price;
    //we'll connect author and bookTable so need to store authorName explicitly, authorId store karenge aur usse bookId nikaal lenge(SAVES SPACE ETC..)

    //referencedColumnName = "email"
    @JoinColumn() //i want to have a new col in child table librarycard,  so join the col....  NOTE here => We can also join col on basis of uniqueCol with (refrencedColumnName = "email")
    @ManyToOne //with one to one mapping
    private Author author;//from student entity
//when you start server, you'll see in the book table(entitiy) a newCol will be added that is the pkey of authorEntity




}

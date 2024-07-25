package com.example.LibraryManagementSystem.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
NOte =>  1) @Entity wala class should have empty constructor always
         2) should have @Id(as pkey)
         3) as soon as server starts it checks if entity annotation is there, if founds then create tables itself in db
         4) the moment  you do changes here(@entity mei), gets reflected in db also
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //It defines that this particular class is Entity, its compulsory to write if its entity......defines the structure for the table in DB
@Table(name = "student")//if you dont give custom table name, then default class name is the tableName
public class Student {

    @Id//this @Id is compulsory, its for unique key
    //@GeneratedValue annotation means => this is system driven value(auto generated) where strategy = generateType.Identity (4 diff types of strategies are there)
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identity means (natural numbers keeps on auto incrementing i.e 1 2 3 4)
    private Integer studentId;


    private String name;

    private String branch;

    private double cgpa;

    private Integer phoneNumber;

}

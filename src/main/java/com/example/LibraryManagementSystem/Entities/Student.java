package com.example.LibraryManagementSystem.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
NOte =>  1) @Entity wala class should have empty constructor always
         2) should have @Id(as pkey)
         3) as soon as server starts it checks if entity anot. is there, if founds then create tables itself in db
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
    private Integer studentRollNo;
    private String name;

    private String branch;

    private double cgpa;

}

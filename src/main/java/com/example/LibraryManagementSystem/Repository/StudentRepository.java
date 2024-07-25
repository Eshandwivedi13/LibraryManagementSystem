package com.example.LibraryManagementSystem.Repository;

import com.example.LibraryManagementSystem.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Note => 1) Entities are taking care of table creation
           2) JPA repo interface is taking care of execution of queries
           3) 1 Table is connected to a Repository Layer(All operations/queries usi Entity ki hogi jo connect ki hai)
           4) 1 time pe 1 hi Entity le payega its generic class, so 1 table - 1 repository

           Def of JPA/Hibernate - On notes(Day 3)
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {//We need to extend parentInterface(JPA helps for dbQueries)
    //we also need to tell, connecting with which Entity and what is the datatype of that Entity's pkey.... Jpa takes it in generic manner





}

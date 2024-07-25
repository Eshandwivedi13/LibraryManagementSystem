package com.example.LibraryManagementSystem.Repository;

import com.example.LibraryManagementSystem.Entities.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<LibraryCard, Integer> {//lcard entity, and pkey of this entity is of integer type
//Note => Entities and Repository layer are connected, Entities hi DB mei jayengi aur Entity Object hi dB se ayega


}

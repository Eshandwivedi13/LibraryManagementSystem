package com.example.LibraryManagementSystem.Services;

import Enums.CardStatus;
import com.example.LibraryManagementSystem.Entities.LibraryCard;
import com.example.LibraryManagementSystem.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LibraryCardService {
    @Autowired
    private CardRepository cardRepository;
    public String getFreshCard(){
        //Note => Entities Obj hi DB mei jayena aur Entity Object hi dB se ayega(Entities aur ReposLayer connected hai and Entitiy also reflection of DB)
        LibraryCard newCard = new LibraryCard();// this is Entity Object
        newCard.setCardStatus(CardStatus.NEW);
        newCard.setNoOfBooksIssued(0);//freshCard, initially its obviously 0...even if we dont set
        LibraryCard savedCard = cardRepository.save(newCard);//we need to save the card in dB, save not only saveEntity... it also return entity

        return "New Card with Card No " + savedCard.getCardId() + " has been generated";

    }
}

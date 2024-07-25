package com.example.LibraryManagementSystem.Controllers;

import com.example.LibraryManagementSystem.Entities.LibraryCard;
import com.example.LibraryManagementSystem.Services.LibraryCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class LibraryCardController {
    @Autowired
    private LibraryCardService cardService;
    @PostMapping("/generateACard")//its optional to write "/addCard" or "addCard" automatically addes /
    public String addCard(){
        String res = cardService.getFreshCard();
        return res;
    }
}

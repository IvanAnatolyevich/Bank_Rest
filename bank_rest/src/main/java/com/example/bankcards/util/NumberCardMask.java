package com.example.bankcards.util;

public class NumberCardMask {
    public static String mask(String cardNumber) {
        String newCard = "";
        for (int i = 0; i < 3; i++) {
            newCard = newCard + "**** ";
        }
        newCard += cardNumber.substring(cardNumber.length()-4);
        return newCard;
    }
}

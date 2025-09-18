package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void sortDeck() {
        Collections.sort(cards);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}

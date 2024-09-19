package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


/**
 * A class that is a representation of a deck of cards. It has
 * functionalities such as shuffling, sorting, drawing a card, seeing if the deck is empty.
 * It implements CardSource to find a card, and Iterable as to allow iteration in the deck.
 */

public class Deck implements CardSource, Iterable<Card> {
    private final List<Card> aCards = new ArrayList<>();

    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Sorts the cards as defined in the Card class
     */

    public void sort() {
        Collections.sort(this.aCards);
    }

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }

    /**
     * Returns an iterator for the cards in the deck
     * @return an Iterator for the list of cards
     */

    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }
}

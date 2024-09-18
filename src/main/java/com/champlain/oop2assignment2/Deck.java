package com.champlain.oop2assignment2;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }


    /**
     * uses the comparable in java to sort all the cards, first by suit, then rank
     * see method compareTo in class Card to see how it is sorted.
     * @author Samantha
     */
    public void sort(){
        Collections.sort(this.aCards);
    }

    /**
     * method that uses an iterator for the type cards
     * @return an iterator for the list called aCards
     */
    @Override
    public Iterator<Card> iterator() {
        return aCards.iterator();
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
}

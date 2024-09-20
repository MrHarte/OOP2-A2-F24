package com.champlain.oop2assignment2;

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

    public void sort(){
        Collections.sort(this.aCards);
    }


    public Card draw() {
        if(this.aCards.isEmpty()) {
            throw new IllegalStateException("Cannot draw a card because the deck is empty");
        }
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }



    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }
}

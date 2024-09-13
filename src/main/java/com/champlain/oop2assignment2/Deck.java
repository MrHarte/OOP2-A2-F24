package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck implements CardSource {
    /**
     * This is a final list that holds all the {@link Card} objects in the {@code Deck}.
     */
    private final List<Card> aCards;

    /**
     * It iterates over all possible {@link Rank} and {@link Suit} combinations and
     * adds each card to the {@code aCards} list.
     */
    public Deck() {
        aCards = new ArrayList<>();
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
     * Sorts the deck of cards. The sorted order prioritizes suits and ranks.
     */
    public void sort() {
        Collections.sort(this.aCards);
    }

    public Card draw() {
        int last = this.aCards.size() - 1;
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
}

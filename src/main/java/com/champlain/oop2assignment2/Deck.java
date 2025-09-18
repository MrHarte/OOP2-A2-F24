package com.champlain.oop2assignment2;

import java.util.*;

public class Deck implements CardSource, Shufflable, Sortable, Iterable<Card> {
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

    public void sort() {
        this.aCards.sort(new SuitFirstComparator());
    }

    public Iterator<Card> iterator() {
        return this.aCards.iterator();
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

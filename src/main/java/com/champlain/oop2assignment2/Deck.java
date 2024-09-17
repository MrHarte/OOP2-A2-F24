package com.champlain.oop2assignment2;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Collections;

public class Deck implements CardSource {
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

    private void sort() (Collections aCards) {
        Collection.sort(aCards, new SuitFirstComparator());
        Collection.sort(aCards, new RankFirstComparator());
    }

    public Iterator<Card> getCards(){
        return this.aCards.iterator();
    }
}

package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import static com.champlain.oop2assignment2.DeckController.cardMessage;

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

    //method to use sort collection
    public void sort() {
        Collections.sort(this.aCards);
    }

    public void ShowCards() {
        Iterator<Card> itCard = this.aCards.iterator();
        while (itCard.hasNext()) {
            Card card = itCard.next();
            cardMessage(card);
        }
    }
}

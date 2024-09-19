package com.champlain.oop2assignment2;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

import static com.champlain.oop2assignment2.DeckController.CardMessage;

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
        if (this.aCards.isEmpty()) {
            Alert e = new Alert(Alert.AlertType.WARNING);
            e.setContentText("There are no cards to sort.");
            e.showAndWait();
        } else {
            Collections.sort(this.aCards);
        }

    }

    public void ShowCards() {
        if (this.aCards.isEmpty()) {
            Alert e = new Alert(Alert.AlertType.WARNING);
            e.setContentText("There are no cards to show.");
            e.showAndWait();
        } else {
            Iterator<Card> itCard = this.aCards.iterator();
            while (itCard.hasNext()) {
                Card card = itCard.next();
                CardMessage(card);
            }
        }
    }
}

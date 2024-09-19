package com.champlain.oop2assignment2;

import javafx.scene.control.Alert;

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

    /**
     * Sorts a deck of cards by suit, then rank.
     */
    public void sort() {
        if (this.aCards.isEmpty()) {                        // Makes sure there's an existing deck to sort.
            Alert e = new Alert(Alert.AlertType.WARNING);
            e.setContentText("There are no cards to sort.");
            e.showAndWait();
        } else {
            Collections.sort(this.aCards);
        }

    }

    /**
     * Iterates through a deck of cards, displaying each card's rank and suit on an alert message.
     */
    public void showCards() {
        if (this.aCards.isEmpty()) {                        // Makes sure there are existing cards to display.
            Alert e = new Alert(Alert.AlertType.WARNING);
            e.setContentText("There are no cards to show.");
            e.showAndWait();
        } else {
            Iterator<Card> itCard = this.aCards.iterator(); // Declare new iterator for the deck of cards.
            while (itCard.hasNext()) {
                Card card = itCard.next();
                cardMessage(card);                          // Send card info to cardMessage method.
            }
        }
    }
}

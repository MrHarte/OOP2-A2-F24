package com.champlain.oop2assignment2;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * This class represents a deck of cards.
 * It implements {@link CardSource} and {@link Iterable} to provide card-related functionality.
 */
public class Deck implements CardSource, Iterable<Card> {
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

    /**
     * Draws a card from the deck.
     * Removes and returns the last {@link Card} from the deck.
     *
     * @return the drawn {@link Card}
     * @throws IllegalStateException if the deck is empty
     */
    public Card draw() {
        if (isEmpty()) {
            throw new IllegalStateException("The Deck is empty");
        } else {
            int last = this.aCards.size() - 1;
            Card myCard = this.aCards.get(last);
            this.aCards.remove(last);
            return myCard;
        }
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
     * Shows a confirmation alert for each card in the list.
     * Goes through all the cards and shows an alert with the card's details.
     */
    public void show() {
        for (Card card : this) {
            Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION, card.toString());
            confirmation.showAndWait();
        }
    }

    /**
     * Returns an iterator over the cards in the deck.
     *
     * @return an {@link Iterator} of {@link Card}
     * @Override This overrides the iterator() method from the Iterable interface.
     */
    @Override
    public Iterator<Card> iterator() {
        return aCards.iterator();
    }
}

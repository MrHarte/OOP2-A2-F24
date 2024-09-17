package com.champlain.oop2assignment2;

import javafx.scene.control.Alert;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The {@code Deck} class represents a standard deck of playing cards.
 * It implements {@link CardSource} and {@link Iterable<Card>} to provide card source functionality
 * and iteration over the deck of cards.
 */
public class Deck implements CardSource, Iterable<Card> {

    /** List to hold the cards in the deck. */
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Constructs a {@code Deck} and initializes it with a standard set of 52 cards.
     * Each card is created with all possible combinations of {@link Rank} and {@link Suit}.
     */
    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Shuffles the deck of cards using a randomized algorithm.
     */
    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Sorts the cards in the deck based on their rank and suit.
     * If the deck is empty, an error alert is shown.
     */
    public void sort() {
        if (this.aCards.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No Cards in Deck");
            alert.showAndWait();
        } else {
            Collections.sort(this.aCards);
        }
    }

    /**
     * Draws the top card from the deck (the last card in the list),
     * removes it from the deck, and returns it.
     *
     * @return the drawn card
     */
    public Card draw() {
        int last = this.aCards.size() - 1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    /**
     * Checks if the deck is empty (i.e., contains no cards).
     *
     * @return {@code true} if the deck is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns a string representation of the deck, with each card's string representation on a new line.
     *
     * @return a string representation of the deck
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }

    /**
     * Returns an iterator over the cards in the deck.
     *
     * @return an iterator over the cards in the deck
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }
}

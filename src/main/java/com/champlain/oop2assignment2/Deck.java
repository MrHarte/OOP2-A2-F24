package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a deck of cards in a card game.
 * Implements Iterable<Card> to allow iteration over the deck's cards.
 */
public class Deck implements CardSource, Iterable<Card> {
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Constructs a standard deck of cards with all ranks and suits.
     * @since 9/19/2024 1:16 pm
     */
    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Shuffles the deck using a random algorithm.
     */
    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Sorts the deck by rank first, then by suit.
     */
    public void sort() {
        Collections.sort(this.aCards);
    }

    /**
     * Draws a card from the deck. Removes the last card from the deck.
     * @return The drawn card.
     * @throws IllegalStateException if the deck is empty.
     */
    public Card draw() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty deck.");
        }
        int last = this.aCards.size() - 1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    /**
     * Checks if the deck is empty.
     * @return True if the deck has no cards; otherwise, false.
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Provides an iterator over the deck's cards.
     * @return An iterator for the deck's cards.
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    /**
     * Returns a string representation of the deck with each card on a new line.
     * @return A string representing the deck.
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }
}

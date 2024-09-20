package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * The {@code Deck} class represents a deck of playing cards. It provides methods
 * to shuffle, sort, draw cards and check if the deck is empty. The deck is initialized
 * with a standard set of cards, one for each rank and suit combination
 */
public class Deck implements CardSource, Iterable<Card> {
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Constructs a full deck of 52 cards, one for each combination of rank and suit
     */
    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Shuffles the cards in the deck randomly
     * Throws an {@code IllegalStateException}
     * if the deck is empty
     */
    public void shuffle() {
        if (aCards.isEmpty()) {
            throw new IllegalStateException("Can't shuffle an empty deck");
        }
        Collections.shuffle(aCards);
    }

    /**
     * Sorts the cards in the deck by suit and rank using the order of the {@code Card} class.
     */
    public void sort () {
        Collections.sort(this.aCards);
    }

    /**
     * Draws the top card from the deck and removes it from the deck
     * Throws an {@code IllegalStateException} if the deck is empty
     * @return the top card of the deck
     */
    public Card draw() {
        if (aCards.isEmpty()) {
            throw new IllegalStateException(" Can't draw from an empty deck");

        }
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    /**
     * Checks if the deck is empty
     *
     * @return {@code true} if the deck is empty,
     * {@code false} if not
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this deck
     * This allows the deck to be used in a for-each loop to iterate over all its cards
     * @return an iterator over the cards in the deck
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    /**
     * Returns a string representation of the deck of cards,
     * with each card represented on a new line.
     *
     * @return a string representing the deck of cards
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }
}

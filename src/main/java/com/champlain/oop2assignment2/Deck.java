package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Class representing a deck of cards and its actions.
 *
 * <p>
 *     The class implements the {@link CardSource} interface and the
 *     {@link Iterable} interface.
 * </p>
 */
public class Deck implements CardSource, Iterable<Card> {
    /**
     * ArrayList representing the deck of cards.
     *
     * <p>
     *     Made private to restrain its modification.
     * </p>
     */
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Class constructor filling the empty deck with all the 52 possible cards.
     */
    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Method to shuffle the deck.
     *
     * <p>
     *     The method includes the shuffle method from the Collections class.
     * </p>
     */
    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Method to draw a card
     *
     * <p>
     *     The method draws the last card in the deck and remove it since
     *     it's not part of the deck anymore.
     * </p>
     *
     * @return the last card in the deck.
     */
    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    /**
     * Method to verify the state of the deck (empty or not empty).
     *
     * @return true if the deck is empty, false if it is not empty.
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Method to sort the deck of cards
     *
     * <p>
     *     The method uses the sort method from the Collections class.
     * </p>
     */
    public void sort() {
        Collections.sort(aCards);
    }

    /**
     * Method to generate all the names of the cards in the deck.
     *
     * @return a String block of the names of the cards in the deck.
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }

    /**
     * Method to iterate through the cards in the deck.
     *
     * @return an iterator over the cards in the deck in proper sequence.
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }
}

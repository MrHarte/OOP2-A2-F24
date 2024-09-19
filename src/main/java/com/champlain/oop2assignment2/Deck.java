package com.champlain.oop2assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * Represents a deck of playing cards, with all possible card combinations.
 *
 * <p>
 * The {@code Deck} class allows the shuffling, and drawing of the deck,
 * checking if the deck is empty, and the sorting of the cards by suit and rank.
 * Implements the {@code Iterable<Card>} interface to allow iteration
 * over the cards.
 * </p>
 */
public class Deck implements CardSource, Iterable<Card> {
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

    /**
     * Sorts the deck first by suit in order from:
     * Clubs, Diamonds, Spades, Hearts. Then, for cards of the same
     * suit, sorts them by rank in order from: Ace, Two, Three, ...,
     * Jack, Queen, King.
     * <p>
     * This method uses the {@link java.util.Collections#sort(List)} method to
     * sort the deck.
     * </p>
     */
    public void sort() {
        Collections.sort(this.aCards);
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


    /**
     * Returns an iterator over the cards in the deck.
     * <p>
     * The iteration order follows the current state of the deck, if the
     * deck is shuffled or sorted, the iterator will follow that order.
     * </p>
     *
     * @return An iterator for iterating over the cards in the deck.
     */
    @Override
    public Iterator<Card> iterator() {
        return this.aCards.iterator();
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Card currentCard : this.aCards) {
            result.append(currentCard.toString()).append("\n");
        }
        return result.toString();
    }
}

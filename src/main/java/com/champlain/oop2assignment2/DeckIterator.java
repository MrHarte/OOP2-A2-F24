package com.champlain.oop2assignment2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * An iterator for the {@link Deck} class.
 * Iterates over a list of {@link Card} objects.
 */
public class DeckIterator implements Iterator<Card> {
    private final List<Card> cards;
    private int currentIndex = 0;

    /**
     * Constructs a new DeckIterator for the specified list of cards.
     *
     * @param cards The list of cards to iterate over. Cannot be null.
     */
    public DeckIterator(List<Card> cards) {
        if (cards == null) {
            throw new IllegalArgumentException("Cards list cannot be null.");
        }
        this.cards = cards;
    }

    /**
     * Checks if there are more cards to iterate over.
     *
     * @return {@code true} if there are more cards to iterate over, otherwise {@code false}.
     */
    @Override
    public boolean hasNext() {
        return currentIndex < cards.size();
    }

    /**
     * Returns the next card in the iteration.
     *
     * @return The next {@link Card} in the iteration.
     * @throws NoSuchElementException if there are no more cards to iterate over.
     */
    @Override
    public Card next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more cards to iterate over.");
        }
        return cards.get(currentIndex++);
    }
}
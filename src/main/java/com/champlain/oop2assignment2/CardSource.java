package com.champlain.oop2assignment2;

/**
 * Interface for any source of cards in a card game (e.g. decks, stacks, hands ...)
 * Allows the user to draw from it and check if it is empty.
 */
public interface CardSource {
    /**
     * +
     * Returns a card from the source.
     *
     * @return The next available card.
     * @pre !isEmpty()
     */
    Card draw();

    /**
     *
     * @return True if there is no card in the source.
     */
    boolean isEmpty();
}

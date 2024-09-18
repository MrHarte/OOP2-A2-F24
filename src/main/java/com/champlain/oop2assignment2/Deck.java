package com.champlain.oop2assignment2;

import java.util.*;

/**
 * Represents a deck of playing cards.
 * This class provides functionality to shuffle, draw, sort, and iterate over a deck of cards.
 */
public class Deck implements CardSource, Iterable<Card> {
    private final List<Card> aCards = new ArrayList<>();

    /**
     * Constructs a new deck of 52 playing cards.
     */
    public Deck() {
        for (Rank currentRank : Rank.values()) {
            for (Suit currentSuit : Suit.values()) {
                this.aCards.add(new Card(currentRank, currentSuit));
            }
        }
    }

    /**
     * Shuffles the deck.
     */
    public void shuffle() {
        Collections.shuffle(this.aCards);
    }

    /**
     * Draws the top card from the deck.
     *
     * @return The drawn card.
     * @pre !isEmpty()
     */
    public Card draw() {
        if (isEmpty()) {
            throw new NoSuchElementException("The deck is empty.");
        }
        int last = this.aCards.size() - 1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;
    }

    /**
     * Checks if the deck is empty.
     *
     * @return True if the deck is empty, otherwise false.
     */
    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }

    /**
     * Returns an iterator over the cards in this deck.
     *
     * @return An iterator over the cards in this deck.
     */
    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator(this.aCards);
    }

    /**
     * Returns a string representation of the deck. Each card in the deck is represented by a string on a new line.
     *
     * @return A string representation of the deck.
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
     * Sorts the deck using the specified comparator.
     *
     * @param comparator The comparator to determine the order of the deck.
     * @throws IllegalArgumentException if the comparator is null.
     */
    public void sortDeck(Comparator<Card> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Comparator cannot be null");
        }
        this.aCards.sort(comparator);
    }

    /**
     * Sorts the deck by rank.
     */
    public void sortDeckByRank() {
        Comparator<Card> rankComparator = new ComparableRank();
        sortDeck(rankComparator);
    }

    /**
     * Sorts the deck by suit.
     */
    public void sortDeckBySuit() {
        Comparator<Card> suitComparator = new ComparableSuit();
        sortDeck(suitComparator);
    }

    /**
     * DeckIterator is an iterator over the cards in a Deck.
     */
    private static class DeckIterator implements Iterator<Card> {
        private final List<Card> cards;
        private int currentIndex = 0;

        /**
         * Constructs a new DeckIterator for the specified list of cards.
         *
         * @param cards The list of cards to iterate over.
         */
        public DeckIterator(List<Card> cards) {
            this.cards = cards;
        }

        /**
         * Returns true if there are more cards to iterate over.
         *
         * @return True if there are more cards to iterate over.
         */
        @Override
        public boolean hasNext() {
            return currentIndex < cards.size();
        }

        /**
         * Returns the next card in the iteration.
         *
         * @return The next card in the iteration.
         * @throws NoSuchElementException if there are no more cards.
         */
        @Override
        public Card next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return cards.get(currentIndex++);
        }
    }
}
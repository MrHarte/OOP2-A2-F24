package com.champlain.oop2assignment2;
/**
 * Represents a playing card with a rank and suit.
 * This class implements the Comparable interface to allow for natural ordering by suit and rank.
 */
public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;

    /**
     * Constructs a new Card with the given rank and suit.
     *
     * @param rank The rank of the card.
     * @param suit The suit of the card.
     * @throws IllegalArgumentException if either rank or suit is null.
     */
    public Card(Rank rank, Suit suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException("Rank and Suit cannot be null.");
        }
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns the rank of the card.
     *
     * @return The rank of the card.
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * Returns the suit of the card.
     *
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Returns a string representation of the card in the format "Rank of Suit".
     *
     * @return A string representation of the card.
     */
    @Override
    public String toString() {
        return this.rank + " of " + this.suit;
    }

    /**
     * Compares this card to another card for ordering. Cards are compared first by suit and then by rank.
     *
     * @param other The card to be compared.
     * @return A negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card.
     */
    @Override
    public int compareTo(Card other) {
        if (this.suit == other.suit) {
            return this.rank.compareTo(other.rank);
        }
        return this.suit.compareTo(other.suit);
    }
}
package com.champlain.oop2assignment2;

/**
 * Represents a playing card with a rank and suit.
 * This class implements the Comparable interface to allow for natural ordering by suit and rank.
 */
public class Card implements Comparable<Card> {
    private final Suit aSuit;
    private final Rank aRank;

    /**
     * Constructs a new Card with the given rank and suit.
     *
     * @param pRank The rank of the card.
     * @param pSuit The suit of the card.
     * @throws IllegalArgumentException if either pRank or pSuit is null.
     */
    public Card(Rank pRank, Suit pSuit) {
        if (pRank == null || pSuit == null) {
            throw new IllegalArgumentException("Rank and Suit cannot be null.");
        }
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    /**
     * Returns the rank of the card.
     *
     * @return The rank of the card.
     */
    public Rank getRank() {
        return this.aRank;
    }

    /**
     * Returns the suit of the card.
     *
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return this.aSuit;
    }

    /**
     * Returns a string representation of the card in the format "Rank of Suit".
     *
     * @return A string representation of the card.
     */
    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    /**
     * Compares this card to another card for ordering. Cards are compared first by suit and then by rank.
     *
     * @param other The card to be compared.
     * @return A negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card.
     */
    @Override
    public int compareTo(Card other) {
        if (this.aSuit == other.aSuit) {
            return this.aRank.compareTo(other.aRank);
        }
        return this.aSuit.compareTo(other.aSuit);
    }
}
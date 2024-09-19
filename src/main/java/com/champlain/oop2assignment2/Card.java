package com.champlain.oop2assignment2;

/**
 * Represents a playing card with a suit and rank.
 * Implements Comparable<Card> to allow sorting of cards.
 */
public class Card implements Comparable<Card> {
    private final Suit aSuit;
    private final Rank aRank;

    /**
     * Constructs a Card with the specified rank and suit.
     *
     * @param pRank The rank of the card.
     * @param pSuit The suit of the card.
     */
    public Card(Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return The rank of the card.
     */
    public Rank getRank() {
        return this.aRank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return this.aSuit;
    }

    /**
     * Returns a string representation of the card.
     * The string is in the format "Rank of Suit" (e.g., "Ace of Spades").
     *
     * @return A string representing the card.
     */
    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    /**
     * Compares this card with another card for order.
     * The comparison is based on rank first, and if ranks are equal, then by suit.
     *
     * @param other The card to be compared.
     * @return A negative integer, zero, or a positive integer as this card is less than,
     *         equal to, or greater than the specified card.
     */
    @Override
    public int compareTo(Card other) {
        // Compare by rank first
        int suitComparison = this.aSuit.compareTo(other.aSuit);
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If ranks are the same, compare by suit
        return this.aRank.compareTo(other.aRank);
    }
}

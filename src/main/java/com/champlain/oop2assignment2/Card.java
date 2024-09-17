package com.champlain.oop2assignment2;

/**
 * The {@code Card} class represents a playing card with a suit and a rank.
 * It implements {@link Comparable<Card>} to allow sorting and comparison of cards.
 */
public class Card implements Comparable<Card> {

    /** The suit of the card (e.g., Hearts, Spades). */
    private final Suit aSuit;

    /** The rank of the card (e.g., Ace, 2, 3, ..., King). */
    private final Rank aRank;

    /**
     * Constructs a {@code Card} with the specified rank and suit.
     *
     * @param pRank the rank of the card
     * @param pSuit the suit of the card
     */
    public Card(Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    /**
     * Returns the rank of this card.
     *
     * @return the rank of this card
     */
    public Rank getRank() {
        return this.aRank;
    }

    /**
     * Returns the suit of this card.
     *
     * @return the suit of this card
     */
    public Suit getSuit() {
        return this.aSuit;
    }

    /**
     * Returns a string representation of this card in the format "Rank of Suit".
     *
     * @return a string representation of this card
     */
    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    /**
     * Compares this card to another card first by suit, then by rank.
     *
     * @param other the other card to compare to
     * @return a negative integer, zero, or a positive integer as this card is less than,
     *         equal to, or greater than the specified card
     */
    @Override
    public int compareTo(Card other) {
        // Compare by suit first
        int suitCompare = this.aSuit.compareTo(other.aSuit);
        if (suitCompare != 0) {
            return suitCompare;
        }
        // If suits are the same, compare by rank
        return this.aRank.compareTo(other.aRank);
    }
}

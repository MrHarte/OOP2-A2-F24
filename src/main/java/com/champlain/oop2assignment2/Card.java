package com.champlain.oop2assignment2;

/**
 * The {@code Card} class represents a playing card with a specific rank and suit.
 * It implements the {@link Comparable} interface to allow comparison between two cards,
 * first by suit, and then by rank if the suits are the same.
 */
public class Card implements Comparable<Card> {
    /**
     * The suit of this card
     */
    private final Suit aSuit;

    /**
     * The rank of this card
     */
    private final Rank aRank;

    /**
     * Constructs a {@code Card} object with the specified rank and suit
     * @param pRank The rank of the card
     * @param pSuit The suit of the card
     */
    public Card (Rank pRank, Suit pSuit) {
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
     * Compares this card to another card, first by suit, add then by rank if the suits are the same
     *
     * @param pOtherCard the card to be compared.
     * @return a negative integer, zero or a positive integer if this card
     * is less than, equal to or greater than the specified card
     */
    @Override
    public int compareTo(Card pOtherCard) {
        // First compare by suit
        int suitComparison = this.aSuit.compareTo(pOtherCard.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If suits are the same, compare by rank
        return this.aRank.compareTo(pOtherCard.getRank());
    }

    /**
     * Returns the string representation of the card, showing its rank and suit.
     *
     * @return A string representing the card.
     */
    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }
}

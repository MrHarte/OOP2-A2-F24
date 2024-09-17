package com.champlain.oop2assignment2;

/**
 * Represents a playing card with a specific rank and suit.
 * <p>
 *    Implements the {@link Comparable} interface to compare cards based on their suit and rank.
 * </p>
 */
public class Card implements Comparable<Card> {

    /**
     * The suit of the card (e.g., Hearts, Spades).
     */
    private final Suit aSuit;

    /**
     * The rank of the card (e.g., Ace, King, Queen).
     */
    private final Rank aRank;

    /**
     * Constructs a new card with the specified rank and suit.
     *
     * @param pRank The rank of the card.
     * @param pSuit The suit of the card.
     */
    public Card(Rank pRank, Suit pSuit) {
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
     * Compares this card with another card for order.
     * The comparison is first based on suit, and if the suits are equal, then on rank.
     *
     * @param o The card to be compared.
     * @return A negative integer, zero, or a positive integer if this card is less than,
     *         equal to, or greater than the specified card.
     */
    @Override
    public int compareTo(Card o) {
        int comparison = this.getSuit().compareTo(o.getSuit());

        if (comparison != 0) {
            return comparison;
        }

        return this.getRank().compareTo(o.getRank());
    }
}
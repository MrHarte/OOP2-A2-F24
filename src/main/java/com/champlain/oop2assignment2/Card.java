package com.champlain.oop2assignment2;

/**
 * A class representing a playing card, defined by rank and suit.
 * Each card has a specific suit and rank. It can be compared to
 * other cards either by rank or suit.
 */

public class Card  implements Comparable<Card>{
    private final Suit aSuit;

    private final Rank aRank;

    public Card (Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    public Rank getRank() {
        return this.aRank;
    }

    public Suit getSuit() {
        return this.aSuit;
    }

    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    /**
     * Compares a card to another card, first by suit, then rank if it is equal.
     * @param otherCard the object to be compared.
     * @return A zero, negative, or positive integer as the card is equal, less than
     * or greater than a specified card.
     */

    @Override
    public int compareTo(Card otherCard) {
        // Compare by suit first
        int suitComparison = this.aSuit.compareTo(otherCard.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If suits are equal, compare by rank
        return this.aRank.compareTo(otherCard.getRank());
    }
}

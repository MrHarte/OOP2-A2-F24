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
     * Compares a card to another card, first by rank, then suit if it is equal.
     * @param otherCard the object to be compared.
     * @return A zero, negative, or positive integer as the card is equal, less than
     * or greater than a specified card.
     */

    @Override
    public int compareTo(Card otherCard) {
        // Compare by rank first
        int rankComparison = this.aRank.compareTo(otherCard.getRank());
        if (rankComparison != 0) {
            return rankComparison;
        }
        // If ranks are equal, compare by suit
        return this.aSuit.compareTo(otherCard.getSuit());
    }
}

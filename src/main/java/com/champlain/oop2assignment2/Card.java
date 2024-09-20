package com.champlain.oop2assignment2;

/**
 * The card class Implements the {@link Comparable} interface and compare cards by their suit and rank.
 */
public class Card implements Comparable<Card>{
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
     * This method sort by suit first from lowest to highest and then by rank.
     * @param otherCard the object to be compared.
     * @return if the card is less than other card it will
     */
    @Override
    public int compareTo(Card otherCard) {
        int suitComparison = this.aSuit.compareTo(otherCard.aSuit);
        if (suitComparison != 0) {
            return suitComparison;
        }
        return this.aRank.compareTo(otherCard.aRank);
    }
}
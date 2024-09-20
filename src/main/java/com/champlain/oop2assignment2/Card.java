package com.champlain.oop2assignment2;


public class Card implements Comparable<Card> {
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
    public int compareTo(Card pOtherCard) {
        // First compare by suit
        int suitComparison = this.aSuit.compareTo(pOtherCard.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If suits are the same, compare by rank
        return this.aRank.compareTo(pOtherCard.getRank());
    }


    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }
}

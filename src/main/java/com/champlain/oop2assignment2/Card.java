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
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

    /**
     * Compares a card's suit and rank with another card's suit and rank.
     * @param pOther The card that's compared to the first.
     * @return Whether the first card is less or greater than the first, via a 1 or a -1.
     */
    public int compareTo(Card pOther){

        int suitComparison = this.aSuit.compareTo(pOther.aSuit);
        if (suitComparison != 0){
            return suitComparison;
        }
        return this.aRank.compareTo(pOther.aRank);
    }
}

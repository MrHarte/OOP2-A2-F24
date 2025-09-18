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

    @Override
    public int compareTo(Card pCard) {
        // compare suit first
        int suitCompare = this.aSuit.compareTo(pCard.getSuit());
        if (suitCompare != 0) {
            return suitCompare;
        }
        return this.aRank.compareTo(pCard.getRank()); // if the suits are the same compare rank.
    }
}

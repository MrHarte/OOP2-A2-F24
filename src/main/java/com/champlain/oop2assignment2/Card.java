package com.champlain.oop2assignment2;

public class Card implements Comparable<Card> {
    private final Suit aSuit;

    private final Rank aRank;

    public Card (Rank pRank, Suit pSuit) {
        this.aSuit = pSuit;
        this.aRank = pRank;
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
    public int compareTo(Card o) {
        int suitComparison = this.aSuit.ordinal() - o.aSuit.ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        }
        return aRank.ordinal() - o.aRank.ordinal();

    }
}

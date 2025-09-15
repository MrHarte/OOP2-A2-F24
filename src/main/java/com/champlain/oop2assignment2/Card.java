package com.champlain.oop2assignment2;

public class Card implements Comparable<Card> {
//    Attributes
    private final Suit aSuit;

    private final Rank aRank;

//    Constructor
    public Card (Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    public int compareTo(Card pCard) {
        if (this.aSuit.compareTo(pCard.aSuit) == 0) {
            return this.aRank.compareTo(pCard.aRank);
        }
        return this.aSuit.compareTo(pCard.aSuit);
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
}

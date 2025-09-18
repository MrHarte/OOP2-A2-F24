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
    public int compareTo(Card pCard) {

        if(this.aSuit.compareTo(pCard.getSuit()) == 0) {
            return this.aRank.compareTo(pCard.getRank());
        }
        return aSuit.compareTo(pCard.getSuit());
    }

    @Override
    public String toString() {
        return this.aRank + " of " + this.aSuit;
    }

}

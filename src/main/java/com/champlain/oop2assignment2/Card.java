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
    public int compareTo(Card other) {

        // Compare by rank first
        int rankCompare = this.aSuit.compareTo(other.aSuit);
        if (rankCompare != 0) {
            return rankCompare;
        }
        // If ranks are the same, compare by suit
        return this.aRank.compareTo(other.aRank);
    }
}

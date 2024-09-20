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
     * This methode get the class rank and compare all the card in the deck. It does this by
     * subtrating each cards and then putting it in ordinal order
     * @param pOther deck in ordinal order, smallest to biggest
     * @return all the cards in ordinal order
     */
    @Override
    public int compareTo(Card pOther) {
        return this.getSuit().ordinal() - pOther.getSuit().ordinal();
    }
}
//yippe



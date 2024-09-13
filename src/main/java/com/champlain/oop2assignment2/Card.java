package com.champlain.oop2assignment2;

/**
 * Represents a playing card with a rank and suit.
 * <p>
 * This class implements {@link Comparable} to allow cards to be compared based on their rank and suit.
 */
public class Card implements Comparable<Card> {
    private final Suit aSuit;

    private final Rank aRank;

    public Card(Rank pRank, Suit pSuit) {
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
     * First, compare the suits.
     * If suits are the same, compare the ranks.
     * If suits are different, return the result of suit comparison.
     *
     * @param pOther The card to be compared with this card.
     * @return A negative integer, zero, or a positive integer as this card
     * is compared to the specified card.
     */
    @Override
    public int compareTo(Card pOther) {
        int result =this.getSuit().ordinal()- pOther.getSuit().ordinal();

        if (result == 0) {
            return this.getRank().ordinal() - pOther.getRank().ordinal();
        }
        return result;
    }
}

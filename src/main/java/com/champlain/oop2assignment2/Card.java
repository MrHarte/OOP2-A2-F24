package com.champlain.oop2assignment2;

public class Card implements Comparable<Card> {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card other) {
        String[] suitOrder = { "Clubs", "Diamonds", "Hearts", "Spades" };
        int thisSuit = java.util.Arrays.asList(suitOrder).indexOf(this.suit);
        int otherSuit = java.util.Arrays.asList(suitOrder).indexOf(other.suit);

        if (thisSuit != otherSuit) {
            return Integer.compare(thisSuit, otherSuit);
        }

        String[] rankOrder = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int thisRank = java.util.Arrays.asList(rankOrder).indexOf(this.rank);
        int otherRank = java.util.Arrays.asList(rankOrder).indexOf(other.rank);

        return Integer.compare(thisRank, otherRank);
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

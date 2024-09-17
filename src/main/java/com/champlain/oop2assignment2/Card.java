package com.champlain.oop2assignment2;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Iterator;

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

    //Samantha

    /**
     *
     * @param pOther the object to be compared.
     * @return aSuit that was compared to the other suit
     */
    public int compareTo(Card pOther) {
       // return aSuit.compareTo(pOther.aSuit);
       // return this.getSuit().ordinal() - pOther.getSuit().ordinal();
        // Compare by Suit first
        int rankComparison = this.aSuit.compareTo(pOther.aSuit);
        if (rankComparison != 0) {
            return rankComparison;
        }

        // If Suit are the same, compare by Rank
        return this.aRank.compareTo(pOther.aRank);
    }
    }

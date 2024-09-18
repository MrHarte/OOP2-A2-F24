package com.champlain.oop2assignment2;

import java.util.Comparator;

/**
 * Comparator for comparing cards by their suit.
 */
public class ComparableSuit implements Comparator<Card> {

    /**
     * Compares two cards by their suit.
     *
     * @param pCard1 The first card to be compared.
     * @param pCard2 The second card to be compared.
     * @return A negative integer, zero, or a positive integer as the first card is less than, equal to, or greater than the second card.
     */
    @Override
    public int compare(Card pCard1, Card pCard2) {
        return pCard1.getSuit().compareTo(pCard2.getSuit());
    }
}
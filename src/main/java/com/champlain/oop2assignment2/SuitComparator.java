package com.champlain.oop2assignment2;

import java.util.Comparator;

/**
 * Comparator for comparing cards by their suit.
 */
public class SuitComparator implements Comparator<Card> {

    /**
     * Compares two cards by their suit.
     *
     * @param card1 The first card to be compared.
     * @param card2 The second card to be compared.
     * @return A negative integer, zero, or a positive integer as the first card is less than, equal to, or greater than the second card.
     */
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSuit().compareTo(card2.getSuit());
    }
}
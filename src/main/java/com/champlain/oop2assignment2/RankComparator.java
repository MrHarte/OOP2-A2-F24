package com.champlain.oop2assignment2;


import java.util.Comparator;

/**
 * Comparator for comparing cards by their rank.
 */
public class RankComparator implements Comparator<Card> {

    /**
     * Compares two cards by their rank.
     *
     * @param card1 The first card to be compared.
     * @param card2 The second card to be compared.
     * @return A negative integer, zero, or a positive integer as the first card is less than, equal to, or greater than the second card.
     */
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getRank().compareTo(card2.getRank());
    }
}
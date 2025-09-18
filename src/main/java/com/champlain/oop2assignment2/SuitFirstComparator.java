package com.champlain.oop2assignment2;

import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card pCard1, Card pCard2) {
        if (pCard1.getSuit() != pCard2.getSuit()) return pCard1.getSuit().compareTo(pCard2.getSuit());
        return pCard1.getRank().compareTo(pCard2.getRank());
    }
}
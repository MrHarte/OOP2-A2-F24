package com.champlain.oop2assignment2;

import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card pCard1, Card pCard2) {
        return pCard1.getSuit().compareTo(pCard2.getSuit());
    }
}

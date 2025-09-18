package com.champlain.oop2assignment2;

import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        if (card1.getRank() == card2.getRank())
            return card1.getSuit().compareTo(card2.getSuit());
        return card1.getRank().compareTo(card2.getRank());
    }
}

package com.champlain.oop2assignment2;


/**
 * Represents a paying card, with a rank and a suit.
 * <p>
 * A card consists of two attributes a rank (Ace, Two, Three, ..., Jack,
 * Queen, King) and a suit (Clubs, Diamonds, Spades, Hearts). This class
 * gives methods to retrieve the rank and suit of a card, and to compare
 * two cards to sort.
 * </p>
 * <p>
 * This class implements the {@code Comparable<Card>} interface, which
 * allows cards to be compared and sorted.
 * </p>
 */
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
     * Compares this card to another card for sorting.
     *<p>
     * The comparison is first by suit, going from clubs, diamonds, spades,
     * and then hearts. If two cards are the same suit then they are compared
     * using their rank, going from ace, one, two, three, ..., jack, queen,
     * and king.
     *</p>
     * @param other the object to be compared.
     * @return A negative {@code Int} if this card is less than the compared
     * card, zero if they are equal, or a positive {@code Int} if this
     * card is greater than the compared card.
     */
    @Override
    public int compareTo(Card other) {
        int suitComparison = Integer.compare(this.getSuitOrder(this.aSuit), this.getSuitOrder(other.aSuit));
        if (suitComparison != 0) {
            return suitComparison;
        }

        return Integer.compare(this.aRank.ordinal(), other.aRank.ordinal());
    }


    /**
     * Returns the order of the suit for the sorting process.
     * <p>
     * The order of the suits is:
     * <ul>
     * - Clubs
     * - Diamonds
     * - Spades
     * - Hearts
     * </ul>
     * </p>
     *
     * @param suit The suit to get the order for.
     * @return An {@code Int} representing the order of the suit.
     */
    private int getSuitOrder(Suit suit) {
        switch (suit) {
            case CLUBS: return 0;
            case DIAMONDS: return 1;
            case SPADES: return 2;
            case HEARTS: return 3;
            default: throw new IllegalArgumentException("Unknown suit: " + suit);
        }
    }
}

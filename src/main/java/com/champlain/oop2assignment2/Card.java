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
    public int compareTo(Card pOther) {
        return aSuit.compareTo(pOther.aSuit);
        //return aRank.compareTo(pOther.aRank);
    }
    private void showAlert(Card card) {
        // Create the message to be displayed in the alert
        String message = "Card: " + card;

        // Display the alert using JavaFX's Alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message, ButtonType.OK);
        alert.setTitle("Card Alert");
        alert.setHeaderText(null);
        alert.showAndWait();
}}

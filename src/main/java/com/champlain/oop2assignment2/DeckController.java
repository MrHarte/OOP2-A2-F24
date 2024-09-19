package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.util.Iterator;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    private final Deck aDeck = new Deck();

    public void initialize() {
        this.displayDeck();
    }

    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    /**
     * Calls the sort method, then calls the displayDeck method.
     */
    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * Calls the showCards method using aDeck.
     */
    @FXML
    protected void onShowButtonClick() {
        aDeck.showCards();
    }

    /**
     * Takes a card's suit and rank, puts on an alert box, and displays said alert box.
     * @param pCard The card whose info is being displayed.
     */
    public static void cardMessage(Card pCard) {
        if (pCard == null) {                                    // Make sure there is an existing card to display.
            Alert e = new Alert(Alert.AlertType.WARNING);
            e.setContentText("This card does not exist.");
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText(pCard.toString());
            a.showAndWait();
        }

    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }

}
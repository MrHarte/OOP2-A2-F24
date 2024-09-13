package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

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
     * Sort the deck by comparing the cards to each other when the "Sort" button is clicked.
     * After sorting, it updates the display
     */
    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     *
     */
    @FXML
    protected void onShowButtonClick() {
        this.aDeckTextArea.setText("This does not step through anything yet.");
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
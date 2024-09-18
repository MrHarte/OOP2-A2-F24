package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    private final Deck aDeck = new Deck();

    /**
     * Initializes the controller. Displays the deck in the TextArea.
     */
    public void initialize() {
        this.displayDeck();
    }

    /**
     * Event handler for the shuffle button. Shuffles the deck and updates the display.
     */
    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    /**
     * Event handler for the sort button. Sorts the deck and updates the display.
     */
    @FXML
    protected void onSortButtonClick() {
        this.displaySortedDeck();
    }

    /**
     * For organization, we're gonna save the sorted deck method by itself.
     */
    protected void displaySortedDeck() {
        this.aDeck.sortDeckByRank();
        this.aDeck.sortDeckBySuit();
        this.aDeckTextArea.setText(this.aDeck.toString());
    }

    /**
     * Event handler for the show button. Displays a confirmation alert for each card in the deck.
     * The alert shows the card's rank and suit.
     */
    @FXML
    protected void onShowButtonClick() {
        for (Card card : this.aDeck) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Card Confirmation");
            alert.setHeaderText(null);
            alert.setContentText(card.toString());
            alert.showAndWait();
        }
    }

    /**
     * Displays the deck in the TextArea.
     */
    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
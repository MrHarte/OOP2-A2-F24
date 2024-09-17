package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.util.Collections;

/**
 * The {@code DeckController} class manages the user interface for interacting with a deck of cards.
 * It handles button clicks to shuffle, sort, and display the deck, and shows card details through alerts.
 */
public class DeckController {

    /** The TextArea in the UI where the deck's contents are displayed. */
    @FXML
    private TextArea aDeckTextArea;

    /** The deck of cards managed by this controller. */
    private final Deck aDeck = new Deck();

    /**
     * Initializes the controller by displaying the current deck.
     */
    public void initialize() {
        this.displayDeck();
    }

    /**
     * Handles the shuffle button click event.
     * Shuffles the deck and updates the display.
     */
    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    /**
     * Handles the sort button click event.
     * Sorts the deck if it is not empty and updates the display.
     * Shows an error alert if the deck is empty.
     */
    @FXML
    protected void onSortButtonClick() {
        if (this.aDeck.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No Deck");
            alert.showAndWait();
            return;
        }
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * Handles the show button click event.
     * Displays each card in the deck as an alert.
     * Shows an error alert if the deck is empty.
     */
    @FXML
    protected void onShowButtonClick() {
        if (this.aDeck.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No Deck");
            alert.showAndWait();
            return;
        }
        for (Card card : aDeck) {
            cardAlert(card.toString());
        }
    }

    /**
     * Shows a confirmation alert with the specified message.
     *
     * @param message the message to be displayed in the alert
     */
    private void cardAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Updates the TextArea with the current string representation of the deck.
     */
    private void displayDeck() {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}

package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

/**
 * This class is a controller for managing the interactions with a deck of cards in a JavaFX application.
 * It handles UI actions such as shuffling, sorting, and displaying the deck in a TextArea.
 */

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
     * Handles the sort button click event.
     * Sorts the deck and updates the TextArea with the sorted deck.
     */

    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * Handles the show button click event.
     * Displays each card in the deck one at a time in a confirmation alert.
     * The user can choose to continue or stop showing the cards.
     */

    @FXML
    protected void onShowButtonClick() {
        for (Card card : aDeck) { // Loop through each card in the deck
            boolean continueShowing = showConfirmationAlert(card.toString()); // Show confirmation alert
            if (!continueShowing) {
                break; // Stop showing alerts if "Cancel" is pressed
            }
        }
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }

    /**
     * Displays a confirmation alert dialog with the card description.
     * The user can press "OK" to continue or "Cancel" to stop.
     *
     * @param cardDescription The description of the card shown in an alert.
     * @return true if the user presses "OK" to continue, false if "Cancel" is pressed.
     */

    private boolean showConfirmationAlert (String cardDescription) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirmation");
        alert.setContentText(cardDescription);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            // OK button was pressed, continue showing alerts
            return true;
        } else {
            // Cancel button was pressed or dialog was closed, stop showing alerts
            return false;
        }
    }
}
package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;

/**
 * Controller for managing interactions with the deck of cards.
 */
public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    private final Deck aDeck = new Deck();

    /**
     * Initializes the controller and displays the deck.
     */
    public void initialize() {
        this.displayDeck();
    }

    /**
     * Shuffles the deck and updates the display.
     */
    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    /**
     * Sorts the deck if not empty and updates the display.
     * Shows an alert if the deck is empty.
     */
    @FXML
    protected void onSortButtonClick() {
        if (this.aDeck.isEmpty()) {
            showAlert(AlertType.INFORMATION, "Sort Operation", "The deck is empty. Nothing to sort.");
        } else {
            this.aDeck.sort();
            this.displayDeck();
        }
    }

    /**
     * Iterates through the deck and shows an alert for each card.
     * Shows an alert if the deck is empty.
     */
    @FXML
    protected void onShowButtonClick() {
        if (this.aDeck.isEmpty()) {
            showAlert(AlertType.INFORMATION, "Show Operation", "The deck is empty. No cards to display.");
        } else {
            for (Card card : this.aDeck) {
                showAlert(AlertType.INFORMATION, "Confirmation", card.toString());
            }
        }
    }

    /**
     * Displays the deck in the TextArea.
     */
    private void displayDeck() {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }

    /**
     * Shows an alert with the given type, title, and content.
     * @param alertType The type of alert.
     * @param title The title of the alert.
     * @param content The content of the alert.
     */
    private void showAlert(AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

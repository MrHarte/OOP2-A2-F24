package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

/**
 * The {@code DeckController} class manages the user interface for a deck of playing cards
 * It provides methods for shuffling, sorting, displaying and interacting with the deck
 * through a graphical user interface
 */
public class DeckController {

    /**
     * The text area in the UI that displays the current state of the deck
     */
    @FXML
    private TextArea aDeckTextArea;

    /**
     * The deck of cards being managed by this controller
     */
    private final Deck aDeck = new Deck();

    /**
     * Initializes the controller and updates the UI to display the current deck of cards
     * This method is automatically called when the controller is initialized
     */
    public void initialize() {
        this.displayDeck();
    }

    /**
     * Handles the shuffle button click event
     * Shuffles the deck of cards and updates the UI
     * to display the shuffled deck of cards
     */
    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    /**
     * Handles the sort button click event
     * Sorts the deck of cards by suit and rank, and updates the UI
     * to display the sorted deck
     */
    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * Handles the show button click event
     * Displays each card in the deck through a confirmation alert dialog
     */
    @FXML
    protected void onShowButtonClick() {

        for (Card card : this.aDeck) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText(null);
            alert.setContentText(card.toString());
            alert.showAndWait();
        }
    }

    /**
     * Updates the text area in the UI to display the current deck of cards
     * This method is called after the deck is shuffled or sorted to refresh the display
     */
    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
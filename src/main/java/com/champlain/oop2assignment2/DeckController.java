package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

/**
 * Controller class for handling deck operations in a GUI.
 * The controller provides functionalities to shuffle, sort,
 * and display cards in a deck.
 */
public class DeckController {

    /**
     * The TextArea in the GUI to display the deck of cards.
     */
    @FXML
    private TextArea aDeckTextArea;

    /**
     * The Deck object representing a deck of cards.
     */
    private final Deck aDeck = new Deck();

    /**
     * Initializes the controller by displaying the deck in the TextArea.
     */
    public void initialize() {
        this.displayDeck();
    }

    /**
     * Handles the shuffle button click event.
     * Shuffles the deck and updates the display in the TextArea.
     */
    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }

    /**
     * Handles the sort button click event.
     * Sorts the deck and updates the display in the TextArea.
     */
    @FXML
    protected void onSortButtonClick() {
        aDeck.sort();
        this.displayDeck();
    }

    /**
     * Handles the show button click event.
     * Displays each card in the deck as an alert popup.
     */
    @FXML
    protected void onShowButtonClick() {
        for (Card card : this.aDeck) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Confirmation");
            alert.setContentText(card.toString());

            alert.showAndWait();
        }
    }

    /**
     * Updates the TextArea with the current state of the deck.
     */
    private void displayDeck() {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
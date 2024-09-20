package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class DeckController {
    @FXML
    private TextArea aDeckTextArea;

    private final Deck aDeck = new Deck();

    public void initialize() {
        this.displayDeck();
    }

    /**
     * Shuffle the cards in the deck.
     * The method will be called when the shuffle button is clicked in SceneBuilder.
     */
    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }


    /**
     * Sorts the cards in the deck in ascending order based on suit and rank.
     * The method will be called when the sort button is clicked in SceneBuilder.
     */
    @FXML
    protected void onSortButtonClick() {
        // this.aDeckTextArea.setText("This does not sort anything yet.");
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * Shows each card in the deck one by one in confirmation alerts.
     * This method is called when the show button is clicked in SceneBuilder.
     * The cards are displayed in the order they are sorted or shuffled in the deck.
     */
    @FXML
    protected void onShowButtonClick() {
        // Iterate through each card in the deck one by one
        for (Card card : this.aDeck) {
            // Creating an alert dialog for each card
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Confirmation");
            alert.setContentText(card.toString());

            // Add OK and Cancel buttons to the alert
            alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);

            // Show the alert and wait for the user to press okay
            ButtonType result = alert.showAndWait().orElse(ButtonType.CANCEL);

            // If the user clicks "Cancel", stop showing further alerts
            if (result == ButtonType.CANCEL) {
                break;
            }
        }
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
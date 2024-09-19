package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
     * Handles the click event for the "Sort" button.
     *<p>
     * When clicked, this method sorts the deck of cards by suit and rank,
     * then it displays the sorted deck.
     *</p>
     */
    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * Handles the click event for the "Show" button.
     * <p>
     * When clicked, this method steps through the deck and displays
     * a confirmation alert for every card in the deck, showing
     * its details.
     * </p>
     */
    @FXML
    protected void onShowButtonClick() {
        for (Card card : this.aDeck) {
            showConfirmationAlert(card);
        }
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }

    /**
     * Shows a confirmation alert displaying the details of a given card.
     * <p>
     * This method is used when stepping through the deck, displaying
     * each card as a confirmation alert.
     * </p>
     *
     * @param card The card to display in the confirmation alert.
     */
    private void showConfirmationAlert(Card card) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirmation");
        alert.setContentText(card.toString());
        alert.showAndWait();
    }
}
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


    @FXML
    protected void onShuffleButtonClick() {
        this.aDeck.shuffle();
        this.displayDeck();
    }


    @FXML
    protected void onSortButtonClick() {
        // this.aDeckTextArea.setText("This does not sort anything yet.");
        this.aDeck.sort();
        this.displayDeck();
    }


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
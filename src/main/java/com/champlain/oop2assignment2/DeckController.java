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
       for (Card myCard : this.aDeck) {
           Alert myAlert = new Alert(Alert.AlertType.CONFIRMATION, myCard.toString());
           myAlert.showAndWait();

       }
        this.displayDeck();
    }

    @FXML
    protected void onSortButtonClick() {
        this.aDeckTextArea.setText("This does not sort anything yet.");
    }

    @FXML
    protected void onShowButtonClick() {

        Alert myAlert = new Alert(Alert.AlertType.CONFIRMATION, "Example.");
        myAlert.showAndWait();
    }
    private void displayDeck() {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
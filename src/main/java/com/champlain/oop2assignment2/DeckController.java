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

    @FXML
    protected void onSortButtonClick() {
        for(Card myCard : this.aDeck) {

            Alert myAlert = new Alert(Alert.AlertType.CONFIRMATION, myCard.toString());
            myAlert.showAndWait();
        }
    }

    @FXML
    protected void onShowButtonClick() {
        this.aDeckTextArea.setText("This does not step through anything yet.");
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
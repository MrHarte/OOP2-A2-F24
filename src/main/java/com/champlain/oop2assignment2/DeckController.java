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
        this.aDeck.sort();
        this.displayDeck();
    }

    @FXML
    protected void onShowButtonClick() {

        for(Card myCard : this.aDeck){
            Alert myAlert = new Alert(Alert.AlertType.CONFIRMATION, myCard.toString());
            myAlert.showAndWait();
        }

    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
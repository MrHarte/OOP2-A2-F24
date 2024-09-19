package com.champlain.oop2assignment2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.util.Iterator;

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
        // this function to call the sort method
        this.aDeck.sort();
        this.displayDeck();
    }

    @FXML
    protected void onShowButtonClick() {
        aDeck.ShowCards();
    }

    public static void CardMessage(Card pCard) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(pCard.toString());
        a.showAndWait();
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }

}
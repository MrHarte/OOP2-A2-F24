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
     * used sort method from the deck class and displays it with the
     * displayDeck method.
     * @author Samantha
     */
    @FXML
    protected void onSortButtonClick() {
        //changed this
        this.aDeck.sort();
        this.displayDeck();
    }

    /**
     * goes through each card in the aDeck and creates an information
     * alert that displays the cards one by one.
     */
    @FXML
    protected void onShowButtonClick() {
        for (Card aCard : aDeck) {
            String message = "Card: " + aCard;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
            alert.showAndWait();
        }
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
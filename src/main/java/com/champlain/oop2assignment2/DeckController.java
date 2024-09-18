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
     * When you click the sortButtonClick you will call the Deck class and
     * in the deck class call the sort method. Then you will displayDeck so it
     * can show all the sorted cards
     */
    @FXML
    protected void onSortButtonClick() {
        this.aDeck.sort();
        this.displayDeck();

    }

    /**
     * When you click the onShowButtonClick, it will do a loop
     * that goes to each card of the deck and it will call
     * the showConfirmationAlert methode to give out alert for each cards
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
     * This method is to show the confirmation of each card in the deck. It will create an
     * alert then add the text on the alert and use the variable card so when its called
     * it will go throught each cards
     * @param card will show an alert with the following informatiion: Card confirmation,Card
     *             information, with all the different card number
     */
    private void showConfirmationAlert(Card card) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Card Confirmation");
        alert.setHeaderText("Card Information");
        alert.setContentText("Card: " + card.toString());

        alert.showAndWait();
    }
}

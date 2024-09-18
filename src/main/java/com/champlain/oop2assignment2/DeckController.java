package com.champlain.oop2assignment2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    protected void onShowButtonClick(ActionEvent event) {
        Iterator<Card> cardIterator = aDeck.iterator();

        // Iterate over the cards using the iterator
        while (cardIterator.hasNext()) {
            Card card = cardIterator.next();

            // Create a confirmation alert for the current card
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Card Confirmation");
            alert.setHeaderText(null);
            alert.setContentText("Card: " + card.getRank() + " of " + card.getSuit());

            // Show the alert and wait for user response
            alert.showAndWait();
        }
    }

    private void displayDeck () {
        this.aDeckTextArea.setText(this.aDeck.toString());
    }
}
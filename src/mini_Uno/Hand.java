package mini_Uno;


import mini_Uno.cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards = new ArrayList<>();

    public Hand() {
    }

    public void pickedCard(Card card){
        cards.add(card);
    }

    /**
     * method that enables to give multiple cards to the player.
     * Usefull for new player hand of for +2 +4 actions
     * @param cards
     */
    public void pickSeveralCards(List<Card> cards){
        cards.forEach(card -> this.pickedCard(card));
    }

    public Card playCard(Card card){
        int index = this.cards.indexOf(card);
        if(index == -1){
            return null;
        }
        return this.cards.remove(index);
    }

    public boolean holdsCard(Card card){
        if(card.value().equals("joker") || card.value().equals("+4") ) {
            for (Card holdedCard : this.cards) {
                if(holdedCard.value().equals(card.value()))
                    return true;
            }
        }
        return this.cards.contains(card);

    }

    public int nbrOfCards(){
        return this.cards.size();
    }

    public Card[] getCardsArray(){
        return this.cards.toArray(new Card[0]);
    }
    

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                '}';
    }
}

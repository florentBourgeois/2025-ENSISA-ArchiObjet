package mini_Uno.gameRules;


import mini_Uno.Player;
import mini_Uno.Table;
import mini_Uno.cards.Card;

public abstract class UnoGameRuleChecker implements GameRuleCheckerInterface{

    protected UnoGameRuleChecker next;

    public UnoGameRuleChecker() {
    }

    public void setNext(UnoGameRuleChecker next) {
        this.next = next;
    }




}

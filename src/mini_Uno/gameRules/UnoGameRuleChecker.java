package mini_Uno.gameRules;


import mini_Uno.Player;
import mini_Uno.Table;
import mini_Uno.cards.Card;

public class UnoGameRuleChecker implements GameRuleCheckerInterface{

    public UnoGameRuleChecker() {
    }


    @Override
    public boolean isValidMove(Table table, Player player, Card played) {
        // this throws an exception because it is not yet implemented
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private boolean isPlayerTurn(Player player, Table table){
        // this throws an exception because it is not yet implemented
        throw new UnsupportedOperationException("Not supported yet.");
    }



}

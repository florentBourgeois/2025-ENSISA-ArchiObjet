package mini_Uno.gameRules;


import mini_Uno.Player;
import mini_Uno.Table;
import mini_Uno.cards.Card;

public class AlwaysFalseGameRuleChecker implements GameRuleCheckerInterface{

    @Override
    public boolean isValidMove(Table table, Player player, Card played) {
        return false;
    }
}

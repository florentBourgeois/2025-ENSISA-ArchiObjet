package mini_Uno.gameRules;

import mini_Uno.Player;
import mini_Uno.Table;
import mini_Uno.cards.Card;

public class ColorHandler extends UnoGameRuleChecker {
    @Override
    public boolean isValidMove(Table table, Player player, Card played) {

        Card cardOnTable = table.getLastPlayedCard();
        if(cardOnTable.color() == played.color())
            return true;
        if(next == null)
            return false;
        return next.isValidMove(table, player, played);

    }
}

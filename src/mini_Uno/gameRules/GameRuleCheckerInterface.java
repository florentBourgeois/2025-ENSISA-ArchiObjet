package mini_Uno.gameRules;


import mini_Uno.Player;
import mini_Uno.Table;
import mini_Uno.cards.Card;

@FunctionalInterface
public interface GameRuleCheckerInterface {

    boolean isValidMove(Table table, Player player, Card played);
}
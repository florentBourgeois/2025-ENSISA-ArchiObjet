package mini_Uno;


import mini_Uno.cards.Card;
import mini_Uno.gameRules.GameRuleCheckerInterface;
import mini_Uno.gameRules.UnoGameRuleChecker;

public class Main {

    public static void main(String[] args) {
        Table t = GameGenerator.generateTable1();

        GameRuleCheckerInterface ruleChecker = new UnoGameRuleChecker();

        Player joueurQuiJoue = t.getPlayerAtPosition(0);
        Card carteJouee = new Card("blue", "6");


        //System.out.println(t);
        if(ruleChecker.isValidMove(t, joueurQuiJoue, carteJouee)){
            System.out.println("vous avez bien joué");
        }

    }

}

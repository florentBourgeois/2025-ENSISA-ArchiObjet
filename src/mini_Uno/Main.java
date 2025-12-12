package mini_Uno;


import mini_Uno.cards.Card;
import mini_Uno.gameRules.*;

public class Main {

    public static void main(String[] args) {
        Table t = GameGenerator.generateTable1();

        ValueHandler vh = new ValueHandler();
        vh.setNext(new ColorHandler());

        GameRuleCheckerInterface ruleChecker = vh;

        Player joueurQuiJoue = t.getPlayerAtPosition(0);
        Card carteJouee = new Card("blue", "6");


        //System.out.println(t);
        if(ruleChecker.isValidMove(t, joueurQuiJoue, carteJouee)){
            System.out.println("vous avez bien joué");
        }

    }

}

package mini_Uno;


import mini_Uno.cards.Card;

import java.util.List;

public class GameGenerator {

    public static Table generateTable1(){
        Table table =new Table(new Card("blue", "5"));

        Player Red = new Player(table, "Red");
        Red.getHand().pickSeveralCards(generateCards("red"));

        Player Blue = new Player(table, "Blue");
        Blue.getHand().pickSeveralCards(generateCards("blue"));

        table.players.add(Red);
        table.players.add(Blue);
        table.lastPlayerThatPlayed = Red;

        return table;
    }

    public static Table generateTableReversed(){
        Table table = generateTable1();
        table.isReversed = true;
        return table;
    }

    public static Table generateTablePass(){
        Table table = generateTable1();
        table.isNextMustPass = true;
        return table;
    }

    public static List<Card> generateCards(String color){
        return List.of(new Card(color, "1"), new Card(color, "2"), new Card(color, "3"), new Card(color, "5"));
    }


}

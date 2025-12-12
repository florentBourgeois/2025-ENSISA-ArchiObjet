package mini_Uno;


import java.util.UUID;

/**
 * Stores the player information.
 */

public class Player {
    private final UUID uuid = UUID.randomUUID();
    /**
     * the table the player plays on
     */
    private final Table table;
    private final String name;
    /**
     * Holds all the player cards
     */
    private final Hand hand = new Hand();

    public Player(Table table, String name) {
        this.table = table;
        this.name = name;
    }

    public UUID getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public Table getTable(){
        return table;
    }

    public int getPosition() {
        return this.table.getPlayerPosition(this);
    }

    public int getNumberOfCards() {
        return this.hand.nbrOfCards();
    }

    @Override
    public String toString() {
        return "Player{" +
                "uuid=" + uuid +
                ", position on table =" + this.getPosition() +
                ", name='" + name + '\'' +
                ", hand=\n\t\t" + hand +
                '}';
    }
}

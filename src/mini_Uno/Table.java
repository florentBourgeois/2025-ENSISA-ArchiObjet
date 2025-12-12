package mini_Uno;


import mini_Uno.cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Table {
    /**
     * the list of players that are in the game
     */
    public final List<Player> players = new ArrayList<>();
    public Player lastPlayerThatPlayed = new Player(this, "None ever played");
    private Card lastPlayedCard;
    public boolean isReversed = false;
    public boolean isNextMustPass = false;

    public Table(Card card) {
        this.lastPlayedCard = card;
    }

    /**
     * returns the player that sits at the parameter position.
     *
     * @param position
     * @return the player or outOfBoundException thrown
     */
    public Player getPlayerAtPosition(int position) {
        return this.players.get(position);
    }

    public int getPlayerPosition(Player p) {
        return this.players.indexOf(p);
    }

    public int getPlayersNumber(){
        return this.players.size();
    }

    public Card getLastPlayedCard(){
        return this.lastPlayedCard;
    }

    public Player getPlayerAfter(Player p) {
        return this.getPlayerXPlaceAfter(p, 1);
    }

    public Player getPlayerXPlaceAfter(Player p, int x){
        int playerPosition = p.getPosition();
        int requestedPlayerPosition = (playerPosition + x) % this.getPlayersNumber();
        if(requestedPlayerPosition <0)
            requestedPlayerPosition = this.getPlayersNumber() + requestedPlayerPosition;

        return this.getPlayerAtPosition(requestedPlayerPosition);
    }

    public Player getPlayerBefore(Player p) {
        return this.getPlayerXPlaceBefore(p, 1);
    }

    public Player getPlayerXPlaceBefore(Player p, int x) {
        return this.getPlayerXPlaceAfter(p, -x);
    }


    @Override
    public String toString() {
        return "Table{" +
                "players names=" + players.stream().map(player -> player.getName() + ", ").reduce("", String::concat) +
                ", \n\tlastPlayerThatPlayed=" + lastPlayerThatPlayed +
                ", isReversed=" + isReversed +
                ", isNextMustPass=" + isNextMustPass +
                ", lastPlayedCard= " + this.lastPlayedCard +
                '}';
    }
}

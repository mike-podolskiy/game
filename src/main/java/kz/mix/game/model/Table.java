package kz.mix.game.model;

import java.util.LinkedList;

public class Table {
    private LinkedList<Card> table;
    private LinkedList<Player> players;

    public Table() {
        this.table = new LinkedList<>();
        this.players = new LinkedList<>();
    }

    public LinkedList<Card> getTable() {
        return table;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table=" + table +
                ", players=" + players +
                '}';
    }
}

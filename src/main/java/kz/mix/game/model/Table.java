package kz.mix.game.model;

import java.util.LinkedList;
import java.util.List;

public class Table {
    private List<Card> cards;
    private List<Player> players;

    public Table() {
        this.cards = new LinkedList<>();
        this.players = new LinkedList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return "Table{" +
                "cards=" + cards +
                ", players=" + players +
                '}';
    }
}

package kz.mix.game.model;

public class Player {
    private String name;
    private Hand hand;

    public Player() {
        throw new UnsupportedOperationException("Нужно указать имя игрока");
    }

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}

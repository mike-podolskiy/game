package kz.mix.game.model;

public class Player {
    private int id;
    private String name;
    private Hand hand;

    // todo поправить конструкторы
    public Player() {
        this.id = 0;
        this.name = "";
        this.hand = new Hand();
    }

    public Player(String name) {
        this.id = 0;
        this.name = name;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

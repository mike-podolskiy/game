package kz.mix.game.model;

public enum Suits {
    //J-
    SPADE(0), 
    HEARTS(1), 
    DIAMOND(2), 
    CLUB(3);
    //J+

    private int id;

    Suits(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

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

    public static Suits getSuitById(int id) {
        if (id < 0 || id > 3) {
            throw new IllegalArgumentException("Значение id для масти должно быть от 0 до 3");
        }

        for (Suits d : Suits.values()) {
            if (d.getId() == id) {
                return d;
            }
        }

        // todo сделать свое исключение или пересмотреть структуру метода
        throw null;
    }
}

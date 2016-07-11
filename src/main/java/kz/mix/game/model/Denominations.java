package kz.mix.game.model;

// todo реализовать Comparable?
public enum Denominations {
    //J-
    TWO(0),
    THREE(1),
    FOUR(2),
    FIVE(3),
    SIX(4),
    SEVEN(5),
    EIGHT(6),
    NINE(7),
    TEN(8),
    JACK(9),
    QUEEN(10),
    KING(11),
    ACE(12);
    //J+

    private int id;

    Denominations(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Denominations getDenominationById(int id) {
        if (id <0 || id > 12) {
            throw new IllegalArgumentException("Значение id для номинала должно быть от 0 до 12");
        }

        for (Denominations d : Denominations.values()) {
            if (d.getId() == id) {
                return d;
            }
        }

        // todo сделать свое исключение или пересмотреть структуру метода
        throw null;
    }
}

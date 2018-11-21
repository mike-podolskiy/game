package kz.mix.game.model;

import kz.mix.game.exception.SuitNotFoundException;

public enum SuitType {
    //J-
    SPADE(0), 
    HEARTS(1), 
    DIAMOND(2), 
    CLUB(3);
    //J+

    private int id;

    SuitType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static SuitType getSuitById(int id) {
        if (id < 0 || id > 3) {
            throw new IllegalArgumentException("Значение id для масти должно быть от 0 до 3");
        }

        for (SuitType d : SuitType.values()) {
            if (d.getId() == id) {
                return d;
            }
        }

        throw new SuitNotFoundException("Не найдена масть для данного значения id: " + id);
    }
}

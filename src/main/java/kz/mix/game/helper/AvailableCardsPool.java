package kz.mix.game.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kz.mix.game.model.Card;
import kz.mix.game.util.Util;

public class AvailableCardsPool {
    private static List<Card> pool = new ArrayList<>();

    public static void generateNewPool() {
        for (int i = 0; i < 52; i++) {
            pool.add(Util.getCardByCode(i));
        }

        Collections.shuffle(pool);
    }

    public static List<Card> getPool() {
        return pool;
    }
}

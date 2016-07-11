package kz.mix.game.helper;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import kz.mix.game.model.Card;
import kz.mix.game.util.Constant;
import kz.mix.game.util.Util;

public class AvailableCardsPool {
    private static LinkedList<Card> pool = new LinkedList<>();

    public static void generateNewPool() {
        for (int i = 0; i < Constant.fullPack; i++) {
            pool.add(Util.getCardByCode(i));
        }

        Collections.shuffle(pool);
    }

    public static List<Card> getPool() {
        return pool;
    }

    public static Card getAndRemoveCardFromPool() {
        // todo реализовать метод
        return null;
    }

    public static void removeCardFromPool(Card card) {
        if (pool.isEmpty()) {
            System.out.println("В колоде нет карт!");
            return;
        }

        if (!pool.contains(card)) {
            System.out.println("Такой карты уже нет в колоде!");
            return;
        }

        pool.remove(card);
    }

    public static void removeCardFromPool(int cardCode) {
        removeCardFromPool(Util.getCardByCode(cardCode));
    }
}

package kz.mix.game.helper;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import kz.mix.game.exception.PoolEmptyException;
import kz.mix.game.exception.PoolStoreException;
import kz.mix.game.model.Card;
import kz.mix.game.util.Constant;
import kz.mix.game.util.Util;

public class AvailableCardsPool {
    private static LinkedList<Card> pool = new LinkedList<>();

    public static void generateNewPool() {
        if (!pool.isEmpty()) {
            pool.clear();
        }

        for (int i = 0; i < Constant.fullPack; i++) {
            pool.add(Util.getCardByCode(i));
        }

        Collections.shuffle(pool);
    }

    public static List<Card> getPool() {
        return pool;
    }

    public static Card getAndRemoveCardFromPool() {
        if (pool.isEmpty()) {
            throw new PoolEmptyException("В колоде нет карт!");
        }

        return pool.remove();
    }

    public static void removeCardFromPool(Card card) {
        if (pool.isEmpty()) {
            throw new PoolEmptyException("В колоде нет карт!");
        }

        if (!pool.contains(card)) {
            throw new PoolStoreException("Такой карты уже нет в колоде!");
        }

        pool.remove(card);
    }

    public static void removeCardFromPool(int cardCode) {
        removeCardFromPool(Util.getCardByCode(cardCode));
    }
}

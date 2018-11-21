package kz.mix.game.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import kz.mix.game.exception.PackEmptyException;
import kz.mix.game.exception.PackStoreException;
import kz.mix.game.model.Card;
import kz.mix.game.model.RankType;
import kz.mix.game.model.SuitType;
import kz.mix.game.util.Constant;

import static kz.mix.game.util.Constant.NUMBER_OF_RANKS;
import static kz.mix.game.util.Constant.NUMBER_OF_SUITS;

public class PackService {
    // TODO: 21.11.2018 replace with another collection?
    private LinkedList<Card> pack;

    public PackService() {
        init();
    }

    public void init() {
        pack = new LinkedList<>();

        if (!pack.isEmpty()) {
            pack.clear();
        }

        IntStream.range(0, Constant.NUMBER_OF_CARDS_IN_FULL_PACK)
                .mapToObj(this::getCardByCode)
                .forEach(pack::add);

        Collections.shuffle(pack);
    }

    public List<Card> getPack() {
        return pack;
    }

    public Card retrieveCardFromPack() {
        if (pack.isEmpty()) {
            throw new PackEmptyException("В колоде нет карт!");
        }

        return pack.remove();
    }

    public void removeCardFromPack(Card card) {
        if (pack.isEmpty()) {
            throw new PackEmptyException("В колоде нет карт!");
        }

        if (!pack.contains(card)) {
            throw new PackStoreException("Такой карты уже нет в колоде!");
        }

        pack.remove(card);
    }

    public void removeCardFromPack(int cardCode) {
        removeCardFromPack(getCardByCode(cardCode));
    }

    private Card getCardByCode(int code) {
        int denCode = code % NUMBER_OF_RANKS;
        int suitCode = code % NUMBER_OF_SUITS;

        RankType rankType = RankType.getRankById(denCode);
        SuitType suitType = SuitType.getSuitById(suitCode);

        return new Card(rankType, suitType);
    }

}

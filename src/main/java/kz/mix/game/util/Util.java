package kz.mix.game.util;

import kz.mix.game.model.Card;
import kz.mix.game.model.Denominations;
import kz.mix.game.model.Suits;

import static kz.mix.game.util.Constant.*;

public final class Util {
    private Util() {}

    public static Card getCardByCode(int code) {
        Card result = null;

        int denCode = code % denominationNumber;
        int suitCode = code % suitNumber;

        Denominations denomination = Denominations.getDenominationById(denCode);
        Suits suit = Suits.getSuitById(suitCode);

        return new Card(denomination, suit);
    }

}

package kz.mix.game.main;

import kz.mix.game.helper.AvailableCardsPool;
import kz.mix.game.model.Card;
import kz.mix.game.model.Denominations;
import kz.mix.game.model.Suits;
import kz.mix.game.util.Util;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello");

        Card card1 = new Card(Denominations.ACE, Suits.CLUB);
        Card card2 = new Card(Denominations.ACE, Suits.CLUB);
        Card card3 = new Card(Denominations.ACE, Suits.SPADE);

        System.out.println(card1);
        System.out.println(card1.equals(card3));
        System.out.println(card1.hashCode());

        System.out.println(card1.getCode());
        System.out.println(card3.getCode());

        System.out.println(Util.getCardByCode(card1.getCode()));
        System.out.println(Util.getCardByCode(card3.getCode()));

        AvailableCardsPool.generateNewPool();
        System.out.println(AvailableCardsPool.getPool());


        AvailableCardsPool.removeCardFromPool(new Card(Denominations.ACE, Suits.CLUB));
        System.out.println(AvailableCardsPool.getPool());

    }
}

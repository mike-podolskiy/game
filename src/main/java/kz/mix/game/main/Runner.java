package kz.mix.game.main;

import kz.mix.game.model.Card;
import kz.mix.game.model.Denominations;
import kz.mix.game.model.Player;
import kz.mix.game.model.Suit;
import kz.mix.game.model.Suits;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello");


        Card card1 = new Card(Denominations.ACE, Suits.CLUB);
        Card card2 = new Card(Denominations.ACE, Suits.CLUB);
        Card card3 = new Card(Denominations.ACE, Suits.SPADE);

        System.out.println(card1);
        System.out.println(card1.equals(card3));
        System.out.println(card1.hashCode());





    }
}

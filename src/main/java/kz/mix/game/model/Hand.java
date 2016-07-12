package kz.mix.game.model;

import java.util.HashSet;
import java.util.Set;

public class Hand {
    private Set<Card> handCards;

    public Hand() {
        handCards = new HashSet<>();
    }

    public Set<Card> getHandCards() {
        return handCards;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handCards=" + handCards +
                '}';
    }
}

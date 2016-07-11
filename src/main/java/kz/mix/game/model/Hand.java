package kz.mix.game.model;

import java.util.HashSet;
import java.util.Set;

public class Hand {
    private Set<Card> startingHand;
    private Set<Card> currentHand;

    public Hand() {
        startingHand = new HashSet<Card>();
        currentHand = new HashSet<Card>();
    }

    public Set<Card> getStartingHand() {
        return startingHand;
    }

    public Set<Card> getCurrentHand() {
        return currentHand;
    }

}

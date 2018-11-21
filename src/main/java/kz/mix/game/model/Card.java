package kz.mix.game.model;

import static kz.mix.game.util.Constant.NUMBER_OF_RANKS;

public class Card {
    private int code;
    private RankType rank;
    private SuitType suit;

    /* constructors */
    public Card() {
        throw new UnsupportedOperationException("Нужно указать номинал и масть");
    }

    public Card(RankType rank, SuitType suit) {
        this.rank = rank;
        this.suit = suit;
        this.code = suit.getId() * NUMBER_OF_RANKS + rank.getId();
    }

    /* setters and getters */
    public RankType getRank() {
        return rank;
    }

    public SuitType getSuit() {
        return suit;
    }

    public int getCode() {
        return code;
    }

    /* equals and hashCode */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Card))
            return false;

        Card card = (Card) o;

        if (code != card.code)
            return false;
        if (!rank.equals(card.rank))
            return false;
        if (!suit.equals(card.suit))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return code;
    }

    /* toString */
    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    /* public methods */
}

package kz.mix.game.model;

import static kz.mix.game.util.Constant.denominationNumber;

public class Card {
    private int code;
    private Denomination denomination;
    private Suit suit;

    /* constructors */
    public Card() {
        throw new UnsupportedOperationException("Нужно указать номинал и масть");
    }

    public Card(Denomination denomination, Suit suit) {
        this.denomination = denomination;
        this.suit = suit;
        this.code = suit.get().getId() * denominationNumber + denomination.get().getId();
    }

    public Card(Denominations denomination, Suits suit) {
        this.denomination = new Denomination(denomination);
        this.suit = new Suit(suit);
        this.code = suit.getId() * denominationNumber + denomination.getId();
    }

    /* setters and getters */
    public Denomination getDenomination() {
        return denomination;
    }

    public Suit getSuit() {
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
        if (!denomination.equals(card.denomination))
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
        return denomination.get().toString() + " of " + suit.get().toString();
    }

    /* public methods */
}

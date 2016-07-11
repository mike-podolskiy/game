package kz.mix.game.model;

import static kz.mix.game.model.Constant.nominalNumber;

public class Card {
    private Denomination denomination;
    private Suit suit;

    public Card() {
        throw new UnsupportedOperationException("Нужно указать номинал и масть");
    }

    public Card(Denomination denomination, Suit suit) {
        this.denomination = denomination;
        this.suit = suit;
    }

    public Card(Denominations denomination, Suits suit) {
        this.denomination = new Denomination(denomination);
        this.suit = new Suit(suit);
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (!denomination.equals(card.denomination)) return false;
        if (!suit.equals(card.suit)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return suit.get().getId() * nominalNumber + denomination.get().getId();
    }

    @Override
    public String toString() {
        return denomination.get().toString() + " of " + suit.get().toString();
    }
}

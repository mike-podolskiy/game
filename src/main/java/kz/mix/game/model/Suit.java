package kz.mix.game.model;

public class Suit {
    private Suits suit;

    public Suit() {
        throw new UnsupportedOperationException("Нужно указать масть");
    }

    public Suit(Suits suit) {
        this.suit = suit;
    }

    public Suits get() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Suit)) return false;

        Suit suit1 = (Suit) o;

        if (suit != suit1.suit) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return suit.getId();
    }
}

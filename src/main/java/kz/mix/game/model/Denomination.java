package kz.mix.game.model;

public class Denomination {
    private Denominations denomination;

    public Denomination() {
        throw new UnsupportedOperationException("Нужно указать номинал");
    }

    public Denomination(Denominations denomination) {
        this.denomination = denomination;
    }

    public Denominations get() {
        return denomination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Denomination)) return false;

        Denomination that = (Denomination) o;

        if (denomination != that.denomination) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return denomination.getId();
    }
}

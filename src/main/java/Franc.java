import java.util.Objects;

public class Franc {
    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public Franc plus(Franc addend) {
        return new Franc(this.amount + addend.amount);
    }

    public Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}

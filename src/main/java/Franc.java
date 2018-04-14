public class Franc extends Money{
    Franc(int amount) {
        super(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }

    public Franc plus(Franc addend) {
        return new Franc(this.amount + addend.amount);
    }

    public Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}

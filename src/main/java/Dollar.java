public class Dollar extends Money {
    Dollar(int amount) {
        super(amount, "USD");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    public Dollar plus(Dollar addend) {
        return new Dollar(this.amount + addend.amount);
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}

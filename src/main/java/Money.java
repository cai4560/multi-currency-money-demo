import java.util.Objects;

public class Money {
    private int amount;
    private String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Money) {
            Money money = (Money) o;
            return amount == money.amount && currency.equals(money.currency);
        }
        return false;
    }

    public Money plus(Money addend) {
        return new Money(this.amount + addend.amount, this.currency);
    }

    public Money multiply(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }
}

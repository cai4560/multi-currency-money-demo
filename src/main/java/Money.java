import java.util.Objects;

public class Money {
    private static final String FRANC_CURRENCY = "CHF";
    private static final String DOLLAR_CURRENCY = "USD";

    private int amount;
    private String currency;

    private Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money franc(int amount) {
        return new Money(amount, FRANC_CURRENCY);
    }

    static Money dollar(int amount) {
        return new Money(amount, DOLLAR_CURRENCY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currency, money.currency);
    }

    public Money plus(Money addend) {
        return new Money(this.amount + addend.amount, this.currency);
    }

    public Money multiply(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }
}

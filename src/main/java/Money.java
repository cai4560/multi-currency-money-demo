import java.math.BigDecimal;
import java.util.Objects;

public class Money implements Expression {
    public static final String FRANC_CURRENCY = "CHF";
    public static final String DOLLAR_CURRENCY = "USD";

    private BigDecimal amount;
    private String currency;

    Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money franc(int amount) {
        return new Money(new BigDecimal(amount), FRANC_CURRENCY);
    }

    static Money dollar(int amount) {
        return new Money(new BigDecimal(amount), DOLLAR_CURRENCY);
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
        return amount.compareTo(money.amount) == 0 &&
                Objects.equals(currency, money.currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression multiply(int multiplier) {
        return new Money(this.amount.multiply(new BigDecimal(multiplier)), this.currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public Money reduce(Bank bank, String toCurrency) {
        BigDecimal rate = bank.getRates(currency, toCurrency);
        return new Money(amount.multiply(rate), toCurrency);
    }
}

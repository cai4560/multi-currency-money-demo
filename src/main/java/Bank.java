import java.math.BigDecimal;

public class Bank {
    private static final BigDecimal USD_TO_CHF = new BigDecimal(2);
    private static final BigDecimal CHF_TO_USD = new BigDecimal(0.5);

    public Money reduce(Money money, String toCurrency) {
        BigDecimal rate = getRates(money.getCurrency(), toCurrency);
        return new Money(money.getAmount().multiply(rate), toCurrency);
    }

    public Money reduce(Sum sum, String toCurrency) {
        return sum.reduce(this, toCurrency);
    }

    private BigDecimal getRates(String from, String to) {
        if (Money.DOLLAR_CURRENCY.equals(from) && Money.FRANC_CURRENCY.equals(to)) {
            return USD_TO_CHF;
        } else if (Money.FRANC_CURRENCY.equals(from) && Money.DOLLAR_CURRENCY.equals(to)) {
            return CHF_TO_USD;
        }
        return BigDecimal.ONE;
    }
}

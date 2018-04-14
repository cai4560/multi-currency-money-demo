import java.util.Objects;

public class Money {
    protected int amount;
    private String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}

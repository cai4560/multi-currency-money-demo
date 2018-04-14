import java.util.Objects;

public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}

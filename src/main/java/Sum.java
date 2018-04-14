class Sum implements Expression {
    private Expression addend;
    private Expression augend;

    Sum(Expression addend, Expression augend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(Bank bank, String toCurrency) {
        Money reduceAddend = addend.reduce(bank, toCurrency);
        Money reduceAugend = augend.reduce(bank, toCurrency);
        return new Money(reduceAddend.getAmount().add(reduceAugend.getAmount()), toCurrency);
    }

    @Override
    public Expression plus(Expression expression) {
        return new Sum(this, expression);
    }

    @Override
    public Expression multiply(int multiplier) {
        return new Sum(this.addend.multiply(multiplier), this.augend.multiply(multiplier));
    }
}

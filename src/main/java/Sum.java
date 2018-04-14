class Sum {
    private Money addend;
    private Money augend;

    Sum(Money addend, Money augend) {
        this.addend = addend;
        this.augend = augend;
    }

    public Money reduce(Bank bank, String toCurrency) {
        return bank.reduce(addend, toCurrency)
                .plus(bank.reduce(augend, toCurrency));
    }
}

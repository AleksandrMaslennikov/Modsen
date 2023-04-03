package Records;

import Enums.Currency;

public record Money(double amount, Currency currency) {

    @Override
    public String toString() {
        return currency.equals(Currency.USD) ? String.format("$%.2f", amount) : String.format("%.2fp", amount);
    }
}

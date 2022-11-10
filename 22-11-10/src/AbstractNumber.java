public abstract class AbstractNumber implements Number {
    private final int value;

    protected AbstractNumber(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("value must be non-negative");
        }
        this.value = value;
    }

    // restituisce il valore di questo numero
    public final int getValue() {
        return value;
    }

    // restituice la base di numerazione di questo numero
    protected abstract int getBase();

    // restituisce il carattere che rappresenta la cifra "digit" nella base di
    // numerazione
    // di questo numero. Sarà sempre vero che 0 <= digit < getBase();
    // per esempio, in base sedici si avrà getCharForDigit(10) == 'A' e
    // in base otto si avrà getCharForDigit(7) == '7'
    protected abstract char getCharForDigit(int digit);

    // restituisce una stringa che rappresenta il numero nella sua base di
    // numerazione
    public String toString() {
        int value = getValue();
        int base = getBase();
        if (value == 0) {
            return "0";
        }
        String result = "";
        while (value != 0) {
            int digit = value % base;
            result = getCharForDigit(digit) + result;
            value = value / base;
        }
        return result;

    }

    public final boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other.getClass() != getClass()) {
            return false;
        }
        AbstractNumber otherNumber = (AbstractNumber) other;
        return getValue() == otherNumber.getValue();
    }
}
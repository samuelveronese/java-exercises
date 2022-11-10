public class DecimalNumber extends AbstractNumber {
    public DecimalNumber(int value) {
        super(value);
    }
    
    public String toString() {
        return super.toString();
    }

    protected int getBase() {
        return 10;
    }

    protected char getCharForDigit(int digit) {
        return (char) (digit + '0');
    }

}

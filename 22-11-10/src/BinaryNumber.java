public class BinaryNumber extends AbstractNumber {
    public BinaryNumber(int value) {
        super(value);
    }
    
    public String toString() {
        return super.toString();
    }

    protected int getBase() {
        return 2;
    }

    protected char getCharForDigit(int digit) {
        return (char) (digit + '0');
    }
}

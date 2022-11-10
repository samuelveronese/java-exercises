public class HexNumber extends AbstractNumber{
    public HexNumber(int value) {
        super(value);
    }
    
    public String toString() {
        return super.toString();
    }

    protected int getBase() {
        return 16;
    }

    protected char getCharForDigit(int digit) {
        if (digit < 10) {
            return (char) (digit + '0');
        } else {
            return (char) (digit - 10 + 'A');
        }
    }
    
}

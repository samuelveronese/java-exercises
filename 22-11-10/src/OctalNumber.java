public class OctalNumber extends AbstractNumber{
    public OctalNumber(int value) {
        super(value);
    }
    
    public String toString() {
        return super.toString();
    }

    protected int getBase() {
        return 8;
    }

    protected char getCharForDigit(int digit) {
        return (char) (digit + '0');
    }
    
}

public class Base58Number extends AbstractNumber{

    private static final String BASE58 = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
    
    public Base58Number(int value) {
        super(value);
    }
    
    public String toString() {
        return super.toString();
    }
    
    protected int getBase() {
        return 58;
    }
    
    protected char getCharForDigit(int digit) {
        return BASE58.charAt(digit);
    }
    
}

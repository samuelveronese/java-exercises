public class BinaryNumberWithParity extends BinaryNumber {
    public BinaryNumberWithParity(int value) {
        super(value);
    }

    private char getParityBit() {
        int count = 0;
        String value = super.toString();
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '1') {
                count++;
            }
        }
        if (count % 2 == 0) {
            return '0';
        } else {
            return '1';
        }
    }

    public String toString() {
        return super.toString() + getParityBit();

    }

}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner. close();

        if(n<0){
            System.out.println("Invalid input");
            return;
        }

        ArrayList<AbstractNumber> numberArrayList = new ArrayList<AbstractNumber>();
        numberArrayList.add(new DecimalNumber(n));
        numberArrayList.add(new BinaryNumber(n));
        numberArrayList.add(new OctalNumber(n));
        numberArrayList.add(new HexNumber(n));
        numberArrayList.add(new BinaryNumberWithParity(n));
        numberArrayList.add(new Base58Number(n));

        LinkedList<AbstractNumber> numberLinkedList = new LinkedList<AbstractNumber>();
        numberLinkedList.add(new DecimalNumber(n));
        numberLinkedList.add(new BinaryNumber(n));
        numberLinkedList.add(new OctalNumber(n));
        numberLinkedList.add(new HexNumber(n));
        numberLinkedList.add(new BinaryNumberWithParity(n));
        numberLinkedList.add(new Base58Number(n));

        for(AbstractNumber number : numberArrayList){
            System.out.println(number);
        }
    }
}

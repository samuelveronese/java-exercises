import java.util.HashSet;
import java.util.TreeSet;

import it.univr.cards.Card;

public class MainCards {

    public static void main(String[] args) {
        HashSet<Card> hs_cards = new HashSet<>();
        TreeSet<Card> ts_cards = new TreeSet<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            hs_cards.add(new Card());
        }
        long end = System.currentTimeMillis();
        System.out.println("HashSet: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            ts_cards.add(new Card());
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet: " + (end - start) + " ms");

        // print hashset size
        System.out.println("HashSet size: " + hs_cards.size());
        // print treeset size
        System.out.println("TreeSet size: " + ts_cards.size());
        // print hashset equals treeset
        System.out.println("HashSet equals TreeSet: " + hs_cards.equals(ts_cards));
    }

}

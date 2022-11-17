package it.univr.cards;

import java.util.SortedSet;
import java.util.TreeSet;

public class Deck {
    private SortedSet<Card> cards;

    /**
     * Costruisce un mazzo di size carte, tutte diverse, il cui valore è da min in
     * su.
     */
    public Deck(int size, Value min) {
        cards = new TreeSet<>();
        for (int i = 0; i < size; i++) {
            Card card = new Card(min);
            if (cards.contains(card))
                i--;
            else
                cards.add(card);
        }
    }

    /**
     * Restituisce una stringa che descrive le carte in questo mazzo, costruita come
     * la loro stampa in sequenza crescente per valore.
     */
    public String toString() {
        String result = "";
        for (Card card : cards)
            result += card + " ";
        return result;
    }

    /**
     * Restituisce la carta più alta di questo mazzo (senza rimuoverla).
     */
    public Card best() {
        Card max = cards.first();
        for (Card card : cards)
            if (card.compareTo(max) > 0)
                max = card;
        return max;

    }

    /**
     * Rimuove la carta più alta di questo mazzo.
     */
    public void removeBest() {
        cards.remove(best());
    }
}
package day6;

//4.Card Suit & Rank
//Redesign a Card class using two enums: Suit (CLUBS, DIAMONDS, HEARTS, SPADES) and Rank (ACE…KING).
//Then implement a Deck class to:
//•	Create all 52 cards.
//•	Shuffle and print the order.

import java.util.Random;

public class CardDeckDemo {
    enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES; }

    enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    static class Card {
        final Suit suit;
        final Rank rank;
        Card(Suit s, Rank r) { suit = s; rank = r; }
        public String toString() { return rank + " of " + suit; }
    }

    static class Deck {
        Card[] cards = new Card[52];
        int size = 52;

        Deck() {
            int idx = 0;
            for (Suit s : Suit.values()) {
                for (Rank r : Rank.values()) {
                    cards[idx++] = new Card(s, r);
                }
            }
        }

        void shuffle() {
            Random rand = new Random();
            for (int i = size - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                Card temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
            }
        }

        void printDeck() {
            for (Card c : cards) System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.printDeck();
    }
}

package _3_2_cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {
	public Deck() {
		cards = new ArrayList<Card>();
		Suit[] suits = { Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
		Collections.shuffle(cards, new Random());
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

	private List<Card> cards;
	private static Deck singletonInstance;

	synchronized static Deck getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Deck();

		return singletonInstance;
	}
}

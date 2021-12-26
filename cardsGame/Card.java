package cardsGame;

public class Card {
	private int cardValue;
	private int cardSuit;
	private char[] suit = {'H' ,'S', 'C', 'D'};
	private String[] value = {"2","3","4","5","6","7","8","9","10","j","Q","K","A"};
	public Card(int value, int suit) {
		this.cardValue = value;
		this.cardSuit = suit;
	};
	public int getValue() {
		return this.cardValue;
	}
	public int getSuit() {
		return this.cardSuit;
	}
	public String toString() {
		return this.value[cardValue]+""+this.suit[cardSuit];
	}
}

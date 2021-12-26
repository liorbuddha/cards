package cardsGame;

public class Deck {
	//Array of Cards
	private Card[] dec = new Card[52];
	//cards out of deck
	private Card[] outs;
	//constructor, creates 52 objects of type Card
	public Deck() {
		int place = 0;
		while(place < 52) {
			for(int i=0;i<4;i++) {
				for(int j =0;j<dec.length/4;j++) {
					this.dec[place]=new Card(j, i);
					place++;
				}
			}
		}
	}
	//print Deck
	public void printDeck() {
			System.out.print("[ ");
			for(int i =0;i<this.dec.length;i++) {
				System.out.print(this.dec[i].toString()+ ", ");
			}
			System.out.println("]");
	}
	public Card[] getOuts() {
		return this.outs;
	}
	//shuffle deck of cards
	public void shuffleDeck() {
		Card tmpCard;
		int rnd;
		for(int i=0;i<this.dec.length;i++) {
			rnd = (int) (Math.random()*52);
			tmpCard = this.dec[i];
			this.dec[i]=this.dec[rnd];
			this.dec[rnd]=tmpCard;
		}
	}
	//returns string of a card from the deck by index
	public String getCard(int index) {
		return this.dec[index].toString();
	}
	//take card out of deck.
	//return the card got out
	public Card takeCardFrom(int index) {
		Card[] newDeck = new Card[this.dec.length-1];
		Card[]  newOuts;
		if(this.outs==null) {
			newOuts = new Card[1];
			newOuts[0] = this.dec[index];
		}else {
			newOuts = new Card[this.outs.length+1];
			for (int i=0;i<newOuts.length-1;i++) {
				newOuts[i]=this.outs[i];
			}
			newOuts[newOuts.length-1]=this.dec[index];
		}
		this.outs=newOuts;
		for (int i=0;i<newDeck.length;i++) {
			if(i<index) {
				newDeck[i]=this.dec[i];
			}
			else {
				newDeck[i]=this.dec[i+1];
			}
		}
		this.dec=newDeck;
		return this.outs[this.outs.length-1];
	}
	public int getDeckLength() {
		return this.dec.length;
	}
}
	






package cardsGame;

public class Player {
	private int id;
	private Card[] hand;
	private int points;
	//constructor gets an id
	public Player(int id) {
		this.points = 0;
		this.id = id;
	}
	//return  this.hand array of cards 
	public Card[] getHand() {
		return this.hand;
	}
	//return player id
	public int getPlayerId() {
		return this.id;
	}
	//return number of points
	public int getPoints() {
		return this.points;
	}
	public String toString() {
		return "player "+this.id; 
	}
	//print Deck
	public void printHand() {
		System.out.print("[ ");
			for(int i =0;i<this.hand.length;i++) {
				System.out.print(this.hand[i].toString()+ ", ");
			}
			System.out.println("]");
	}
	//add card to this.hand
	public void setCard(Card card) {
		Card[] ncl;
		if(this.hand==null) {
			ncl =new Card[1];
			ncl[0]=card;
		}
		else {
			ncl=new Card[this.hand.length+1];
			for (int i=0;i<this.hand.length;i++) {
				ncl[i]=this.hand[i];
			}
			ncl[ncl.length-1]=card;
		}
		this.hand=ncl;
	}
	//add points to player
	public void setPoints(int points) {
		this.points+=points;
	}
	//pull card from this.hand, card will be lost
	public Card PullCardFromHand() {
		Card tmp = this.hand[0];
		Card[] nc = new Card[this.hand.length-1];
		for(int i=0;i<this.hand.length-1;i++) {
			nc[i]=this.hand[i+1];
		}
		this.hand=nc;
		return tmp;
	}
	//return first card in hand
	public Card firstInHand() {
		return this.hand[0];
	}
	
	
}

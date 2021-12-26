package cardsGame;

public class Player {
	private int id;
	private Card[] hand;
	private int points;
	public Player(int id) {
		this.points = 0;
		this.id = id;
	}
	
	public Card[] getHand() {
		return this.hand;
	}
	public int getPlayerId() {
		return this.id;
	}
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
	
	
}

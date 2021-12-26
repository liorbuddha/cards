package cardsGame;

	public class Table {
	private Deck deck;
	private Player[] players; 
	//constructor gets list of players
	public Table(Player[] playersList) {
		this.deck = new Deck();
		this.players = playersList;
	}
	//shuffle this.deck
	public void shuffleDeck() {
		this.deck.shuffleDeck();
	}
	//deal cards, function gets how many cards each player gets
	public void dealCards(int howMany) {
		for(int i=0;i<howMany;i++) {
			for(int pl=0;pl<this.players.length;pl++) {
				//each player gets howMany cards from this.deck, one card per round
				this.players[pl].setCard(this.deck.takeCardFrom(0));
			}
		}
	}
	//print hand of each player at the table
	public void printHands() {
		for(int i=0;i<this.players.length;i++) {
			System.out.println(this.players[i].getHand());
		}
	}
	//return how many cards left in the deck
	public int cardsLeft() {
		return this.deck.getDeckLength();
	}
	//run game
	public void play_war() {
		dealCards(52/this.players.length);
		int loc=0, pl=0;
		for(int round=0;round<52/this.players.length;round++) {
			int max = 0;
			for(pl =0;pl<this.players.length;pl++) {
				this.players[pl].printHand();
				if(max<this.players[pl].firstInHand().getValue()) {
					max = this.players[pl].firstInHand().getValue();
					loc = pl;
				}
			}
			System.out.println("winner for round "+round+" is: "+this.players[loc].toString()+" with "+this.players[loc].firstInHand());
			for(int i=0;i<this.players.length;i++) {
				this.players[i].PullCardFromHand();
			}
		}
	}
	
	
	

}

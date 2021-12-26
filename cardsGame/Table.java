package cardsGame;

	public class Table {
	private Deck deck;
	private Player[] players; 
	//constructor gets list of players
	public Table(Player[] playersList) {
		this.deck = new Deck();
		this.players = playersList;
	}
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
	public void printHands() {
		for(int i=0;i<this.players.length;i++) {
			System.out.println(this.players[i].getHand());
		}
	}
	public int cardsLeft() {
		return this.deck.getDeckLength();
	}
	
	
	

}

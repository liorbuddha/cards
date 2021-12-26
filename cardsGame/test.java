package cardsGame;

public class test {
	//Table test
	public static void main(String[] args) {
		int numPlayers = 5, cardsEach = 2;
		Player[] players_list = new Player[numPlayers];
		for (int i=0;i<players_list.length;i++) {
			players_list[i]=new Player(i);
		}
		Table tb = new Table(players_list);
		tb.shuffleDeck();
		tb.dealCards(cardsEach);
		for(int i=0;i<players_list.length;i++) {
			System.out.print(players_list[i].toString());
			players_list[i].printHand();
		}
		System.out.println(tb.cardsLeft()+" cards left in the deck");
		
	}

}

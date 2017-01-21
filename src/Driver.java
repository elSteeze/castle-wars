/**
 * driver class for castle wars game
 * @author cbentson
 *
 */
public class Driver {
	public static void main(String args[]){
		welcomeMessage();
		cardSetup();
	}
	
	
	/**
	 * Welcome message
	 */
	public static void welcomeMessage(){
		System.out.println("Cody Bentson");
		System.out.println("My Game: Castle Wars");
		System.out.println("My Strategy: Defensive");
		System.out.println("In these following test cases I will display the behavior of my defensive strategy.");
		System.out.println("My strategy will always choose the most appropriate move with a defensive mindset.");
		System.out.println("If my strategy can make a defensive move, it will make the best one possible. If my");
		System.out.println("strategy can not make a defensive move at all, it will choose to make a passive move");
		System.out.println("which will in turn set up the necessary resources for another defensive move in the future.");
		System.out.println("If my strategy can neither make a defensive or passive move it will make an attack based move.");
		System.out.println("My strategies worst case scenario decision, it cannot afford any card, it will discard a card.\n ");
	}
	
	
	/**
	 * Creating the cards that are used in this representation of the game
	 */
	public static void cardSetup(){
		Card wall = new Card("bricks", 1,"Wall", "Defensive");
		Card base = new Card("bricks", 1,"Base", "Defensive");
		Card defence = new Card("bricks", 3,"Defence", "Defensive");
		Card archer = new Card("swords", 1,"Archer", "Aggresive");
		Card knight = new Card("swords", 2,"Knight", "Aggresive");
		Card dragon = new Card("crystals", 21, "Dragon","Aggresive");
		Card conjureBricks = new Card("crstals", 4,"Conjure Bricks", "Passive");
		Card conjureCrystals = new Card("crystals", 3,"Conjure Crystals", "Passive");
		
		Card [] cards = {wall,base,defence,archer,knight,dragon,conjureBricks,conjureCrystals};
		
		handTestCaseCreator(cards);
		
	}
	
	
	/**
	 * Creating the hands to be used in this implemenation of the game
	 * @param cards
	 */
	public static void handTestCaseCreator(Card [] cards){
		//mixed deck
		Card [] mixed = cards;
		//mostly attack based deck
		Card [] attack = {cards[3], cards[3], cards[4], cards[4], cards[5],cards[0],cards[7], cards[6]};
		//mostly defense based deck
		Card [] defense = {cards[0], cards[1], cards[2], cards[4], cards[5],cards[0],cards[7], cards[6]};
		//mostly passive based deck
		Card [] passive = {cards[6], cards[7], cards[4], cards[6], cards[5],cards[0],cards[7], cards[6]};
		//no defensive cards: should choose a passive card for strategic move
		Card [] noDefense = {cards[6], cards[7], cards[4], cards[6], cards[5],cards[4],cards[7], cards[6]};
		// no defensive or passive cards: should choose an attack card
		Card [] noDefenseNoPassive = {cards[3], cards[5], cards[3], cards[4], cards[4],cards[3],cards[4], cards[3]};
		//cant afford any cards: should discard first card
		Card [] cantAfford = {cards[5], cards[5], cards[5], cards[5], cards[5],cards[5],cards[5], cards[5]};
		
		System.out.println("TEST CASE 1:");
		System.out.println("In this test case there is a mixed variety of cards in the current hand.\nDefensive strategy chooses best defensive card possible to use.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(mixed);
		playerSetup(mixed);
		System.out.println("TEST CASE 2:");
		System.out.println("In this test case there are mostly attack cards in the current hand.\nDefensive strategy chooses best card possible to use with a defensive > passive > attack > discard priority.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(attack);
		playerSetup(attack);
		System.out.println("TEST CASE 3:");
		System.out.println("In this test case there is are mostly defensive cards in the current hand.\nDefensive strategy chooses best card possible to use with a defensive > passive > attack > discard priority.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(defense);
		playerSetup(defense);
		System.out.println("TEST CASE 4:");
		System.out.println("In this test case there is are mostly passive cards in the current hand.\nDefensive strategy chooses best card possible to use with a defensive > passive > attack > discard priority.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(passive);
		playerSetup(passive);
		System.out.println("TEST CASE 5:");
		System.out.println("In this test case there is are no defensive cards in the current hand.\nDefensive strategy chooses best card possible to use with a defensive > passive > attack > discard priority.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(noDefense);
		playerSetup(noDefense);
		System.out.println("TEST CASE 6:");
		System.out.println("In this test case there are no defensive or passive cards in the current hand.\nDefensive strategy chooses best card possible to use with a defensive > passive > attack > discard priority.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(noDefenseNoPassive);
		playerSetup(noDefenseNoPassive);
		System.out.println("TEST CASE 7:");
		System.out.println("In this test case there are no affordable cards in the current hand.\nDefensive strategy chooses best card possible to use with a defensive > passive > attack > discard priority.\nDumb strategy will choose first legal move or discard if no legal moves.\n");
		printCards(cantAfford);
		playerSetup(cantAfford);
		
		closingMessage();
		
	}
	/**
	 * Closing Messages
	 */
	public static void closingMessage(){
		System.out.println("There is some extra code in this project that is not currently being used.");
		System.out.println("That code is there incase this game needs to be taken to the next level of implementation.");
		System.out.println("I designed this project with a mindset of making something that could easily be turned");
		System.out.println("into a playable product.");
		System.out.println("Audios!");
	}
	
	/**
	 * Creates players and starts game
	 * @param hand
	 */
	public static void playerSetup(Card [] hand){
		Player dumby = new Player(hand);
		Player defensive = new Player(hand);
		startGame(dumby, defensive);
		
	}
	
	/**
	 * Prints player hands
	 * @param cards
	 */
	public static void printCards(Card [] cards){
		System.out.println("The current hand");
		for(int i = 0; i < cards.length; i++){
			System.out.println("Card " + i + ": " + cards[i].toString());
		}
	}
	
	
	/**
	 * The actual implementation of the game on a single move basis
	 * @param dumby
	 * @param defensive
	 */
	public static void startGame(Player dumby, Player defensive){
		
<<<<<<< HEAD
		Move move = new Move();
		
		
		move = move.pickAnyMove(dumby);
		if(move.getMove() != null){
			System.out.println("\nDumb Strategy chooses: " + move.getMove().toString());
		}else{
			System.out.println("\nDumb Strategy chooses to discard.");
		}
		
		move = move.pickStrategicMove(defensive);
		if(move.getMove() != null){
			System.out.println("Defensive Strategy chooses: " + move.getMove().toString() + "\n\n------------------------------------------------------------------------------------\n------------------------------------------------------------------------------------\n");
		}else{
			System.out.println("Defensive Strategy chooses to discard.\n\n------------------------------------------------------------------------------------\n------------------------------------------------------------------------------------\n");
=======
		while(!winCondition(user, computer)){
			// test commit
>>>>>>> 3ba02517f11c7a38f8aef5c5c7dacd179bba2439
		}
		
		
	}
	
	/**
	 * not used, put in place for future implementation
	 * @param user
	 * @param computer
	 * @return
	 */
	public static boolean winCondition(Player user, Player computer){
		
		if(user.getCastle() >= 100 || computer.getCastle() <= 0){
			// user wins
			return true;
		}else if(user.getCastle() <= 0 || computer.getCastle() >= 100){
			// computer wins
			return true;
		}
		
		return false;
	}
	
}

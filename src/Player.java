/**
 * Player class taht definse the attributes of a player with accesible methods
 * @author cbentson
 *
 */
public class Player {
	int builders, bricks, soldiers, weapons, magic, crystals,
		castle, fence;
	//Deck deck;
	Card [] hand;

	public Player(Card [] hand){
		this.builders = 10;
		this.bricks = 10;
		this.soldiers = 10;
		this.weapons = 10;
		this.magic = 10;
		this.crystals = 10;
		this.castle = 30;
		this.fence = 10;
//		this.deck = getDeck();
//		try {
//			this.hand = setHand(deck);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.hand = hand;
	}


	public int hasThisResource(String resource){
		switch(resource){
		case "builders": return this.getBuilders();
		case "bricks": return this.getBricks();
		case "soldiers": return this.getSoldiers();
		case "swords": return this.getWeapons();
		case "magic": return this.getMagic();
		case "crystals": return this.getCrystals();
		default: return -1;
		}
	}
	
	public int getBuilders() {
		return builders;
	}

	public void setBuilders(int builders) {
		this.builders = builders;
	}

	public int getBricks() {
		return bricks;
	}

	public void setBricks(int bricks) {
		this.bricks = bricks;
	}

	public int getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(int soldiers) {
		this.soldiers = soldiers;
	}

	public int getWeapons() {
		return weapons;
	}

	public void setWeapons(int weapons) {
		this.weapons = weapons;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getCrystals() {
		return crystals;
	}

	public void setCrystals(int crystals) {
		this.crystals = crystals;
	}

	public int getCastle() {
		return castle;
	}

	public void setCastle(int castle) {
		this.castle = castle;
	}

	public int getFence() {
		return fence;
	}

	public void setFence(int fence) {
		this.fence = fence;
	}
	
	public Deck getDeck(){
		Deck deck = new Deck();
		deck.createDeck();
		return deck;
	}
	
	public Card [] getHand(){
		return this.hand;
		
	}

	

	@Override
	public String toString() {
		return "Player [builders=" + builders + ", bricks=" + bricks + ", soldiers=" + soldiers + ", weapons=" + weapons
				+ ", magic=" + magic + ", crystals=" + crystals + ", castle=" + castle + ", fence=" + fence + "]";
	}
	
	
	
	
}

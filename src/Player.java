
public class Player {
	int builders, bricks, soldiers, weapons, magic, crystals,
		castle, fence;
	Strategy strategy;

	public Player(Strategy strategy){
		this.builders = 2;
		this.bricks = 5;
		this.soldiers = 2;
		this.weapons = 5;
		this.magic = 2;
		this.crystals = 5;
		this.castle = 30;
		this.fence = 10;
		this.strategy = strategy;
		getDeck();
		setHand();
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
	
	public void getDeck(){
		// pulls from the players pre-defined card deck
	}
	
	public void setHand(){
		// randomly pulls 8 cards from the deck
	}

	@Override
	public String toString() {
		return "Player [builders=" + builders + ", bricks=" + bricks + ", soldiers=" + soldiers + ", weapons=" + weapons
				+ ", magic=" + magic + ", crystals=" + crystals + ", castle=" + castle + ", fence=" + fence + "]";
	}
	
	
	
	
}

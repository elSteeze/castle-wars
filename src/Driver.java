/**
 * driver class for castle wars game
 * @author cbentson
 *
 */
public class Driver {
	public static void main(String args[]){
		playerSetup();
		
	}
	
	
	public static void playerSetup(){
		String userStrat = "user";
		String computerStrat = "defensive";
		Player user = new Player(userStrat);
		Player computer = new Player(computerStrat);
		startGame(user, computer);
		
	}
	
	public static void startGame(Player user, Player computer){
		
		while(!winCondition(user, computer)){
			
		}
	}
	
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

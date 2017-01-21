/**
 * The bread and butter!
 * Here is the strategy interface and move class that implements the defensive and dumb strategies
 */
import java.util.ArrayList;

public interface Strategy {
	public Move pickStrategicMove(Player player);
	public Move pickAnyMove(Player player);
}


/**
 * Move class that implements strategy
 * @author cbentson
 *
 */
class Move implements Strategy{
	Card move;
	
	public Move(){
		this.move = null;
	}
	
	public void setMove(Card move){
		this.move = move;
	}
	
	public Card getMove(){
		return this.move;
	}
	
	/**
	 * The strategic move method that chooses a strategic move
	 */
	@Override
	public Move pickStrategicMove(Player player) {
		Move move = new Move();
		
		Card [] hand = player.getHand();
		Card card = null;
		ArrayList<Card> possibleDefensiveMoves = new ArrayList<Card>();
		ArrayList<Card> possiblePassiveMoves = new ArrayList<Card>();
		ArrayList<Card> possibleAttackMoves = new ArrayList<Card>();
		
		for(int i = 0; i < hand.length; i++){
			card = hand[i];
			String type = card.getType();

			
			if(type == "Defensive" && player.hasThisResource(card.getRequiredResourceType()) >= card.getRequiredResourceValue()){	
				possibleDefensiveMoves.add(card);
			}else if(type == "Passive" && player.hasThisResource(card.getRequiredResourceType()) >= card.getRequiredResourceValue()){	
				possiblePassiveMoves.add(card);
			}else if(type == "Aggresive" && player.hasThisResource(card.getRequiredResourceType()) >= card.getRequiredResourceValue()){	
				possibleAttackMoves.add(card);
			}
		}
		
		// find best move
		Card bestCard = null;
		
		if(!possibleDefensiveMoves.isEmpty()){
			
			int highestResourceRequired = 0;			
			
			for(int i = 0; i < possibleDefensiveMoves.size(); i++){
				if(possibleDefensiveMoves.get(i).requiredResourceValue > highestResourceRequired){
					highestResourceRequired = possibleDefensiveMoves.get(i).getRequiredResourceValue();
					bestCard = possibleDefensiveMoves.get(i);
				}
			}
			
			move.setMove(bestCard);
			
		}else if(!possiblePassiveMoves.isEmpty()){
			
			int highestResourceRequired = 0;
			
			for(int i = 0; i < possiblePassiveMoves.size(); i++){
				if(possiblePassiveMoves.get(i).requiredResourceValue > highestResourceRequired){
					highestResourceRequired = possiblePassiveMoves.get(i).getRequiredResourceValue();
					bestCard = possiblePassiveMoves.get(i);
				}
			}
			
			move.setMove(bestCard);
			
		}else if(!possibleAttackMoves.isEmpty()){
			
			int highestResourceRequired = 0;
			
			for(int i = 0; i < possibleAttackMoves.size(); i++){
				if(possibleAttackMoves.get(i).requiredResourceValue > highestResourceRequired){
					highestResourceRequired = possibleAttackMoves.get(i).getRequiredResourceValue();
					bestCard = possibleAttackMoves.get(i);
				}
			}
			
			move.setMove(bestCard);
			
		}else{
			move.setMove(bestCard);
		}
		
		return move;
	}
	
	
	/**
	 * Returns any valid move for dumby strategy
	 */
	@Override
	public Move pickAnyMove(Player player){
		Move move = new Move();
		Card [] hand = player.getHand();
		Card card = null;
		int resourceValue;
		String resourceType;
		for(int i = 0; i < hand.length; i++){
			card = hand[i];
			resourceValue = card.getRequiredResourceValue();
			resourceType = card.getRequiredResourceType();
			
			if(player.hasThisResource(resourceType) >= resourceValue){	// returns first legal card
				move.setMove(card);
				return move;
			}
		}
		
		return move;
	}
	
	
}
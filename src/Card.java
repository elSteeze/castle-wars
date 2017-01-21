/**
 * The Card class that defines the attributes of a card with appropriate methods to access card
 * @author cbentson
 *
 */
public class Card {
	String requiredResourceType;
	int requiredResourceValue;
	String cardName, type;
	
//	Action action;
	
	public Card(String requiredResourceType, int requiredResourceValue, 
			String cardName, String type){
//		this.action = null;
		this.cardName = cardName;
		this.requiredResourceType = requiredResourceType;
		this.requiredResourceValue = requiredResourceValue;
		this.type = type;
	}

	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getRequiredResourceType() {
		return requiredResourceType;
	}

	public void setRequiredResourceType(String requiredResourceType) {
		this.requiredResourceType = requiredResourceType;
	}

	public int getRequiredResourceValue() {
		return requiredResourceValue;
	}

	public void setRequiredResourceValue(int requiredResourceValue) {
		this.requiredResourceValue = requiredResourceValue;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

//	public Action getAction() {
//		return action;
//	}

//	public void setAction(Action action) {
//		this.action = action;
//	}

	@Override
	public String toString() {
		return "Card [requiredResourceType=" + requiredResourceType + ", requiredResourceValue=" + requiredResourceValue
				+ ", cardName=" + cardName + "]";
	}
	
	
	
}

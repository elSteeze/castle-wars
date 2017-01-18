
public class Card {
	Resource requiredResourceType;
	int requiredResourceValue;
	String cardName;
	Action action;
	
	public Card(Resource requiredResourceType, int requiredResourceValue, 
			String cardName, Action action){
		this.action = action;
		this.cardName = cardName;
		this.requiredResourceType = requiredResourceType;
		this.requiredResourceValue = requiredResourceValue;
	}

	public Resource getRequiredResourceType() {
		return requiredResourceType;
	}

	public void setRequiredResourceType(Resource requiredResourceType) {
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

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Card [requiredResourceType=" + requiredResourceType + ", requiredResourceValue=" + requiredResourceValue
				+ ", cardName=" + cardName + ", action=" + action + "]";
	}
	
	
	
}

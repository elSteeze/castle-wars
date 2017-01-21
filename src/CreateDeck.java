/**
 * Not actually used, in place for future implementation
 */
import sun.misc.Queue;

public interface CreateDeck {
	public Deck createDeck();
}

class Deck implements CreateDeck{
	Queue<Card> deck;
	
	public Deck(){
		this.deck = new Queue<Card>();
	}
	
	public Queue<Card> getDeck(){
		return this.deck;
	}

	public void addCard(Card card){
		this.deck.enqueue(card);
	}
	
	public Card getNextCard(){
		try {
			return this.deck.dequeue();
		} catch (InterruptedException e) {
			Card card = null;
			e.printStackTrace();
			return card;
		}
	}
	
	public Card [] setHand(){
		Card [] hand = new Card[8];
		for(int i = 0; i < 8; i++){
			hand[i] = this.getNextCard();
		}
		
		return hand;
	}
	
	@Override
	public Deck createDeck(){
		Deck deck = new Deck();
		
		
		
		return deck;
	}
}


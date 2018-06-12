import Card;

public class Player{
    private Card card1;
    private Card card2;

    public Player(Card card1, Card card2){
	this.card1 = card1;
	this.card2 = card2;
    }

    public Card getCard1(){
	return this.card1;
    }
	
    public Card getCard2(){
	return this.card2;
    }
}

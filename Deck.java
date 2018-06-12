import java.util.List;
import java.util.ArrayList;
import Card;

public class Deck{
    
    private List<Card> cards;

    public Deck(){
	cards = new ArrayList();
	for (Color color : Color.values())
	    for(Value val : Value.value())
		cards.add(new Card(color,val));
    }

    public void remove(Card c){
	cards.remove(c);
    }
    
    public void getCards(){
	return this.cards;
    }
    
}

import java.util.List;
import java.util.ArrayList;

public class Game {
    private Deck deck;
    private int nbPlayer;
    
    private List<Card> inGame;
    private Player player;

    public Game(){
	this.deck = new Deck();
	this.nbPlayer = 0;
	this.inGame = new ArrayList();
    }

    public void addPlayer(){
	this.nbPlayer++;
    }

    public void foldPlayer(Card c1, Card c2){
	inGame.remove(c1);
	inGame.remove(c2);
	this.nbPlayer--;
    }

    public List<Combinaison> getPossibleCombinaisons(){
	List<Cards> allCards = new ArrayList();
	for (Card c : this.deck.getCards()) allCards.add(c);
	for (Card c : this.inGame) allCards.add(c);
	//TODO generate all the combinations of 5 cards included in allCards
    }


    private void playCard(Card c){
	this.deck.remove(c);
	this.inGame.add(c);
    }
    
    public void addFlop(Card c1, Card c2, Card c3){
	playCard(c1);
	playCard(c2);
	playCard(c3);
    }
    
    public void addTurn(Card c1){
	playCard(c1);
    }

    public void addRiver(Card c1){
	playCard(c1);
    }

    public void addPlayer(Player p){
	Card c1 = p.getCard1();
	Card c2 = p.getCard2();
	this.deck.remove(c1);
	this.deck.remove(c2);
	this.player = p;
    }
    
    
}

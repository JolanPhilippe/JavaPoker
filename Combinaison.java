//TODO imports

public enum TypeCombinaison{
    //TODO enum the type of combinaisons
}


class Combinaison{
    private List<Card> cards;
    private Card onCard;
    private TypeCombinaison typeCombinaison;

    public Combinaison(List<Card> cards){
	assert(cards.length() == 5);
	this.cards = cards;
	//TODO set the typeCombinaison value from the cards
	//TODO set the onCard value from the cards
    }

    //add GetterSetter on typeCombinaison and onCard

    //add a compareTo(Combinaison cb){...}
    
    
}

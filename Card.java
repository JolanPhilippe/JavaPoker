public enum Color {
    HEART, DIAMOND, SPADE, CLUB
}

public enum Value {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
    
    private int value;

    private Value(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Card {
    private Color color;
    private Value value;

    public Card(Color color, Value value){
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public int compareTo(Card card){
        if (this.value.getValue() < card.getValue().getValue())
            return -1;
        else
	    return (this.value.getValue() == card.getValue().getValue() ? 0 : 1);
    }

    @Override
    public boolean equals(Card c){
        return (c.getValue() == this.value && c.getColor() == this.color);
    }
}

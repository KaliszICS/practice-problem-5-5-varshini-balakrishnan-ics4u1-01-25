class Card implements Comparable<Card> {
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }
    public String getName() {
        return this.name;
    }
    public String getSuit() {
        return this.suit;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    @Override
    public String toString() {
        return this.name + " of " + this.suit;
    }
    @Override
    public int compareTo(Card card) {
        int thisSuit = suitValue(this.suit);
        int otherSuit = suitValue(card.suit);
        if (thisSuit != otherSuit) {
            return thisSuit - otherSuit;
        }
        int thisRank = rankValue(this.name);
        int otherRank = rankValue(card.name);
        return thisRank - otherRank;
    }
    public int suitValue(String suit) {
        if (suit.equals("Hearts")) return 0;
        if (suit.equals("Clubs")) return 1;
        if (suit.equals("Spades")) return 2;
        return 3;
    }
    public int rankValue(String name) {
        if(name.equals("Ace")) return 0;
        if(name.equals("2")) return 1;
        if(name.equals("3")) return 2;
        if(name.equals("4")) return 3;
        if(name.equals("5")) return 4;
        if(name.equals("6")) return 5;
        if(name.equals("7")) return 6;
        if(name.equals("8")) return 7;
        if(name.equals("9")) return 8;
        if(name.equals("10")) return 9;
        if(name.equals("Jack")) return 10;
        if(name.equals("Queen")) return 11;
        return 12;
    }
}
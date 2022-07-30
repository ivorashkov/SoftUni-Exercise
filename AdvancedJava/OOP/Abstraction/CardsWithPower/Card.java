package AdvancedJava.OOP.Abstraction.CardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardBank cardBank;

    public Card(CardSuit cardSuit, CardBank cardBank){
        this.cardSuit = cardSuit;
        this.cardBank = cardBank;
    }

    public int getPower(){
        return getCardSuit().getSuitPower() + getCardBank().getPowerBank();
    }


    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardBank getCardBank() {
        return cardBank;
    }

    public void setCardBank(CardBank cardBank) {
        this.cardBank = cardBank;
    }
}

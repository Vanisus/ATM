public class Card {

    private int pinCard;
    private double balanceCard;

    public Card(int pinCard, double balanceCard) {
        this.pinCard = pinCard;
        this.balanceCard = balanceCard;
    }

    public int getPinCard() {
        return pinCard;
    }

    public void setPinCard(int pinCard) {
        this.pinCard = pinCard;
    }
    public double getBalanceCard() {
        return balanceCard;
    }

    public void setBalanceCard(double balanceCard) {
        this.balanceCard = balanceCard;
    }
}

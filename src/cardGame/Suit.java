package cardGame;
//https://www.youtube.com/watch?v=5FxWZOV3f9A&list=PLlmV8hCw8wblhfOeesNFABDq4gQHc2CL_&ab_channel=hundredvisionsguy
public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    private final String suitText;

    private Suit(String suitText) {
        this.suitText = suitText;
    }

    public String printSuit() {
        return suitText;
    }
}

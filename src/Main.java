public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();

        myDeck.shuffle();  // Mezcla el deck
        myDeck.head();     // Muestra la primera carta y la elimina
        myDeck.pick();     // Muestra una carta aleatoria y la elimina
        myDeck.hand();     // Muestra 5 cartas y las elimina
    }
}

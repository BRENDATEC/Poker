import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> deck;

    // Constructor de la clase Deck
    public Deck() {
        deck = new ArrayList<>();
        String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
        String[] colores = {"Negro", "Rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Crear todas las cartas y añadirlas al deck
        for (String palo : palos) {
            String color = palo.equals("Corazones") || palo.equals("Diamantes") ? "Rojo" : "Negro";
            for (String valor : valores) {
                deck.add(new Card(palo, color, valor));
            }
        }
    }

    // Método shuffle para mezclar el deck
    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("SHUFFLE");
        System.out.println("Se mezcló el Deck.");
    }

    // Método head para mostrar la primera carta del deck
    public void head() {
        if (!deck.isEmpty()) {
            Card firstCard = deck.remove(0);
            System.out.println("HEAD - Primera Carta ");
            System.out.println(firstCard);
            System.out.println("Quedan " + deck.size() + " cartas en deck");
        }
    }

    // Método pick para seleccionar una carta al azar
    public void pick() {
        if (!deck.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(deck.size());
            Card pickedCard = deck.remove(randomIndex);
            System.out.println("Pick - Carta Random");
            System.out.println(pickedCard);
            System.out.println("Quedan " + deck.size() + " cartas en deck");
        }
    }

    // Método hand para devolver un arreglo de cinco cartas
    public void hand() {
        System.out.println("HAND - 5 Cartas");
        if (deck.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println("Quedan " + deck.size() + " cartas en deck");
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {
    public String palo;
    public String color;
    public String valor;

    public Card(String palo1, String color1, String valor1){
        this.palo = palo1;
        this.color = color1;
        this.valor = valor1;

    }

    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }

}

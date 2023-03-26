//IMPORTACIÓN DE LAS LIBRERÍAS DE USO DEL SISTEMA
import java.util.Collection;
import java.util.ArrayList;
public class Card {
    //CREACIÓN DE LOS ARREGLOS DE USO DEL SISTEMA
    public static final String[] equivalencias = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static final String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
    //DEFINICIÓN DE LAS VARIABLES DE USO DEL SISTEMA
    private String equivalencia;
    private String palo;
    private String colores;

    //DEFINICIÓN DEL CONSTRUCTOR DE USO DEL SISTEMA
    public Card(String palo, String color, String equivalencia) {
        this.palo = palo;
        this.equivalencia = equivalencia;
        this.colores = color;
    }

    public String getPalo() {
        return palo;
    }

    public String getEquivalencia() {
        return equivalencia;
    }

    public String getColores() {
        return colores;
    }

    @Override
    public String toString() {
        return palo + "," + colores + "" + equivalencia;

    }
}

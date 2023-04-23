import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int eleccion;
        Deck jugador1 = new Deck();
        Desglose desglose = new Desglose();
        eleccion = desglose.mostrarM();
        while (eleccion != 6) {
            if (eleccion == 1) {
                jugador1.Head();
            } else if (eleccion == 2) {
                jugador1.Pick();
            } else if (eleccion == 3) {
                jugador1.Hand();
            } else if (eleccion==4) {
                jugador1.Shuffle();
            } else if (eleccion==5) {
                jugador1.CambiarCarta();
            }
            else {
                System.out.println("Opción invalida");
            }
            eleccion = Integer.parseInt(JOptionPane.showInputDialog("Favor de elegir una nueva opción para el juego de poker\n1) Head\n2)Pick\n3)Hand\n4) Shuffle\n5) Cambiar cartas\n6) Salir"));
        }
    }
    }

import javax.swing.*;

public class Desglose {

    public Desglose() {

    }

    public int mostrarM() {
        int eleccion = 0;
        try {
            eleccion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al juego de poker, favor de elegir la opción que desee\n1) Head\n2) Pick\n3) Hand\n4) Shuffle\n5) Cambiar cartas\n6) Salir"));
        } catch (Exception e) {
            System.out.println("Opción incorrecta: ");
            eleccion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción válida: \n1) Head\n2) Pick\n3) Hand\n4) Shuffle\n5) Cambiar cartas\n6) Salir"));
        }
        return eleccion;
    }
}

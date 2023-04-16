import java.io.Console;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String respuesta;

        System.out.println("Bienvenido al sistema de cálculo e índole aritmética, ¿Qué desea hacer?");
        respuesta = JOptionPane.showInputDialog(("a) Conocer los valores del círculo \nb) Conocer los valores del cuadrado \nc) Conocer los valores del triángulo \nd) Conocer los valores del rectangulo"));
        if(respuesta.equals("a")) {
            int valorR;
            valorR = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del radio del circulo: "));
            Circle circle = new Circle(valorR);
            System.out.println("El área implicada del círculo, es " + circle.area());
            System.out.println("El perímetro implicado del círculo, es " + circle.perimeter());
        } else if (respuesta.equals("b")) {
            int L;
            L = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del side Lenght:"));
            Square square = new Square(L);
            System.out.println("El área implicada del cuadrado, es " + square.area());
            System.out.println("El perímetro implicado del cuadrado, es " + square.perimeter());
        } else if (respuesta.equals("c")) {
            int T;
            T = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del side Lenght:"));
            Triangle triangle = new Triangle(T);
            System.out.println("El área implicada del triángulo, es " + triangle.area());
            System.out.println("El perímetro implicado del triángulo, es " + triangle.perimeter());
        } else if (respuesta.equals("d")) {
            int L1, L2, L3, L4;
            L1 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del lado 1:"));
            L2 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del lado 2:"));
            L3 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del lado 3:"));
            L4 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el valor del lado 4:"));
            rectangle Rectangle = new rectangle(L1,L2,L3,L4 );
            System.out.println("El área implicada del rectángulo, es " + Rectangle.area());
            System.out.println("El perímetro implicado del rectángulo, es " + Rectangle.area());
        }
        else {
            System.out.println("Vuelva pronto");
        }
    }
}
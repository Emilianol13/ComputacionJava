import javax.swing.JOptionPane;
public class A5 {
    public static void main(String[] args) {
        int numU1, numU2;
        float sumaT, restaT, multT, divT, resT;

        //INGRESO DE NÚMEROS AL SISTEMA
        numU1 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el primer número: "));
        numU2 = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el segundo número: "));

        //OPREACIONES CON LOS NÚMEROS
        sumaT = numU1 + numU2;
        restaT = numU1 - numU2;
        multT = numU1 * numU2;
        divT = numU1 / numU2;
        resT = numU1 % numU2;

        //IMPRESIÓN DEL RESULTADO DE LAS OPERACIONES
        System.out.println("El resultado de la suma es: "+sumaT);
        System.out.println("El resultado de la resta es: "+restaT);
        System.out.println("El resultado de la multiplicación es: "+sumaT);
        System.out.println("El resultado de la división es: "+divT);
        System.out.println("El resultado del residuo es: "+resT);
    }
}

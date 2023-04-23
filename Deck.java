//IMPORTACIÓN DE LAS LIBRERÍAS DE USO DEL SISTEMA
import javax.swing.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
public class Deck {
    //CREACIÓN DE LA LISTA DE USO DEL SISTEMA
    public String [] paloI = {"Treboles","Corazones","Picas","Diamanates"};
    public String [] valorI = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
    public String [] colorI = {"Negro","Rojo"};
    public ArrayList<Card> CartasI;
    Random random = new Random();

    //DEFINCIÓN DEL COSNTRUCTOR DE LA LISTA
    public Deck(){
        String palo = "";
        String color = "";
        String valor = "";
        CartasI = new ArrayList<>(52);
        for( int i = 0; i < paloI.length; i++){
            palo = paloI[i];
            if (palo.equals("Treboles")){
                color = colorI[0];
            }else if (palo.equals("Corazones")){
                color = colorI[1];
            }else if(palo.equals("Picas")){
                color = colorI[0];
            }
            else if(palo.equals("Diamantes")){
                color = colorI[1];
            }
            for(int x = 0; x < valorI.length; x++){
                valor = valorI[x];
                CartasI.add(new Card(palo, color, valor));             }
            Collections.shuffle(CartasI);}
    }

    //DESGLOSE DE LAS FUNCIONES DEL SISTEMA CON BASE AL USO DEL DECK
    public void Head() throws Exception{
        //IMPLICACIÓN DEL COLLECTION FRAMEWORK DENTRO DEL MÉTODO HEAD
        if(CartasI.size()==0 || CartasI.size()<1) {
        throw new Exception("Se han agotado las cartas");
        }
        Card cardU = CartasI.remove(0);
        System.out.println(cardU.getPalo() + "," + cardU.getEquivalencia() + "," + cardU.getColores() + ",");
        System.out.println("Se disponen de:  " + CartasI.size() + " cartas implicadas dentro del Deck");
        }


    public void Pick() throws Exception{
        //DEFINCIÓN DEL ÍNDICE IMPLICADO DENTRO DEL SISTEMA PARA LA FUNCIÓN Y GENERACIÓN DE PARÁMETROS DE ACCIÓN ALEATORIOS
        if(CartasI.size()==0 || CartasI.size()<1) {
            throw new Exception("Se han agotado las cartas");
        }
            int indiceU = random.nextInt(this.CartasI.size());
            Card cardI = CartasI.remove(indiceU);
            System.out.println(cardI.getPalo() + "," + cardI.getEquivalencia() + "," + cardI.getColores() + ",");
            System.out.println("Se disponen de " + CartasI.size() + " cartas dentro del Deck");
        }



    public void Shuffle(){
        Collections.shuffle(CartasI);
        System.out.println("El Deck ha sido mezclado correctamente");
    }

    public ArrayList<Card> Hand() throws Exception{

            ArrayList<Card> HandU = new ArrayList<Card>();
            //RECORRIDO DEL MÉTODO DEL SISTEMA CON BASE AL USO Y DISPOSICIÓN DE UNA ESTRUCTURA DE REPETICIÓN FOR
        if(CartasI.size()==0 || CartasI.size()<1) {
            throw new Exception("Se han agotado las cartas");
        }
        for (int j = 0; j < 5; j++) {
                Card cardU = CartasI.remove(0);
                HandU.add(cardU);
                System.out.println(cardU.getPalo() + "," + cardU.getEquivalencia() + "," + cardU.getColores() + ",");
            }
            System.out.println("Se disponen de: " + CartasI.size() + " cartas dentro del Deck");
            return HandU;
        }

    public void CambiarCarta() throws Exception {
        if(CartasI.size()==0 || CartasI.size()<1) {
            throw new Exception("Se han agotado las cartas");
        }
            int cambioC = Integer.parseInt(JOptionPane.showInputDialog("Favor de ingresar el número de cartas sobre el cual desea hacer el cambio, recuerde que es entre el 0 y el 5: "));
            for (int i = 0; i < cambioC; i++) {
                int indiceU = random.nextInt(this.CartasI.size());
                Card cardI = CartasI.remove(indiceU);
                System.out.println(cardI.getPalo() + "," + cardI.getEquivalencia() + "," + cardI.getColores() + ",");
            }
            System.out.println("Se disponen de " + CartasI.size() + " cartas dentro del Deck");
            System.out.println("Se hizo el cambio correcto de: " + cambioC + " cartas");
    }

    //IMPLICACIÓN DEL MÉTOOD QUE PERMITE OBTENER EL NÚMERO DE CARTAS DEL SISTEMA
    public int numCartas(){
        return CartasI.size();
    }
}


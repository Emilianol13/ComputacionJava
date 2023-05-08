import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Interfaz {

         //DEFINICIÓN DE LA LISTA DE USO DEL SISTEMA
        private List<String> jugadoresProf = new ArrayList<>();
        //LLENADO DE LOS PARÁMETROS DE USODEL SISTEMA CON BASE AL USO DE LA LISTA
        public Interfaz() {
            jugadoresProf.add("Cristiano R");
            jugadoresProf.add("Messi");
            jugadoresProf.add("Mbappe");
            jugadoresProf.add("Modric");
            jugadoresProf.add("Benzema");
            jugadoresProf.add("Vinicius");
            jugadoresProf.add("Abedi");
            jugadoresProf.add("Pele");
            jugadoresProf.add("Johan");
            jugadoresProf.add("Milos");
        }
        //DEFINICIÓN DE LOS MÉTODOS DE ORDENAMIENTO POR LONGITUD
        public void SortOLCA() {
            jugadoresProf.sort(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return Integer.compare(s1.length(), s2.length());
                }
            });
        }

        public void SortOLEL() {
            jugadoresProf.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        }

        public void SortOLMR() {
            jugadoresProf.sort(Comparator.comparing(String::length));
        }

        //DEFINICIÓN DE LOS MÉTODOS DE ORDENAMIENTO ALFABÉTICO
        public void SortOACA() {
            jugadoresProf.sort(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareTo(s2);
                }
            });
        }

        public void SortOAEL() {
            jugadoresProf.sort((s1, s2) -> s1.compareTo(s2));
        }

        public void SortOAMR() {
            jugadoresProf.sort(String::compareTo);
        }

        //OBTENCIÓN E IMPLICACIÓN DE LOS PARÁMETROS DE LA LISTA
        public List<String> getListaDeCadenas() {
            return jugadoresProf;
        }

        public static void main(String[] args) {
            //DEFINICIÓN DE LA INTERFAZ DE TRABAJO IMPLICADA
            Interfaz recL = new Interfaz();

            //EJECUCIÓN DE LOS MODELOS DE ORDENAMIENTO POR LONIGTUD
            System.out.println("BIENVENIDO AL SISTEMA DE ORDENAMIENTO DE LISTAS, A CONTINUACIÓN SE MUESTAR EL MODELO DE ORDANAMIENTO POR LONGITUD: ");
            recL.SortOLCA();
            System.out.println("Implicación del ordenamiento por longitud con clase anónima: " + recL.getListaDeCadenas());
            recL.SortOLEL();
            System.out.println("Implicación del ordenamiento por longitud con expresión lambda: " + recL.getListaDeCadenas());
            recL.SortOLMR();
            System.out.println("Implicación del ordenamiento por longitud con método de referencia: " + recL.getListaDeCadenas());
            System.out.println("------------------------------------------------------------------------------------------------------------------------");

            //EJECUCIÓN DE LOS MODELOS DE ORDENAMIENTO POR DISPOSICIÓN ALFABÉTICA
            System.out.println("MODELO DE ORDENAMIENTO POR CUESTIÓN ALFABÉTICA: ");
            recL.SortOACA();
            System.out.println("Implicación del ordenamiento alfabético con clase anónima: " + recL.getListaDeCadenas());
            recL.SortOAEL();
            System.out.println("Implicación del ordenamiento alfabético con expresión lambda: " + recL.getListaDeCadenas());
            recL.SortOAMR();
            System.out.println("Implicación del ordenamiento alfabético con método de referencia: " + recL.getListaDeCadenas());
        }
    }


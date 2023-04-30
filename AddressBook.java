import java.io.*;
import java.util.*;

public class AddressBook {
    //DECLARACIÓN DE LAS VARIABLES DE USO DEL SISTEMA Y EL HASHMAP CORRESPONDIENTE
    private HashMap<String, String> contactosU;
    private String nombreA;

    //IMPLICACIÓN Y USO DEL CONSTRUCTOR DE USO DEL SISTEMA

    public AddressBook(String fileName) {
        this.nombreA = fileName;
        contactosU = new HashMap<String, String>();
    }

    //DESGLOSE DE LOS MÉTODOS DE USO DEL SISTEMA
    public void load() {
        try {
            File archivoI = new File(nombreA);
            if (archivoI.exists()) {
                Scanner scanner = new Scanner(archivoI);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(":");
                    contactosU.put(parts[0].trim(), parts[1].trim());
                }
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No fue posible establecer la carga correcta de la agenda telefónica");
        }
    }

    public void save() {
        try {
            FileWriter registro = new FileWriter(nombreA);
            for (String key : contactosU.keySet()) {
                registro.write(key + ": " + contactosU.get(key) + "\n");
            }
            System.out.println("Cambios guardados con éxito");
            registro.close();
        } catch (IOException e) {
            System.out.println("No fue posible hacer el guardado oportuno de la agenda telefónica");
        }
    }

    public void list() {
        System.out.println("Contactos:");
        for (String mostrar : contactosU.keySet()) {
            System.out.println(mostrar + " : " + contactosU.get(mostrar));
        }
    }

    public void create(String nombreU, String numU) {
        contactosU.put(numU, nombreU);
        System.out.println("Se ha creado el contacto: " +  " \nEl número de contacto es: " + numU + " \nEl nombre del contacto es: " + nombreU);
    }

    public void delete(String numU) {
        if (contactosU.containsKey(numU)) {
            String name = contactosU.remove(numU);
            System.out.println("El contacto ha sido eliminado: " + numU + " : " + name);
        } else {
            System.out.println("No existe el número telefónico dentro de la agenda");
        }
    }

    //DESGLOSE DEL MÉTODO DE MENÚ QUE PERMITE ESTABLECER LAS INTERACCIONES CON BASE A LOS MÉTODOS DE LA AGENDA DEL SISTEMA
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean cierre = false;
        while (!cierre) {
            System.out.println("Bienvenido al sistema telefónico, ¿Qué dese hacer?");
            System.out.println("1. Visualizar contactos");
            System.out.println("2. Agregar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Guardar cambios");
            System.out.println("5. Salir");
            System.out.print("Favor de ingresar una opción: ");
            int opcionU = scanner.nextInt();
            scanner.nextLine();
            switch (opcionU) {
                case 1:
                    list();
                    break;
                case 2:
                    System.out.print("Favor de ingresar el nombre del contacto: ");
                    String name = scanner.nextLine();
                    System.out.print("Favor de ingresar el número de teléfono del contacto: ");
                    String number = scanner.nextLine();
                    create(name, number);
                    break;
                case 3:
                    System.out.print("Favor de ingresar el número de teléfono del contacto a eliminar: ");
                    String numberToDelete = scanner.nextLine();
                    delete(numberToDelete);
                    break;
                case 4:
                    save();
                    break;
                case 5:
                     cierre= true;
                    break;
                default:
                    System.out.println("Opción incorrecta, favor de ingresar una opción válida");
                    break;
            }
        }
        scanner.close();
    }
}


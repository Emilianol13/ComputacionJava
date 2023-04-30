public class Main {
    public static void main(String[] args) {
        AddressBook accesoU = new AddressBook("agenda.txt");
        accesoU.load();
        accesoU.menu();
    }
}
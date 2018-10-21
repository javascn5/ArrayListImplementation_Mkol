//import java.util.List;

public class ArrayListImplementation {

    public static void main(String[] args) {
        CustomList<String> lista = new CustomList<>();

        lista.add("John");
        lista.add("Jenny");
        lista.add("Mikel");
        lista.add("Jenifer");
        lista.add("Dezyderiusz");
        lista.add("Mamma mia");
        lista.add("Great dragon");
        lista.add("Miki");
        lista.add("Anna");
        lista.add("Olaf");
        lista.add("Olaf");
        lista.add("Olaf");

        System.out.println("Wielkosc listy: " + lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + "\t" + lista.get(i));
        }

        lista.remove(2);

        System.out.println("\n");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + "\t" + lista.get(i));
        }
    }
}

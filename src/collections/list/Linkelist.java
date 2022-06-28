package collections.list;
import java.util.List;
import java.util.LinkedList;
public class Linkelist {
    public static void main(String[] args) {

        List<String > names = new LinkedList<String>();

        names.add("Joao");
        names.add("Maria");
        names.add("Kaio");
        names.add("Marcos");
        System.out.println(names);

        System.out.println(names.get(0)); // Pego pelo indice
        System.out.println(names.contains("Kaio")); // Verifico se o elemento existe

        names.set(0,"Marcos"); // Adiciono um elemento substituindo outro pelo indicie.
        System.out.println(names);

    }
}

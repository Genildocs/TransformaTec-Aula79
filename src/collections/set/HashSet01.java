package collections.set;
import java.util.LinkedHashSet;

public class HashSet01 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers01 = new LinkedHashSet<Integer>();

        numbers01.add(1);
        numbers01.add(2);
        numbers01.add(3);
        numbers01.add(1);
       System.out.println("Number01 " + numbers01);
        LinkedHashSet<Integer> numbers02 = new LinkedHashSet<Integer>();

        numbers02.add(2);
        numbers02.add(4);
        numbers02.add(3);
        numbers02.add(1);
        System.out.println("Number02 " + numbers02);

        numbers01.addAll(numbers02);
        System.out.println(numbers02);

    }
}

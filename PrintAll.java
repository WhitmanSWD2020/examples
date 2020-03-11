import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class PrintAll {
    public static void printAll(Iterable list) { // Make this more reusable
         for (Object obj : list) {
             System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        TreeSet<String> alist = new TreeSet<>();
        for (String a : args) {
            alist.add(a);
        }
        printAll(alist);
        printAll(Arrays.asList(args));
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A","B","C","D","E");
        names.sort((a,b)->a.compareTo(b));
        System.out.println(names);
    }
}

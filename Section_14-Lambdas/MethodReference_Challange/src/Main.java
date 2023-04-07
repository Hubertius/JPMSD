import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    private static Random rand = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carol", "Mark", "Anthony"};

        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                String::toUpperCase,
                Main::reverse
        ));

        applyChanges(names, list);
    }

    private static void applyChanges(String[] names,
                                     List<UnaryOperator<String>> stringFunctions) {
        List<String> backedArray = Arrays.asList(names);
        for(var function: stringFunctions) {
            backedArray.replaceAll(s -> s.transform(function));
            System.out.println(Arrays.toString(names));

        }
    }

    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }
}
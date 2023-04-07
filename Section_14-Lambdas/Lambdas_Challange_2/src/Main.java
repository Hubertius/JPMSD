import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static Random rand = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carol", "Adam", "Martin"};
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s += " " + getChar('A', 'D') + ".");
        System.out.println("--> Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        Arrays.asList(names).forEach(System.out::println);
    }

    public static char getChar(char startChar, char endChar) {
        return (char) rand.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String getReversedName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
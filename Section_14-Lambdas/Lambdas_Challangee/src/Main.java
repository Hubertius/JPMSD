import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printWords = (sentence) -> {
            Arrays.asList(sentence.split("")).forEach(System.out::println);
        };
        printWords.accept("Let's split this up into an array");

        UnaryOperator<String> everySecondChar = (s -> {
            StringBuilder returnVal = new StringBuilder(s);
            for(int i = 0; i < s.length(); ++i) {
                if(i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        });
        System.out.println(everySecondChar.apply("123456789"));

        Supplier<String> iLoveJava = () -> "I'love Java!";
        System.out.println(iLoveJava.get());
    }
}
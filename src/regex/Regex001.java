package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {
    private static final Pattern pattern = Pattern.compile("p.*q");
    public static void main(String[] args) {
        validate("psq");
        validate("pasdfghjkq");
// kropka - dowolny znak
        // * dowolna liczba razy to co jest przezd tym znakiem

    }

    private static void validate(String text) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()){
            System.out.println("prawda");
        } else {
            System.out.println("Fałsz");
        }
    }
}

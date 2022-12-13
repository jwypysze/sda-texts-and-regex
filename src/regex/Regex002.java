package regex;

public class Regex002 {
    public static void main(String[] args) {
        RegexTester tester = new RegexTester("[A-Z][a-z]{1,}");
        tester.validate("Adfghjkl");
        tester.validate("AAgg");
        tester.validate("assdDDD");
        tester.validate("J");

    }
}

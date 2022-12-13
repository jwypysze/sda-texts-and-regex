package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex000 {

    public static void main(String[] args) {
        RegexTester tester = new RegexTester("pq*");
        tester.validate("p");
        tester.validate("pq");
        tester.validate("pqqqq");
        tester.validate("pqqqqrrrrr");
        tester.validate("qqqqq");
        tester.validate("asdfsadf");
    }

}
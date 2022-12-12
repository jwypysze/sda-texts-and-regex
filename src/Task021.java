import java.util.Scanner;

public class Task021 {
    private String text;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz tekst");
        String userText = scan.nextLine();
        boolean isPal = isPal(userText);
        System.out.println(isPal);
    }

    private static boolean isPal(String userText) {
        for (int i = 0; i<userText.length();i++){
            char currentCharacter = userText.charAt(i);
            if (currentCharacter!=userText.charAt(userText.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

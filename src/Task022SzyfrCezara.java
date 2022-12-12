import java.util.Scanner;

public class Task022SzyfrCezara {
    //szyfr cezara - każda litera przesuwana jest o 2 do przodu np. a -> c  z->b

    private static String encrypt(String text, int key) {
        text = text.toUpperCase();
        String encrypted = "";

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                int characterIndex = currentCharacter - (char) ('A');
                int characterShifted = (characterIndex + key) % 26 + (char) ('A');
                encrypted += ((char) (characterShifted));
            } else {
                encrypted += currentCharacter;
            }
        }
        return encrypted;
    }

    public static void main(String[] args) {
        String encryptedText = encrypt("MEZNY BADZ, CHRON PULK TWOJ I SZESC FLAG@@##123",2);
        System.out.println(encryptedText);
    }

}
